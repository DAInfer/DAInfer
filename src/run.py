import sys

from docParser import *
from gpt import *
from config import *
from difflib import SequenceMatcher
import spacy
import nltk
from omt import *
import concurrent.futures
import os
import json


def obtainCHADic(methodDoc: dict):
    """
    Obtain the CHA dictionary from the methodDoc
    Args:
        methodDoc: The documentation model

    Returns:
        The CHA dictionary
    """
    CHADic = {}
    for package_name in methodDoc:
        for class_name in methodDoc[package_name]:
            print(package_name)
            classInfo = methodDoc[package_name][class_name]
            print(classInfo)
            CHADic[class_name] = classInfo["super class"]
    return CHADic


def constructFullMethodDic(methodDoc: dict, CHADic: dict):
    """
    Construct the full method dictionary
    Args:
        methodDoc: The documentation model
        CHADic: The CHA dictionary

    Returns:
        Flatten the documentation model
    """
    fullMethodDoc = {}
    for package_name in methodDoc:
        fullMethodDoc[package_name] = {}
        for class_name in methodDoc[package_name]:
            fullMethodDoc[package_name][class_name] = copy.deepcopy(
                methodDoc[package_name][class_name]
            )
            if class_name not in CHADic:
                continue
            for super_class in CHADic[class_name]:
                for package_name1 in methodDoc:
                    for class_name1 in methodDoc[package_name1]:
                        if super_class == class_name1:
                            fullMethodDoc[package_name][class_name]["methods"].update(
                                methodDoc[package_name1][class_name1]["methods"]
                            )
    return fullMethodDoc


def inferTypeConsistentSpecFromJavaDoc(
    methodDoc, CHADic, projectName, methodInfoResult_path
):
    """
    Infer type consistent specifications from JavaDoc
    Args:
        methodDoc: The documentation model
        CHADic: The class hierarchy dictionary
        projectName: The name of the project
        methodInfoResult_path: dump path
    """
    def isBlockedMethod(method: str):
        blockMethodNames = {"equals", "clone", "toString"}
        for s in blockMethodNames:
            if s in method:
                return True
        return False

    resultPath = methodInfoResult_path + projectName + "/"
    allTypeConsistentSpec = {}
    allCriticalMethods = {}
    cnt = 0
    method_cnt = 0

    for package_name in methodDoc:
        for className in methodDoc[package_name]:
            classInfo = methodDoc[package_name][className]
            methods = list(classInfo["methods"].keys())

            methodRetParaDic = {}
            for methodSig in methods:
                print(package_name, methodSig)
                retType, methodName, paraList, paraNames = (
                    splitMethodSignatureFromJavaDoc(methodSig)
                )
                if retType is None:
                    continue
                methodRetParaDic[methodSig] = {}
                methodRetParaDic[methodSig]["return type"] = retType
                methodRetParaDic[methodSig]["method name"] = methodName
                methodRetParaDic[methodSig]["parameters"] = paraList

            os.makedirs(resultPath + className, exist_ok=True)
            with open(resultPath + className + "/methodRetParaDic.json", "w") as f:
                json.dump(methodRetParaDic, f, indent=4)

            typeConsistentSpecs = set([])
            criticalMethods = set([])
            for sig1 in methodRetParaDic:
                if isBlockedMethod(sig1):
                    continue
                for sig2 in methodRetParaDic:
                    if isBlockedMethod(sig2):
                        continue
                    if sig1 == sig2:
                        continue
                    for k in range(len(methodRetParaDic[sig2]["parameters"])):
                        if isPrimitiveType(methodRetParaDic[sig2]["parameters"][k]):
                            continue
                        if (
                            getTypeSimilarity(
                                methodRetParaDic[sig2]["parameters"][k],
                                methodRetParaDic[sig1]["return type"],
                                CHADic,
                            )
                            != -1
                        ):
                            typeConsistentSpecs.add((sig2, sig1))
                            criticalMethods.add(sig1)
                            criticalMethods.add(sig2)
                            break
                    for k in range(len(methodRetParaDic[sig1]["parameters"])):
                        if isPrimitiveType(methodRetParaDic[sig1]["parameters"][k]):
                            continue
                        if (
                            getTypeSimilarity(
                                methodRetParaDic[sig1]["parameters"][k],
                                methodRetParaDic[sig2]["return type"],
                                CHADic,
                            )
                            != -1
                        ):
                            typeConsistentSpecs.add((sig1, sig2))
                            criticalMethods.add(sig1)
                            criticalMethods.add(sig2)
                            break

            typeConsistentSpecDic = {"typeConsistentSpecs": list(typeConsistentSpecs)}
            with open(resultPath + className + "/typeConsistentSpecs.json", "w") as f:
                json.dump(typeConsistentSpecDic, f, indent=4)
            if package_name not in allTypeConsistentSpec:
                allTypeConsistentSpec[package_name] = {}
            if package_name not in allCriticalMethods:
                allCriticalMethods[package_name] = {}
            allTypeConsistentSpec[package_name][className] = typeConsistentSpecs
            allCriticalMethods[package_name][className] = criticalMethods
            cnt += len(allTypeConsistentSpec[package_name][className])
            method_cnt += len(allCriticalMethods[package_name][className])
    return allTypeConsistentSpec, allCriticalMethods, cnt, method_cnt


def inferMemOpConsistentSpecInLazyMode(
    preAcceptedSpecs: list,
    methodDoc: dict,
    projectName: str,
    methodInfoResult_path,
    magicWords,
    promptMode,
    gptMode,
    m,
    t2=1.0,
):
    """
    Lazy strategy of neuro-symbolic optimization. Apply memory operation abstraction on demand.
    Args:
        preAcceptedSpecs: The specifications satisfying the other three constraints:
            - semantic unit consistency
            - validity constraint
            - degree constraint
        methodDoc: The documentation model
        projectName: the name of the project
        methodInfoResult_path: the dump path
        magicWords: The typical verbs as magic words
        promptMode: The mode of prompting
        gptMode: The mode of GPT
        m: The parameter of self-consistency
        t2: The temperature of the second stage of prompting

    Returns:
        The final inferred specifications
    """
    resultPath = methodInfoResult_path + projectName + "/"
    memoryTypeFeature = {}
    acceptedSpecs = []

    isValid = False
    for mode in prompt_modes:
        if mode in promptMode:
            isValid = True
            break
    if not isValid:
        print("wrong setting")
        exit(0)

    if gptMode != "non-cache":
        subdirs = [
            d
            for d in os.listdir(resultPath)
            if os.path.isdir(os.path.join(resultPath, d))
        ]
        for subdir in subdirs:
            singleResultPath = resultPath + subdir + "/"
            if os.path.exists(singleResultPath + "memoryTypeFeature.json"):
                print(singleResultPath + "memoryTypeFeature.json")
                with open(singleResultPath + "memoryTypeFeature.json", "r") as f:
                    memoryTypeFeature[subdir] = json.load(f)

    cacheAllParameters = []
    history = set([])
    NThreads = 8

    for [packageName, className, sig1, sig2, opVal, conf, specStr] in preAcceptedSpecs:
        isIn1 = False
        isIn2 = False
        if className in memoryTypeFeature:
            if sig1 in memoryTypeFeature[className]:
                isIn1 = True
            if sig2 in memoryTypeFeature[className]:
                isIn2 = True
        if not isIn1:
            if className not in memoryTypeFeature:
                memoryTypeFeature[className] = {}
            if (
                className,
                sig1,
                methodDoc[packageName][className]["methods"][sig1],
            ) not in history:
                history.add(
                    (
                        className,
                        sig1,
                        methodDoc[packageName][className]["methods"][sig1],
                    )
                )
                cacheAllParameters.append(
                    (
                        className,
                        sig1,
                        methodDoc[packageName][className]["methods"][sig1],
                        magicWords,
                        promptMode,
                        m,
                        t2,
                        len(cacheAllParameters),
                    )
                )
        if not isIn2:
            if className not in memoryTypeFeature:
                memoryTypeFeature[className] = {}
            if (
                className,
                sig2,
                methodDoc[packageName][className]["methods"][sig2],
            ) not in history:
                history.add(
                    (
                        className,
                        sig2,
                        methodDoc[packageName][className]["methods"][sig2],
                    )
                )
                cacheAllParameters.append(
                    (
                        className,
                        sig2,
                        methodDoc[packageName][className]["methods"][sig2],
                        magicWords,
                        promptMode,
                        m,
                        t2,
                        len(cacheAllParameters),
                    )
                )

    # Parallel version
    def process_params(params):
        className, sig1, description, magicWords, promptMode, m, t2, indx = params

        return (
            className,
            sig1,
            retrieveMemoryOperationType(
                className, sig1, description, magicWords, promptMode, m, t2
            ),
        )

    # Create a thread pool executor with 5 threads
    with concurrent.futures.ThreadPoolExecutor(max_workers=NThreads) as executor:
        # Submit tasks to the executor
        futures = [
            executor.submit(process_params, params) for params in cacheAllParameters
        ]

        # Retrieve results as they become available
        for future in concurrent.futures.as_completed(futures):
            result = future.result()
            className, sig1, memoryOperationType = result
            memoryTypeFeature[className][sig1] = memoryOperationType
            print(len(cacheAllParameters))

    for [packageName, className, sig1, sig2, opVal, conf, specStr] in preAcceptedSpecs:
        if checkMemoryType(
            memoryTypeFeature[className][sig1],
            memoryTypeFeature[className][sig2],
            promptMode,
        ):
            acceptedSpecs.append(
                [packageName, className, sig1, sig2, opVal, conf, specStr]
            )

    for className in memoryTypeFeature:
        with open(resultPath + className + "/memoryTypeFeature.json", "w") as f:
            json.dump(memoryTypeFeature[className], f, indent=4)
    return acceptedSpecs


def inferMemOpConsistentSpecInEagerMode(
    methodDoc: dict,
    allTypeConsistentSpec: dict,
    allCriticalMethods: dict,
    CHADic: dict,
    projectName: str,
    methodInfoResult_path,
    magicWords,
    promptMode,
    gptMode,
    m,
    t2=1.0,
):
    """
    Eager strategy of neuro-symbolic optimization. Apply memory operation abstraction exhaustively.
    Args:
        methodDoc: The documentation model
        allTypeConsistentSpec: The specifications satisfying validity constraint and degree constraint
        allCriticalMethods: methods appering in the type consistent specifications
        CHADic: The class hierarchy dictionary
        projectName: The name of the project
        methodInfoResult_path: The dump path
        magicWords: The typical verbs as magic words
        promptMode: The mode of prompting
        gptMode: The mode of GPT
        m: The parameter of self-consistency
        t2: The temperature of the second stage of prompting

    Returns:
        The specifications satisfying validity constraint, degree constraint, and memory operation constraint
    """
    resultPath = methodInfoResult_path + projectName + "/"
    memoryTypeFeature = {}

    isValid = False
    for mode in prompt_modes:
        if mode in promptMode:
            isValid = True
            break
    if not isValid:
        print("wrong setting")
        exit(0)

    if gptMode != "non-cache":
        # Step 1(a): load the result from existing results
        subdirs = [
            d
            for d in os.listdir(resultPath)
            if os.path.isdir(os.path.join(resultPath, d))
        ]
        for subdir in subdirs:
            singleResultPath = resultPath + subdir + "/"
            # Open the JSON file for reading
            if os.path.exists(singleResultPath + "memoryTypeFeature.json"):
                print(singleResultPath + "memoryTypeFeature.json")
                with open(singleResultPath + "memoryTypeFeature.json", "r") as f:
                    memoryTypeFeature[subdir] = json.load(f)
    else:
        cacheAllParameters = []
        history = set([])
        NThreads = 8

        for package_name in methodDoc:
            for className in methodDoc[package_name]:
                if className not in allCriticalMethods:
                    continue
                criticalMethods = allCriticalMethods[package_name][className]
                memoryTypeFeature[className] = {}
                for methodSig in criticalMethods:
                    history.add(
                        (
                            className,
                            methodSig,
                            methodDoc[package_name][className]["methods"][methodSig],
                        )
                    )
                    cacheAllParameters.append(
                        (
                            className,
                            methodSig,
                            methodDoc[package_name][className]["methods"][methodSig],
                            magicWords,
                            promptMode,
                            m,
                            t2,
                            len(cacheAllParameters),
                        )
                    )

        def process_params(params):
            className, sig1, description, magicWords, promptMode, m, t2, indx = params

            return (
                className,
                sig1,
                retrieveMemoryOperationType(
                    className, sig1, description, magicWords, promptMode, m, t2
                ),
            )

        # Create a thread pool executor with 5 threads
        with concurrent.futures.ThreadPoolExecutor(max_workers=NThreads) as executor:
            # Submit tasks to the executor
            futures = [
                executor.submit(process_params, params) for params in cacheAllParameters
            ]

            # Retrieve results as they become available
            for future in concurrent.futures.as_completed(futures):
                result = future.result()
                className, sig1, memoryOperationType = result
                memoryTypeFeature[className][sig1] = memoryOperationType
                print(len(cacheAllParameters))

        for package_name in methodDoc:
            for className in methodDoc[package_name]:
                if className not in allCriticalMethods:
                    continue
                os.makedirs(os.path.join(resultPath, className), exist_ok=True)
                with open(resultPath + className + "/memoryTypeFeature.json", "w") as f:
                    json.dump(memoryTypeFeature[className], f, indent=4)

    allMemOpConsistentSpec = {}
    cnt = 0
    for packageName in allTypeConsistentSpec:
        for className in allTypeConsistentSpec[packageName]:
            typeConsistentSpec = allTypeConsistentSpec[packageName][className]
            memOpConsistentSpec = []
            for spec in typeConsistentSpec:
                (sig1, sig2) = spec
                if className not in memoryTypeFeature:
                    memoryTypeFeature[className] = {}
                if sig1 not in memoryTypeFeature[className]:
                    isAnalyzed = False
                    if className in CHADic:
                        for superClass in CHADic[className]:
                            if superClass in memoryTypeFeature:
                                for tmpSig in memoryTypeFeature[superClass]:
                                    if tmpSig == sig1:
                                        memoryTypeFeature[className][sig1] = (
                                            memoryTypeFeature[superClass][tmpSig]
                                        )
                                        isAnalyzed = True
                                        break
                                if isAnalyzed:
                                    break
                    if not isAnalyzed:
                        memoryTypeFeature[className][sig1] = (
                            retrieveMemoryOperationType(
                                className,
                                sig1,
                                methodDoc[packageName][className]["methods"][sig1],
                                magicWords,
                                promptMode,
                                m,
                                t2,
                            )
                        )
                        continue
                if sig2 not in memoryTypeFeature[className]:
                    isAnalyzed = False
                    if className in CHADic:
                        for superClass in CHADic[className]:
                            if superClass in memoryTypeFeature:
                                for tmpSig in memoryTypeFeature[superClass]:
                                    if tmpSig == sig2:
                                        memoryTypeFeature[className][sig2] = (
                                            memoryTypeFeature[superClass][tmpSig]
                                        )
                                        isAnalyzed = True
                                        break
                                if isAnalyzed:
                                    break
                    if not isAnalyzed:
                        memoryTypeFeature[className][sig2] = (
                            retrieveMemoryOperationType(
                                className,
                                sig2,
                                methodDoc[packageName][className]["methods"][sig2],
                                magicWords,
                                promptMode,
                                m,
                                t2,
                            )
                        )
                        continue

                # Create the intermediate directories if they do not exist
                os.makedirs(os.path.join(resultPath, className), exist_ok=True)
                with open(resultPath + className + "/memoryTypeFeature.json", "w") as f:
                    json.dump(memoryTypeFeature[className], f, indent=4)

                if checkMemoryType(
                    memoryTypeFeature[className][sig1],
                    memoryTypeFeature[className][sig2],
                    promptMode,
                ):
                    memOpConsistentSpec.append(spec)
                    cnt += 1
            if packageName not in allMemOpConsistentSpec:
                allMemOpConsistentSpec[packageName] = {}
            allMemOpConsistentSpec[packageName][className] = memOpConsistentSpec
    return allMemOpConsistentSpec, memoryTypeFeature, cnt


def checkMemoryType(memTypes1, memTypes2, promptMode):
    assert "manualPrompt" in promptMode or "autoPrompt_FourTypes" in promptMode
    check1 = memTypes1["insertion upon memory"] or (
        (not memTypes1["deletion upon memory"]) and memTypes1["memory write"]
    )
    check2 = memTypes2["memory read"]
    return check1 and check2


def constructSpecGraph(spec: list):
    [sig1, sig2] = spec
    retType1, methodName1, paraList1, paraNames1 = splitMethodSignatureFromJavaDoc(sig1)
    retType2, methodName2, paraList2, paraNames2 = splitMethodSignatureFromJavaDoc(sig2)

    nodeList1 = []
    nodeList2 = []
    nodeList1.append((retType1, methodName1))
    nodeList2.append((retType2, methodName2))

    for i in range(len(paraList1)):
        nodeList1.append((paraList1[i], paraNames1[i]))
    for i in range(len(paraList2)):
        nodeList2.append((paraList2[i], paraNames2[i]))
    return (nodeList1, nodeList2)


def computeSimilarityInSpecGraph(graph, CHADict: dict, NNSet: set):
    """
    Compute the similarity matrix
    """
    (nodeList1, nodeList2) = graph
    ftype = {}
    fname = {}
    for i in range(len(nodeList1)):
        for j in range(len(nodeList2)):
            (type1, name1) = nodeList1[i]
            (type2, name2) = nodeList2[j]
            ftype[(i, j)] = getTypeSimilarity(type1, type2, CHADict)
            fname[(i, j)] = computeNameSimilarity(name1, name2, NNSet, i == 0, j == 0)
    return ftype, fname


def inferRetArgSpecByOMTSolving(allMemoryValidSpecs: dict, NNSet: set, CHADic: dict):
    """
    Maximal matching
    """
    specs = {}
    for packageName in allMemoryValidSpecs:
        for className in allMemoryValidSpecs[packageName]:
            for [sig1, sig2] in allMemoryValidSpecs[packageName][className]:
                graph = constructSpecGraph([sig1, sig2])
                ftype, fname = computeSimilarityInSpecGraph(graph, CHADic, NNSet)
                specStr, optVal = maximizeMatchingWeight_CHA(graph, ftype, fname, NNSet)
                fieldConfidence = 1

                if specStr is not None and optVal is not None:
                    if packageName not in specs:
                        specs[packageName] = {}
                    if className not in specs[packageName]:
                        specs[packageName][className] = []
                    specs[packageName][className].append(
                        [sig1, sig2, optVal, fieldConfidence, specStr]
                    )
    return specs


def sortOMTSpec(specs: dict):
    flatenSpecs = []
    for packageName in specs:
        for className in specs[packageName]:
            for [sig1, sig2, opVal, fieldConfidence, specStr] in specs[packageName][
                className
            ]:
                flatenSpecs.append(
                    (
                        packageName,
                        className,
                        sig1,
                        sig2,
                        opVal,
                        fieldConfidence,
                        specStr,
                    )
                )
    flatenSpecs = sorted(flatenSpecs, key=lambda x: x[5])
    acceptSpecs = []

    for (
        packageName,
        className,
        sig1,
        sig2,
        opVal,
        fieldConfidence,
        specStr,
    ) in flatenSpecs:
        acceptSpecs.append(
            (packageName, className, sig1, sig2, opVal, fieldConfidence, specStr)
        )
    return flatenSpecs, acceptSpecs


def trimAcceptedSpecs(acceptedSpecs: list, CHADic: dict):
    finalizedSpecs = []
    for (
        packageName,
        className,
        sig1,
        sig2,
        opVal,
        fieldConfidence,
        specStr,
    ) in acceptedSpecs:
        superClasses = CHADic[className]
        isFinal = True
        for superClass in superClasses:
            for (
                packageNameTmp,
                classNameTmp,
                sigTmp1,
                sigTmp2,
                opValTmp,
                fieldConfidenceTmp,
                specStrTmp,
            ) in acceptedSpecs:
                if (
                    classNameTmp == superClass
                    and sig1 == sigTmp1
                    and sig2 == sigTmp2
                    and specStr == specStrTmp
                ):
                    isFinal = False
                    break
        if isFinal:
            finalizedSpecs.append(
                (packageName, className, sig1, sig2, opVal, fieldConfidence, specStr)
            )
    return finalizedSpecs


def extractNNDictionary(content_dict):
    NNSet = set([])
    wordtags = nltk.ConditionalFreqDist(
        (w.lower(), t) for w, t in nltk.corpus.brown.tagged_words(tagset="universal")
    )

    for package in content_dict:
        for className in content_dict[package]:
            info = content_dict[package][className]
            for sig in info["methods"]:
                description = sig[sig.find(" ") + 1 : sig.find("(")]
                ndes = re.sub(r"[^A-Za-z]+", "", description)
                # normalizeDes = re.findall('[A-Z][^A-Z]*', ndes[0:1].capitalize() + ndes[1:])
                normalizeDes = re.findall("[A-Z][^A-Z]*", ndes)
                sentences = nltk.sent_tokenize(" ".join(normalizeDes))
                for sent in sentences:
                    idx = 0
                    for word, tag in nltk.pos_tag(nltk.word_tokenize(sent)):
                        tags = dict(wordtags[word.lower()])
                        isNOUN = True
                        print(word, tags)
                        if "NOUN" in tags:
                            for tag in tags:
                                print(word, tag, tags[tag])
                                if tags[tag] > tags["NOUN"]:
                                    isNOUN = False
                        elif len(tags) != 0:
                            isNOUN = False
                        if isNOUN:
                            print(word.lower())
                            NNSet.add(word.lower())
    his = set([])
    for package in content_dict:
        for className in content_dict[package]:
            info = content_dict[package][className]
            for sig in info["methods"]:
                description = sig[sig.find(" ") + 1 : sig.find("(")]
                ndes = re.sub(r"[^A-Za-z]+", "", description)
                normalizeDes = re.findall(
                    "[A-Z][^A-Z]*", ndes[0:1].capitalize() + ndes[1:]
                )
                sentences = nltk.sent_tokenize(" ".join(normalizeDes))
                for sent in sentences:
                    for word, tag in nltk.pos_tag(nltk.word_tokenize(sent)):
                        if len(word) < 3:
                            continue
                        word = word.lower()
                        if word in NNSet or word in his:
                            continue
                        for nn in NNSet:
                            if word + "s" == nn or word + "es" == nn:
                                NNSet.add(word.lower())
                                break
                        his.add(word)
    for type in {
        "byte",
        "short",
        "int",
        "long",
        "float",
        "double",
        "char",
        "boolean",
        "void",
        "integer",
        "string",
    }:
        NNSet.add(type)
    return NNSet


def prepareBenchmark():
    evalSubjectJson = "../javadoc/evalSubject.json"
    evalDocDic = {}
    with open(evalSubjectJson, "r") as json_file:
        evalSubjects = json.load(json_file)
        for fullClassName in evalSubjects:
            filePath = evalSubjects[fullClassName][0]
            evalDocDic[fullClassName] = filePath

    methods = []
    methodDoc = {}
    for fullClassName in evalDocDic:
        filePath = evalDocDic[fullClassName]
        print(filePath)
        if os.path.exists("../data/javadoc/benchmark/" + fullClassName + ".json"):
            continue
        package_name, classInfo = pageParser(filePath, "")
        if package_name is not None and classInfo is not None:
            methods.append(classInfo)
            if package_name not in methodDoc:
                methodDoc[package_name] = {}
            methodDoc[package_name][classInfo["class"]] = classInfo
            with open("../data/javadoc/benchmark/" + fullClassName + ".json", "w") as f:
                json.dump(classInfo, f, indent=4)

    total_size = sum(len(lst) for lst in methodDoc.values())
    print(total_size, " classes obtained")
    return methodDoc


def runBenchmark(promptMode, gptMode, n, m, isOptimizedMode=False, t1=0.7, t2=0.7):
    """
    Run the benchmark
    Args:
        promptMode: The mode of prompting
        gptMode: The gpt mode. Non-cache would rerun the memory operation abstraction
        n: The self-consistency parameter in the first stage of prompting
        m: The self-consistency parameter in the second stage of prompting
        isOptimizedMode: whether the optimized mode (lazy or eager)
        t1: The temperature in the first stage of prompting
        t2: The temperature in the second stage of prompting
    """

    # Load Benchmark
    content_dict = {}
    dir_path = "../data/javadoc/benchmark/"
    data_path = "../data/output/" + promptMode + "/"
    if not os.path.exists(data_path):
        os.makedirs(data_path)

    inferResult_path = data_path + "inferResult/"
    if not os.path.exists(inferResult_path):
        os.makedirs(inferResult_path)

    methodInfoResult_path = data_path + "methodInfo/"
    if not os.path.exists(methodInfoResult_path):
        os.makedirs(methodInfoResult_path)

    prompt_path = data_path + "prompt/"
    if not os.path.exists(prompt_path):
        os.makedirs(prompt_path)

    # loop through each file in the directory
    for file_name in os.listdir(dir_path):
        # get the full file path
        file_path = os.path.join(dir_path, file_name)
        print(file_name)

        # check if the file is a JSON file
        if file_name.endswith(".json"):
            # open the file and load the JSON content to a dictionary
            fullClassName = file_name[0:-5]
            packageName = fullClassName
            className = fullClassName
            with open(file_path, "r") as f:
                content_dict[packageName] = {className: json.load(f)}

    ## Extract named entities
    NNSet = extractNNDictionary(content_dict)
    with open(inferResult_path + "benchmark_NNSet.json", "w") as f:
        json.dump({"dic": list(NNSet)}, f, indent=4)

    ## Global CHA analysis
    CHADic = obtainCHADic(content_dict)

    with open(inferResult_path + "benchmark_CHADic.json", "w") as f:
        json.dump(CHADic, f, indent=4)

    fullMethodDoc = constructFullMethodDic(content_dict, CHADic)
    with open(inferResult_path + "benchmark_fullMethodDoc.json", "w") as f:
        json.dump(fullMethodDoc, f, indent=4)

    ## Type analysis
    allTypeConsistentSpec, allCriticalMethods, cnt, method_cnt = (
        inferTypeConsistentSpecFromJavaDoc(
            fullMethodDoc, CHADic, "benchmark", methodInfoResult_path
        )
    )
    print("#allTypeConsistentSpec:", cnt)
    print("#Critical Methods:", method_cnt)

    if not isOptimizedMode:
        classCnt = 0
        for package_name in fullMethodDoc:
            classCnt += len(fullMethodDoc[package_name])
        print(classCnt)

        magicWords = retrieveMagicWords(promptMode, n, t1)
        with open(prompt_path + "magicWords.json", "w") as f:
            json.dump(magicWords, f, indent=4)

        allMemOpConsistentSpec, memoryFeature, memOpConsistentCnt = (
            inferMemOpConsistentSpecInEagerMode(
                fullMethodDoc,
                allTypeConsistentSpec,
                allCriticalMethods,
                CHADic,
                "benchmark",
                methodInfoResult_path,
                magicWords,
                promptMode,
                gptMode,
                m,
                t2,
            )
        )

        ## RetArg spec
        retArgSpecs = inferRetArgSpecByOMTSolving(allMemOpConsistentSpec, NNSet, CHADic)

        sortedRetArgSpecs, acceptedSpecs = sortOMTSpec(retArgSpecs)

        finalizedSpecs = trimAcceptedSpecs(acceptedSpecs, CHADic)
    else:
        classCnt = 0
        for package_name in fullMethodDoc:
            classCnt += len(fullMethodDoc[package_name])
        print(classCnt)

        magicWords = retrieveMagicWords(promptMode, n, t1)
        with open(prompt_path + "magicWords.json", "w") as f:
            json.dump(magicWords, f, indent=4)

        # RetArg spec
        retArgSpecs = inferRetArgSpecByOMTSolving(allTypeConsistentSpec, NNSet, CHADic)

        sortedRetArgSpecs, preAcceptedSpecs = sortOMTSpec(retArgSpecs)

        acceptedSpecs = inferMemOpConsistentSpecInLazyMode(
            preAcceptedSpecs,
            fullMethodDoc,
            "benchmark",
            methodInfoResult_path,
            magicWords,
            promptMode,
            gptMode,
            m,
            t2,
        )

        print(config.LLMTokenCnt)

        print("\n")
        finalizedSpecs = trimAcceptedSpecs(acceptedSpecs, CHADic)

    with open(inferResult_path + "benchmark_retArgSpecCandidate.json", "w") as f:
        json.dump({"retArgSpecCandidate": sortedRetArgSpecs}, f, indent=4)

    outlineDic = {}
    for spec in sortedRetArgSpecs:
        (package, className, sig1, sig2, opVal, fieldConf, specStr) = spec
        if className not in outlineDic:
            outlineDic[className] = []
        outlineDic[className].append([sig1, sig2, opVal, fieldConf, specStr])
    with open(inferResult_path + "benchmark_routlineDic.json", "w") as f:
        json.dump({"retArgSpecCandidate": outlineDic}, f, indent=4)

    with open(inferResult_path + "benchmark_inferredSpecs.json", "w") as f:
        json.dump({"retArgSpec": acceptedSpecs}, f, indent=4)

    with open(inferResult_path + "benchmark_finalizedSpecs.json", "w") as f:
        json.dump({"retArgSpec": finalizedSpecs}, f, indent=4)

    print("#typeConsistent:", cnt)
    print("#accepted specs: ", len(acceptedSpecs))
    print("#finalized specs: ", len(finalizedSpecs))
    print("#class: ", classCnt)


def construct():
    directory = "../data/javadoc/benchmark"  # Specify the directory name

    # Get all the files in the directory
    files = os.listdir(directory)

    # Filter JSON files
    json_files = [file for file in files if file.endswith(".json")]

    # Print the list of JSON files
    jsonContent = {}
    for className in json_files:
        jsonContent[className.replace(".json", "")] = className.replace(".json", "")
        print('"' + className.replace(".json", "") + '",')

    with open("../data/javadoc/evalSubject.json", "w") as f:
        json.dump(jsonContent, f, indent=4)
    return jsonContent


if __name__ == "__main__":
    assert len(sys.argv) == 6

    config.key_id = 0
    m = int(sys.argv[1])
    n = int(sys.argv[2])
    t1 = float(sys.argv[3])
    t2 = float(sys.argv[4])

    isOptimizedMode = False
    if sys.argv[5] == "--lazy":
        isOptimizedMode = True

    (config.global_m, config.global_n, config.global_t1, config.global_t2) = (m, n, t1, t2)

    promptMode = (
        "autoPrompt_FourTypes_" + str(m) + "_" + str(n) + "_" + str(t1) + "_" + str(t2)
    )

    runBenchmark(promptMode, "non-cache", m, n, isOptimizedMode, t1, t2)
