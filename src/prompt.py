memoryOperation = (
    "In Java programs, the typical examples over memory are as follows. You can determine which kinds of memory operations conducted by a method call according to"
    "the method name and its specification description. A method might induce multiple operations.\n"
)

memoryOpExamples = [
    '- memory read: If a method name or its specification description contains the word "get" or its synonyms, '
    "the method would read data from inner storage.\n",
    '- memory write: If a method name or its specification description contains the word "set" or its synonyms, '
    "the method would write data to inner storage.\n",
    '- deletion upon memory: If a method name or its specification description contains the word "remove" or its '
    "synonyms, the method would remove data from inner storage.\n",
    '- insertion upon memory: If a method name or its specification description contains the word "put" or its '
    "synonyms, the method would insert data to inner storage.\n",
]

memoryTypeQuestion_manualPrompt = "Please determine whether the method conducts the operation : memory read, memory write, deletion upon memory, and insertion upon memory. Give four yes/no in order as the answers. Do not need give more concrete explanation. Here is the example of output: Yes, No, Yes, Yes. Make sure that the answers are in one line and are seperated by comma.\n"

memoryTypeQuestion_autoPrompt_TwoTypes = "Please determine whether the method conducts the operation : memory read, memory write. Give two yes/no in order as the answer. Do not need give more concrete explanation. Here is the example of output: Yes, No. Make sure that the answers are in one line and are seperated by comma.\n"

memoryTypeQuestion_autoPrompt_FourTypes = "Please determine whether the method conducts the operation : memory read, memory write, deletion upon memory, insertion upon memory. Give four yes/no in order as the answers. Do not need give more concrete explanation. Here is the example of output: Yes, No, Yes, Yes. Make sure that the answers are in one line and are seperated by comma.\n"

writeMagicWordQuestion = "Assume that you are developing a Java method for a Java class. The method stores its parameter to the fields of the Java class. Please list several most-commonly used verbs that can be used in the method name. Remember that the listed words should be valid verbs in the English dictionary. List the verbs seperated by comma. Do not add other sentences. The verbs should be sorted according to your preference. The first one should be the best.\n"

readMagicWordQuestion = "Assume that you are developing a Java method for a Java class. The method loads a value stored in a class field and returns it as the return value. Please list several most-commonly used verbs that can be used in the method name. Remember that the listed words should be valid verbs in the English dictionary. List the verbs seperated by comma. Do not add other sentences. The verbs should be sorted according to your preference. The first one should be the best.\n"

insertMagicWordQuestion = "Assume that you are developing a Java method for a Java class. The method inserts its parameter to the fields of the Java class. Please list several most-commonly used verbs that can be used in the method name. Remember that the listed words should be valid verbs in the English dictionary. List the verbs seperated by comma. Do not add other sentences. The verbs should be sorted according to your preference. The first one should be the best.\n"

deleteMagicWordQuestion = "Assume that you are developing a Java method for a Java class. The method deletes a value from in a class field. Please list several most-commonly used verbs that can be used in the method name. Remember that the listed words should be valid verbs in the English dictionary. List the verbs seperated by comma. Do not add other sentences. The verbs should be sorted according to your preference. The first one should be the best.\n"


def getInitialPromptForMemoryOperationType(promptMode: str, magicWords={}):
    """
    Get the initial prompt for memory operation type
    Args:
        promptMode: The mode of prompting. manualPrompt or autoPrompt_fourTypes
        magicWords: The magic words obtained from the first stage of prompting

    Returns:
        The initial prompt for memory operation abstraction
    """

    if "manualPrompt" in promptMode:
        initialPrompt = memoryOperation
        for example in memoryOpExamples:
            initialPrompt += example
        return initialPrompt
    elif "autoPrompt_FourTypes" in promptMode:
        initialPrompt = memoryOperation
        initialPrompt += (
            "- memory read: If a method name or its specification description contains "
        )
        initialPrompt += magicWords["memory read"]
        initialPrompt += (
            " or its synonyms, the method would read data from inner storage.\n"
        )

        initialPrompt += "- memory write: If a method name or its specification description contains "
        initialPrompt += magicWords["memory write"]
        initialPrompt += (
            " or their synonyms, the method would write data to inner storage.\n"
        )

        initialPrompt += "- deletion upon memory: If a method name or its specification description contains "
        initialPrompt += magicWords["deletion upon memory"]
        initialPrompt += (
            " or their synonyms, the method would remove data from inner storage.\n"
        )

        initialPrompt += "- insertion upon memory: If a method name or its specification description contains the following "
        initialPrompt += magicWords["insertion upon memory"]
        initialPrompt += (
            " or their synonyms, the method would insert data to inner storage.\n"
        )
        return initialPrompt


def getQuestion(promptMode: str):
    """
    Get the question for memory operation abstraction
    Args:
        promptMode: The mode of prompting. manualPrompt or autoPrompt_fourTypes

    Returns:
        The question for memory operation abstraction
    """
    if "manualPrompt" in promptMode:
        return memoryTypeQuestion_manualPrompt
    elif "autoPrompt_FourTypes" in promptMode:
        return memoryTypeQuestion_autoPrompt_FourTypes
    else:
        print("error setting")
        exit(0)
