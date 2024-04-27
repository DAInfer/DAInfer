import re
from Levenshtein import distance

import config


def extractSemanticUnit(name: str, is_method: bool, NNSet: set):
    """
    Extract semantic units from a name.
    Args:
        name: Method name or parameter name
        is_method: Whether name is a method name
        NNSet: The set of noun words

    Returns:
        A set of semantic units
    """
    name = re.sub(r"[^A-Za-z]+", "", name)
    nameTmp = re.sub(r"[^A-Za-z]+", "", name)
    names = re.findall("[A-Z][^A-Z]*", nameTmp[0:1].capitalize() + nameTmp[1:])
    concepts = []
    if is_method:
        for name in names:
            if name.lower() in NNSet:
                concepts.append(name.lower())
    else:
        for name in names:
            concepts.append(name.lower())
    return concepts


def isSemanticUnitConflictFree(
    name1: str, name2: str, isMethod1: bool, isMethod2: bool, NNSet: set
):
    """
    Check if two names are semantic-unit conflict-free.
    Args:
        name1: The name of the first method or parameter
        name2: The name of the second method or parameter
        isMethod1: Whether name1 is a method name
        isMethod2: Whether name2 is a method name
        NNSet: The set of noun words

    Returns:
        True if the two names are semantic-unit conflict-free, False otherwise
    """
    concepts1 = extractSemanticUnit(name1, isMethod1, NNSet)
    concepts2 = extractSemanticUnit(name2, isMethod2, NNSet)
    for concept in concepts1:
        if concept not in concepts2 and len(concepts2) != 0:
            return False
    for concept in concepts2:
        if concept not in concepts1 and len(concepts1) != 0:
            return False
    return True


def isSemanticUnitCongruence(
    name1: str, name2: str, isMethod1: bool, isMethod2: bool, NNSet: set
):
    """
    Check if two names are semantic-unit congruent.
    Args:
        name1: The name of the first method or parameter
        name2: The name of the second method or parameter
        isMethod1: Whether name1 is a method name
        isMethod2: Whether name2 is a method name
        NNSet: The set of noun words

    Returns:
        True if the two names are semantic-unit congruent, False otherwise
    """
    concepts1 = extractSemanticUnit(name1, isMethod1, NNSet)
    concepts2 = extractSemanticUnit(name2, isMethod2, NNSet)
    if len(concepts1) == 0 or len(concepts2) == 0:
        return False
    for concept in concepts1:
        if concept not in concepts2:
            return False
    for concept in concepts2:
        if concept not in concepts1:
            return False
    return True


def computeCommonSemanticUnits(
    name1: str, name2: str, isMethod1: bool, isMethod2: bool, NNSet: set
):
    """
    Compute the common semantic units between two names.
    Args:
        name1: The name of the first method or parameter
        name2: The name of the second method or parameter
        isMethod1: Whether name1 is a method name
        isMethod2: Whether name2 is a method name
        NNSet: The set of noun words

    Returns:
        A set of common semantic units
    """
    concepts1 = extractSemanticUnit(name1, isMethod1, NNSet)
    concepts2 = extractSemanticUnit(name2, isMethod2, NNSet)
    return set(concepts1).intersection(set(concepts2))


def computeNameSimilarity(
    name1: str, name2: str, NNSet: set, isMethod1: bool, isMethod2: bool
):
    """
    Compute the similarity between two names.
    Args:
        name1: The name of the first method or parameter
        name2: The name of the second method or parameter
        isMethod1: Whether name1 is a method name
        isMethod2: Whether name2 is a method name
        NNSet: The set of noun words

    Returns:
        The similarity between the two names
    """
    name1 = re.sub(r"[^A-Za-z]+", "", name1)
    name2 = re.sub(r"[^A-Za-z]+", "", name2)

    nameTmp = re.sub(r"[^A-Za-z]+", "", name1)
    names = re.findall("[A-Z][^A-Z]*", nameTmp[0:1].capitalize() + nameTmp[1:])
    config.tagTokenCnt += len(names)

    names1 = []
    if isMethod1:
        for name in names:
            if name.lower() in NNSet:
                names1.append(name.lower())
    else:
        for name in names:
            names1.append(name.lower())

    nameTmp = re.sub(r"[^A-Za-z]+", "", name2)
    names = re.findall("[A-Z][^A-Z]*", nameTmp[0:1].capitalize() + nameTmp[1:])
    config.tagTokenCnt += len(names)

    names2 = []
    if isMethod2:
        for name in names:
            if name.lower() in NNSet:
                names2.append(name.lower())
    else:
        for name in names:
            names2.append(name.lower())

    if len(names1) == 0 or len(names2) == 0:
        return 1

    hit1 = 0
    hit2 = 0
    for subname1 in names1:
        for subname2 in names2:
            if checkStringEquality(subname1, subname2):
                hit2 += 1
    for subname2 in names2:
        for subname1 in names1:
            if checkStringEquality(subname2, subname1):
                hit1 += 1
    return (hit1 + hit2) * 1.0 / (len(names1) + len(names2))


def getTypeSimilarity(type1, type2, CHADic):
    """
    Compute the similarity between two types.
    Args:
        type1: The name of the first type
        type2: The name of the first type
        CHADic: The class hierarchy relation

    Returns:
        The similarity between the two types
    """
    if type1 == type2:
        return 0
    if (
        len(type1) <= 2
        and type2 != "java.lang.Object"
        and type2 != type1
        and type2 != "Object"
    ):
        return -1
    if (
        len(type2) <= 2
        and type1 != "java.lang.Object"
        and type2 != type1
        and type1 != "Object"
    ):
        return -1

    isObj1 = type1 == "Object" or len(type1) <= 2 or type1 == "java.lang.Object"
    isObj2 = type2 == "Object" or len(type2) <= 2 or type2 == "java.lang.Object"
    if isObj1 and isObj2:
        return 0
    if isObj1 and (not isPrimitiveType(type2)):
        return 1
    if isObj2 and (not isPrimitiveType(type1)):
        return 1

    if type1 not in CHADic and type2 not in CHADic:
        return -1
    elif type1 in CHADic:
        if type2 not in CHADic[type1]:
            return -1
    elif type2 in CHADic:
        if type1 not in CHADic[type2]:
            return -1

    if type1 not in CHADic and type2 not in CHADic:
        return -1
    dis1 = longest_path(type1, type2, CHADic)
    dis2 = longest_path(type2, type1, CHADic)
    if dis1 == -1 and dis2 == -1:
        return -1
    if dis1 == -1:
        return dis2
    if dis2 == -1:
        return dis1
    return -1


def longest_path(start_node, end_node, CHADic):
    """
    Compute the longest path between two types in the class hierarchy graph
    Args:
        start_node: The first type
        end_node: The second type
        CHADic: The class hierarchy graph

    Returns:
        The longest path between the two types
    """

    # Create a dictionary to store the longest path to each node
    longest_paths = {}

    # Initialize the longest path to the start node to be 0
    longest_paths[start_node] = 0

    # Create a stack to store the topologically sorted nodes
    stack = [start_node]
    history = {start_node}

    # Topologically sort the nodes in the DAG
    while stack:
        node = stack.pop()

        # If we have reached the end node, return the longest path to it
        if node == end_node:
            return longest_paths[node]

        # If the node is not in the DAG, return -1
        if node not in CHADic:
            return -1

        # Update the longest path to each child node
        for child in CHADic[node]:
            if child not in longest_paths:
                longest_paths[child] = longest_paths[node] + 1
            else:
                longest_paths[child] = max(
                    longest_paths[child], longest_paths[node] + 1
                )

            # Add the child node to the stack
            stack.append(child)

            if child not in history:
                history.add(child)
            else:
                return longest_paths[child]

    # If we have not found the end node, return -1
    return -1


def isPrimitiveType(type: str):
    """
    Check if a type is a primitive type.
    Args:
        type: The name of the type

    Returns:
        True if the type is a primitive type, False otherwise
    """
    s = {"byte", "short", "int", "long", "float", "double", "char", "boolean", "void"}
    if type in s:
        return True
    else:
        return False


def splitCamelCase(s):
    """
    Split a Camel-Case string into a list of tokens.

    Parameters:
    s (str): The Camel-Case string to split.

    Returns:
    list: The list of tokens.
    """
    # Initialize the list of tokens.
    tokens = []

    # Iterate over the characters in the string.
    i = 0
    while i < len(s):
        # If the current character is uppercase, start a new token.
        if s[i].isupper():
            # Find the end of the token.
            j = i + 1
            while j < len(s) and s[j].islower():
                j += 1

            # Add the token to the list.
            tokens.append(s[i:j].lower())

            # Move the index to the end of the token.
            i = j
        else:
            # If the current character is lowercase, skip it.
            i += 1

    # Return the list of tokens.
    return tokens


def splitMethodSignatureFromJavaDoc(originalSig: str):
    """
    Split the method signature from the JavaDoc.
    Args:
        originalSig: The type signature of the method

    Returns:
        The return type, method name, parameter types, and parameter names
    """
    sig = (
        originalSig.replace("abstract", "")
        .strip(" ")
        .replace("static", "")
        .strip(" ")
        .strip(">")
    )
    sig = eraseTypeParaInSigFromJavaDoc(sig)
    retType = sig[: sig.index(" ")]
    trimSig = sig[sig.index(" ") + 1 :].strip(" ")
    methodName = trimSig[: trimSig.index("(")]
    paraStr = trimSig[trimSig.index("(") + 1 : trimSig.index(")")]
    paraTypes = []
    paraNames = []
    for para in paraStr.split(","):
        paraType = para.strip(" ").split(" ")[0].strip(" ")
        if paraType != "":
            paraTypes.append(paraType)
            if len(para.strip(" ").split(" ")) == 1:
                return None, None, None, None
            paraName = para.strip(" ").split(" ")[1].strip(" ")
            paraNames.append(paraName)
    return retType, methodName, paraTypes, paraNames


def checkStringEquality(s1: str, s2: str, theta=0.9):
    """
    Check if two strings are equal with a given threshold.
    Args:
        s1: The first string
        s2: The second string
        theta: The threshold

    Returns:
        True if the two strings are equal, False otherwise
    """
    lev_distance = distance(s1.lower(), s2.lower())
    similarity = 1 - (lev_distance / max(len(s1), len(s2)))
    if similarity > 0.9:
        return True
    else:
        return False


def computeStrListSimilarity(list1: [str], list2: [str]):
    """
    Compute the ratio of the number of common elements in two lists
    and the size of their union.

    Parameters:
    list1 (list): The first list of strings.
    list2 (list): The second list of strings.

    Returns:
    float: The ratio of the number of common elements and the size of the union.
    """
    # Compute the number of common elements.
    common = len(set(list1).intersection(set(list2)))

    # Compute the size of the union.
    union = len(set(list1).union(set(list2)))

    # Compute the ratio.
    if union == 0:
        ratio = 0.0
    else:
        ratio = float(common) / union
    return ratio


def eraseTypeParaInSigFromJavaDoc(s: str):
    """
    Erase the type parameters in a type.
    Args:
        type: The name of a type

    Returns:
        The type without type parameters
    """
    result = ""
    inside_tag = False
    for char in s:
        if char == "<":
            inside_tag = True
        elif char == ">":
            inside_tag = False
        elif not inside_tag:
            result += char
    result = result.replace("  ", " ").strip(" ")
    return result
