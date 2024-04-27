from z3 import *
from helper import *


def maximizeMatchingWeight_CHA(graph, ftype, fname, NNSet: set):
    """
    Key decision procedure of specification inference
    Args:
        graph: bi-partite graph
        ftype: similarity matrix of types
        fname: similarity matrix of names
        NNSet: The set of nouns

    Returns:
        The optimal specification and the optimal value
    """

    (nodeList1, nodeList2) = graph

    # Create a Z3 solver instance
    solver = Optimize()

    # Create Z3 integer variables
    # Add a constraint to limit the value of the matching indicators
    e = {}
    for i in range(len(nodeList1)):
        e[i] = {}
        for j in range(len(nodeList2)):
            e[i][j] = Int("e" + str(i) + str(j))
            solver.add(e[i][j] >= 0, e[i][j] <= 1)

    sumi = {}
    sumj = {}
    for i in range(len(nodeList1)):
        sumj[i] = 0
        for j in range(len(nodeList2)):
            sumj[i] += e[i][j]
        solver.add(sumj[i] >= 0, sumj[i] <= 1)

    for j in range(len(nodeList2)):
        sumi[j] = 0
        for i in range(len(nodeList1)):
            sumi[j] += e[i][j]
        solver.add(sumi[j] >= 0, sumi[j] <= 1)

    for i in range(len(nodeList1)):
        for j in range(len(nodeList2)):
            if ftype[(i, j)] == -1:
                solver.add(e[i][j] == 0)

    for j in range(len(nodeList2)):
        solver.add(e[0][j] == 0)

    for i in range(1, len(nodeList1)):
        (type10, name10) = nodeList1[0]
        (type1i, name1i) = nodeList1[i]
        (type20, name20) = nodeList2[0]

        flag = 0
        if ftype[(i, 0)] == 0 and isSemanticUnitConflictFree(
            name1i, name20, False, True, NNSet
        ):
            flag = 1
        elif ftype[(i, 0)] > 0 and isSemanticUnitCongruence(
            name1i, name20, False, True, NNSet
        ):
            flag = 1
        if ftype[(i, 0)] == 0 and isSemanticUnitConflictFree(
            name10, name20, True, True, NNSet
        ):
            flag = 1
        elif ftype[(i, 0)] > 0 and isSemanticUnitCongruence(
            name10, name20, True, True, NNSet
        ):
            flag = 1
        if flag == 1:
            solver.add(e[i][0] <= 1)
        else:
            solver.add(e[i][0] <= 0)

        # Hard constraint 2: the insertion concept should be optimal matched
        matchedValue = max(
            len(computeCommonSemanticUnits(name10, name1i, True, False, NNSet)),
            len(computeCommonSemanticUnits(name20, name1i, True, False, NNSet)),
        ) * (3 - ftype[(i, 0)])
        for j in range(1, len(nodeList2)):
            (type2j, name2j) = nodeList2[j]
            noMatchedValue = len(
                computeCommonSemanticUnits(name1i, name2j, False, False, NNSet)
            ) * (3 - ftype[(i, j)])
            if noMatchedValue > matchedValue:
                solver.add(e[i][0] <= 0)
                break

    sum0 = 0
    for i in range(len(nodeList1)):
        sum0 += e[i][0]
    solver.add(sum0 == 1)

    referenceParaNum = 0
    for k in range(1, len(nodeList2)):
        (type2k, name2k) = nodeList2[k]
        if not "a" <= type2k[0] <= "z":
            referenceParaNum += 1

    if referenceParaNum > 0:
        cnt = 0
        for j in range(1, len(nodeList2)):
            (type2j, name2j) = nodeList2[j]
            if not "a" <= type2j[0] <= "z":
                for i in range(1, len(nodeList1)):
                    cnt += e[i][j]
        solver.add(cnt >= 1)

    obj = 0
    for i in range(1, len(nodeList1)):
        for j in range(1, len(nodeList2)):
            (type1i, name1i) = nodeList1[i]
            (type2j, name2j) = nodeList2[j]
            obj += (
                e[i][j]
                * len(computeCommonSemanticUnits(name1i, name2j, False, False, NNSet))
                * (ftype[(i, j)] + 2)
            )

    (type10, name10) = nodeList1[0]
    (type20, name20) = nodeList2[0]
    len0 = len(computeCommonSemanticUnits(name10, name20, True, True, NNSet))

    for i in range(1, len(nodeList1)):
        (type1i, name1i) = nodeList1[i]
        len1 = len(computeCommonSemanticUnits(name1i, name10, False, True, NNSet))
        len2 = len(computeCommonSemanticUnits(name1i, name20, False, True, NNSet))
        obj += e[i][0] * max(len0, len1, len2) * (ftype[(i, 0)] + 2)

    # Add the objective function to the solver
    solver.maximize(obj)

    config.SMTCnt += 1

    # Check if the solver has a solution
    if solver.check() == sat:
        # Get the optimal value of x
        print("SAT")
        model = solver.model()
        opVal = 0
        specVec = []
        target = None
        for i in range(len(nodeList1)):
            for j in range(len(nodeList2)):
                if model[e[i][j]] == 1:
                    opVal += fname[(i, j)]
                    if j == 0:
                        target = (i, j)
                    else:
                        specVec.append((i, j))
        if target is None:
            return None, None
        else:
            return str(specVec) + "-->" + str(target), opVal
    else:
        print("No solution found")
        return None, None


def maximizeMatchingWeight_NoCHA(graph, ftype, fname, NNSet: set):
    """
    The decision procedure of specification inference without considering class hierarchy
    Args:
        graph: bi-partite graph
        ftype: similarity matrix of types
        fname: similarity matrix of names
        NNSet: The set of nouns

    Returns:
        The optimal specification and the optimal value
    """

    (nodeList1, nodeList2) = graph

    # Create a Z3 solver instance
    solver = Optimize()

    # Create Z3 integer variables
    # Add a constraint to limit the value of the matching indicators
    e = {}
    for i in range(len(nodeList1)):
        e[i] = {}
        for j in range(len(nodeList2)):
            e[i][j] = Int("e" + str(i) + str(j))
            solver.add(e[i][j] >= 0, e[i][j] <= 1)

    sumi = {}
    sumj = {}
    for i in range(len(nodeList1)):
        sumj[i] = 0
        for j in range(len(nodeList2)):
            sumj[i] += e[i][j]
        solver.add(sumj[i] >= 0, sumj[i] <= 1)

    for j in range(len(nodeList2)):
        sumi[j] = 0
        for i in range(len(nodeList1)):
            sumi[j] += e[i][j]
        solver.add(sumi[j] >= 0, sumi[j] <= 1)

    for i in range(len(nodeList1)):
        for j in range(len(nodeList2)):
            if ftype[(i, j)] == -1:
                solver.add(e[i][j] == 0)

    for j in range(len(nodeList2)):
        solver.add(e[0][j] == 0)

    sum0 = 0
    for i in range(len(nodeList1)):
        sum0 += e[i][0]
    solver.add(sum0 == 1)

    # Create a Z3 expression for the objective function to maximize
    obj = 0
    for i in range(len(nodeList1)):
        for j in range(len(nodeList2)):
            obj += e[i][j] * fname[(i, j)] * (ftype[(i, j)] + 1)

    # Add the objective function to the solver
    solver.maximize(obj)

    config.SMTCnt += 1

    # Check if the solver has a solution
    if solver.check() == sat:
        # Get the optimal value of x
        print("SAT")
        model = solver.model()
        opVal = 0
        cnt = 0
        specVec = []
        target = None
        fieldConfidence = 0
        for i in range(len(nodeList1)):
            for j in range(len(nodeList2)):
                if model[e[i][j]] == 1:
                    opVal += fname[(i, j)]
                    if j == 0:
                        target = (i, j)
                        fieldConfidence = fname[(i, j)] * (ftype[(i, j)] + 1)
                    else:
                        specVec.append((i, j))
        if target is None:
            return None, None
        else:
            (type1, name1) = nodeList1[0]
            (type2, name2) = nodeList2[0]
            fieldConfidence = max(
                fieldConfidence, computeNameSimilarity(name1, name2, NNSet, True, True)
            )
            print(name1, name2)
            print("field conf: ", fieldConfidence)
            return (
                str(specVec) + "-->" + str(target),
                opVal * 1.0 / (1 + len(specVec)),
                fieldConfidence,
            )
    else:
        print("No solution found")
        return None, None
