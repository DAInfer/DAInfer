import sys

from helper import *
from prompt import *
from openai import OpenAI
import nltk
from collections import Counter
import random
import config
import tiktoken

response = None
received = False


def retrieveMagicWords(promptMode, n, t1=1):
    """
    Retrieve typical verbs as magic words
    Args:
        promptMode: The mode of prompting. Manual or automatic.
        n: The parameter of self-consistency
        t1: The temperature of the first stage of prompting
    Returns:
        A list of typical verbs as magic words
    """

    results = {}
    if "manualPrompt" in promptMode:
        return {}
    elif "autoPrompt_FourTypes" in promptMode:
        messages = {
            "memory read": readMagicWordQuestion,
            "memory write": writeMagicWordQuestion,
            "deletion upon memory": deleteMagicWordQuestion,
            "insertion upon memory": insertMagicWordQuestion,
        }
    allMagicWords = []

    for i in range(n):
        for k in messages:
            isRecieved = False
            while not isRecieved:
                try:
                    message = messages[k]

                    s = ["AI"]
                    input = [
                        {
                            "role": "system",
                            "content": "You are a good Java programmer and are very good at choosing proper names for Java methods.",
                        },
                        {"role": "user", "content": message},
                    ]

                    client = OpenAI(api_key=config.global_openai_key)

                    response = client.chat.completions.create(
                        model="gpt-3.5-turbo", messages=input, temperature=t1
                    )

                    results[k] = response.choices[0].message.content
                    print(results[k])
                    isRecieved = True
                except:
                    error = sys.exc_info()[0]
                    print("API error:", sys.exc_info())

        singleMagicWords = {}
        wordtags = nltk.ConditionalFreqDist(
            (w.lower(), t)
            for w, t in nltk.corpus.brown.tagged_words(tagset="universal")
        )
        for k in results:
            singleMagicWords[k] = []
            words = results[k].split()
            for word in words:
                word = re.sub(r"[^A-Za-z]+", "", word)
                tags = dict(wordtags[word.lower()])
                if word == "":
                    continue
                isVerb = True
                if "VERB" in tags:
                    for tag in tags:
                        print(word, tag, tags[tag])
                        if tags[tag] > tags["VERB"]:
                            isVerb = False
                else:
                    isVerb = False
                if isVerb:
                    singleMagicWords[k].append(word.lower())
        print(singleMagicWords)
        allMagicWords.append(singleMagicWords)
    magicWords = {}
    for k in messages:
        wordScoreDic = {}
        for singleMagicWords in allMagicWords:
            cnt = 1
            print(singleMagicWords)
            for word in singleMagicWords[k]:
                cnt += 1
                if word not in wordScoreDic:
                    wordScoreDic[word] = 1.0 / cnt
                else:
                    wordScoreDic[word] += 1.0 / cnt
        print("wordScoreDic", wordScoreDic)
        magicWords[k] = max(wordScoreDic, key=wordScoreDic.get)
    print(magicWords)
    return magicWords


def retrieveMemoryOperationType(
    className: str,
    methodSig: str,
    methodDoc: str,
    magicWords: dict,
    promptMode: str,
    m,
    t2=1.0,
):
    """
    Retrieve memory operation types for the memory operation abstraction
    Args:
        className: The name of the class
        methodSig: The type signature of the method
        methodDoc: The semantic description of the method
        magicWords: The magic words obtained from the first stage of prompting
        promptMode: The mode of prompting. Manual or automatic.
        m: The parameter of self-consistency
        t2: The temperature of the second stage of prompting

    Returns:
        A dictionary of memory operation types
    """

    result = {}
    encoding = tiktoken.encoding_for_model("gpt-3.5-turbo")

    if "manualPrompt" in promptMode:
        for memoryType in {
            "memory read",
            "memory write",
            "deletion upon memory",
            "insertion upon memory",
        }:
            result[memoryType] = []
    elif "autoPrompt_FourTypes" in promptMode:
        for memoryType in magicWords:
            result[memoryType] = []

    for i in range(m):
        recieved = False
        singleResult = {}
        tryCnt = 0
        while not recieved:
            tryCnt += 1
            try:
                message = (
                    "Now we provide the specification description of the method "
                    + methodSig
                    + " in the class "
                    + className
                    + " as follows:\n"
                )
                message += methodDoc + "\n"
                message += getQuestion(promptMode)
                answerLength = None
                typeList = None

                if "manualPrompt" in promptMode:
                    systemContent = getInitialPromptForMemoryOperationType(promptMode)
                    answerLength = 4
                    typeList = [
                        "memory read",
                        "memory write",
                        "deletion upon memory",
                        "insertion upon memory",
                    ]
                elif "autoPrompt_FourTypes" in promptMode:
                    systemContent = getInitialPromptForMemoryOperationType(
                        promptMode, magicWords
                    )
                    answerLength = 4
                    typeList = [
                        "memory read",
                        "memory write",
                        "deletion upon memory",
                        "insertion upon memory",
                    ]
                else:
                    print("wrong setting")
                    exit(0)

                input = [
                    {"role": "system", "content": systemContent},
                    # {"role": "system", "content": ""},
                    {"role": "user", "content": message},
                ]

                client = OpenAI(api_key=config.global_openai_key)

                response = client.chat.completions.create(
                    model="gpt-3.5-turbo", messages=input, temperature=t2
                )
                output = response.choices[0].message.content

                print(
                    "OUITPUT:",
                    len(encoding.encode(systemContent)) + len(encoding.encode(message)),
                )
                config.LLMTokenCnt += len(encoding.encode(systemContent)) + len(
                    encoding.encode(message)
                )

                print("--------------------------------------------------------")
                print(
                    (
                        config.global_m,
                        config.global_n,
                        config.global_t1,
                        config.global_t2,
                    )
                )
                print(message)
                print(output)
                print("--------------------------------------------------------")
                outputs = output.split(",")
                if len(outputs) != answerLength:
                    recieved = False
                    if tryCnt > 10:
                        for memoryType in typeList:
                            singleResult[memoryType] = False
                        break
                    continue

                recieved = True
                i = 0
                for memoryType in typeList:
                    if "no" in outputs[i] or "No" in outputs[i]:
                        singleResult[memoryType] = False
                    elif "yes" in outputs[i] or "Yes" in outputs[i]:
                        singleResult[memoryType] = True
                    else:
                        singleResult[memoryType] = None
                        recieved = False
                    i += 1
            except:
                error = sys.exc_info()[0]
                print("API error:", sys.exc_info())
                recieved = False
                if tryCnt > 10:
                    for memoryType in typeList:
                        singleResult[memoryType] = False
                        break
        for memoryType in singleResult:
            result[memoryType].append(singleResult[memoryType])

    for memoryType in result:
        result[memoryType] = Counter(result[memoryType]).most_common()
        if len(result[memoryType]) == 1:
            result[memoryType] = result[memoryType][0][0]
        else:
            result[memoryType] = random.choice(result[memoryType])[0]
    return result


if __name__ == "__main__":
    loadMagicWords, storeMagicWords = retrieveMagicWords("manualPrompt", 5)
    print(loadMagicWords)
    print(storeMagicWords)
