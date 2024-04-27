from bs4 import BeautifulSoup
import re
import os


def pageParser(filePath: str, projectName: str):
    """
    Parse the HTML file and extract the package name, class/interface name, method name, and method description.
    Args:
        filePath: The path to the HTML file
        projectName: The name of the project
    Returns:
        package_name: The name of the package
        classInfo: A dictionary containing the class/interface name, category, and a list of methods with their descriptions
    """

    # Invoke the appropriate parser based on the project name
    if "android" in filePath:
        return parserForAndroid(filePath)
    elif (
        "ofbiz" in filePath
        or "org.apache.shiro.session" in filePath
        or "org.antlr.runtime.tree" in filePath
    ):
        return parserForOfBiz(filePath)
    elif "org.eclipse.jface" in filePath:
        return parserForEclipseJFace(filePath)
    else:
        return defaultParse(filePath)


def defaultParse(filePath: str):
    """
    Default parser for Java library documentation
    Args:
        filePath: The path to the HTML file
    Returns:
        package_name: The name of the package
        classInfo: A dictionary containing the class/interface name, category, and a list of methods with their descriptions
    """
    classInfo = {}

    if "package-summary" in filePath:
        return None, None

    # Load the HTML file
    try:
        with open(filePath, "r") as f:
            html_doc = f.read()
    except FileNotFoundError:
        print("File not found!")
        return None, None
    except IOError:
        print("An error occurred while reading the file!")
        return None, None
    except UnicodeDecodeError:
        print("An error occurred while decoding the file!")
        return None, None

    # Parse the HTML using BeautifulSoup
    soup = BeautifulSoup(html_doc, "html.parser")

    # Parse the package name
    package = soup.find_all("div", {"class": "subTitle"})

    if len(package) == 1:
        package_name = package[0].text
    elif len(package) == 2:
        package_name = package[1].text
    else:
        return None, None

    # Parse the class/interface name
    pre = soup.find("h2").text.split(" ")

    entity_category = pre[0].strip()
    class_name = pre[1].strip()
    class_name = re.sub(r"<.*?>", "", class_name)
    if "<" in class_name:
        class_name = class_name[: class_name.rfind("<")]

    classInfo["class"] = class_name

    classInfo["category"] = entity_category

    print(class_name)
    print(entity_category)
    print("\n")

    classInfo["methods"] = {}

    # Find the table that contains the method information
    method_table = soup.find(
        "table",
        {"summary": "Method Summary table, listing methods, and an explanation"},
    )

    if method_table == None:
        return None, None

    # Find all the rows in the table
    method_rows = method_table.find_all("tr")

    # Loop through each row and extract the method name and description
    for row in method_rows:
        # Find the columns in the row
        cols = row.find_all("td")

        # Check if the row contains method information
        if len(cols) == 2:
            # Extract the method name and description
            method_signature = "".join(
                (cols[0].code.text.strip() + " " + cols[1].code.text.strip()).split(
                    "\n"
                )
            )
            method_signature = re.sub(r"\s+", " ", method_signature)
            method_signature = re.sub(r"\s*,\s*", ", ", method_signature)

            print(method_signature)
            # error-prone
            method_signature = re.sub(r"<.*?>", "", method_signature)
            method_signature = method_signature.strip(">")
            tmp_sig1 = method_signature[: method_signature.rfind("(")]
            paras = method_signature[method_signature.rfind("(") :]
            fname = tmp_sig1[tmp_sig1.rfind(" ") + 1 :]
            tmp_sig2 = tmp_sig1[: tmp_sig1.rfind(" ")]
            returnType1 = tmp_sig2[tmp_sig2.rfind(" ") + 1 :]
            method_signature = returnType1 + " " + fname + paras
            method_signature = method_signature.strip(">")
            method_signature = method_signature.replace("<", "").replace(">", "")

            method_description = "" if cols[1].div is None else cols[1].div.text.strip()
            method_description = re.sub(r"\s+", " ", method_description)
            method_description = re.sub(r"\s*,\s*", ", ", method_description)

            if "Deprecated." in method_description:
                continue

            classInfo["methods"][method_signature] = method_description
            print(method_signature)
            print(method_description)
            print("\n")

    # CHA
    soup = BeautifulSoup(html_doc, "html.parser")
    inheritance = []
    ul_tags = soup.find_all("ul", {"class": "inheritance"})
    classHistory = set([])

    for ul in ul_tags:
        a_tags = ul.find_all("a")
        for a in a_tags:
            if a.a:
                s = str(a.a.text)
            else:
                s = str(a.text)
            if s not in classHistory:
                classHistory.add(s)
                inheritance.append(s)
    inheritance.reverse()
    classInfo["super class"] = inheritance
    return package_name, classInfo


def parserForAndroid(filePath: str):
    """
    Default parser for Android library documentation
    Args:
        filePath: The path to the HTML file
    Returns:
        package_name: The name of the package
        classInfo: A dictionary containing the class/interface name, category, and a list of methods with their descriptions
    """
    classInfo = {}

    if "package-summary" in filePath:
        return None, None

    if "/." in filePath:
        return None, None

    # Load the HTML file
    try:
        with open(filePath, "r") as f:
            html_doc = f.read()
    except FileNotFoundError:
        print("File not found!")
        return None, None
    except IOError:
        print("An error occurred while reading the file!")
        return None, None
    except UnicodeDecodeError:
        print("An error occurred while decoding the file!")
        return None, None

    # Parse the HTML using BeautifulSoup
    soup = BeautifulSoup(html_doc, "html.parser")

    # Parse the package name
    package_name = "android"

    # Parse the class/interface name
    pre = soup.find("title").text.split(" ")

    entity_category = "class"
    class_name = pre[0].strip()
    class_name = re.sub(r"<.*?>", "", class_name)
    if "<" in class_name:
        class_name = class_name[: class_name.rfind("<")]

    classInfo["class"] = class_name

    classInfo["category"] = entity_category

    print(class_name)
    print(entity_category)
    print("\n")

    classInfo["methods"] = {}

    # Find the table that contains the method information
    method_table = soup.find(
        "table", {"class": "responsive methods", "id": "pubmethods"}
    )

    if method_table == None:
        return None, None

    # Find all the rows in the table
    method_rows = method_table.find_all("tr")

    # Initialize an empty list to store the method descriptions
    method_list = []

    # Loop through each row and extract the method name and description
    for row in method_rows:
        # Find the columns in the row
        cols = row.find_all("td")

        # Check if the row contains method information
        if len(cols) == 2:
            # Extract the method name and description
            method_signature = "".join(
                (cols[0].code.text.strip() + " " + cols[1].code.text.strip()).split(
                    "\n"
                )
            )
            method_signature = re.sub(r"\s+", " ", method_signature)
            method_signature = re.sub(r"\s*,\s*", ", ", method_signature)

            # error-prone
            method_signature = re.sub(r"<.*?>", "", method_signature)
            method_signature = method_signature.strip(">")
            tmp_sig1 = method_signature[: method_signature.rfind("(")]
            paras = method_signature[method_signature.rfind("(") :]
            fname = tmp_sig1[tmp_sig1.rfind(" ") + 1 :]
            tmp_sig2 = tmp_sig1[: tmp_sig1.rfind(" ")]
            returnType1 = tmp_sig2[tmp_sig2.rfind(" ") + 1 :]
            method_signature = returnType1 + " " + fname + paras
            method_signature = method_signature.strip(">")
            method_signature = method_signature.replace("<", "").replace(">", "")

            if row.find("p") is None:
                method_description = method_signature
            else:
                method_description = row.find("p").get_text().strip()
                method_description = re.sub(r"\s+", " ", method_description)
                method_description = re.sub(r"\s*,\s*", ", ", method_description)

            # method_description = "" if cols[1].div is None else cols[1].div.text.strip()
            # method_description = re.sub(r'\s+', ' ', method_description)
            # method_description = re.sub(r'\s*,\s*', ', ', method_description)

            if "Deprecated." in method_description:
                continue

            classInfo["methods"][method_signature] = method_description
            print(method_signature)
            print(method_description)
            print("\n")

    # CHA
    soup = BeautifulSoup(html_doc, "html.parser")
    inheritance = [class_name, "Object"]
    ul_tags = soup.find_all("ul", {"class": "inheritance"})
    classHistory = set([])
    inheritance.reverse()
    classInfo["super class"] = inheritance
    return package_name, classInfo


def parserForEclipseJFace(filePath: str):
    """
    Default parser for EclipseJFac library documentation
    Args:
        filePath: The path to the HTML file
    Returns:
        package_name: The name of the package
        classInfo: A dictionary containing the class/interface name, category, and a list of methods with their descriptions
    """
    classInfo = {}

    if "package-summary" in filePath:
        return None, None

    # Load the HTML file
    try:
        with open(filePath, "r") as f:
            html_doc = f.read()
    except FileNotFoundError:
        print("File not found!")
        return None, None
    except IOError:
        print("An error occurred while reading the file!")
        return None, None
    except UnicodeDecodeError:
        print("An error occurred while decoding the file!")
        return None, None

    # Parse the HTML using BeautifulSoup
    soup = BeautifulSoup(html_doc, "html.parser")

    # Parse the package name
    package = soup.find_all("a", {"href": "package-summary.html"})

    package_name = (package[1]).text
    print(package_name)

    # Parse the class/interface name
    pre = soup.find("h2").text.split(" ")

    entity_category = pre[0].strip()
    class_name = pre[1].strip()
    class_name = re.sub(r"<.*?>", "", class_name)
    if "<" in class_name:
        class_name = class_name[: class_name.rfind("<")]

    classInfo["class"] = class_name

    classInfo["category"] = entity_category

    print(class_name)
    print(entity_category)
    print("\n")

    classInfo["methods"] = {}

    # Find the table that contains the method information
    method_table = soup.find_all("table", {"class": "memberSummary"})

    if len(method_table) == 0:
        return None, None

    # Find all the rows in the table
    method_rows = method_table[-1].find_all("tr")

    print(method_rows)

    # Initialize an empty list to store the method descriptions
    method_list = []

    # Loop through each row and extract the method name and description
    for row in method_rows:
        # Find the columns in the row
        a = row.find("td", {"class": "colFirst"})
        b = row.find("th", {"class": "colSecond"})
        c = row.find("td", {"class": "colLast"})

        if a is None or b is None or c is None:
            continue

        method_signature = "".join(
            (a.code.text.strip() + " " + b.code.text.strip()).split("\n")
        )
        method_signature = re.sub(r"\s+", " ", method_signature)
        method_signature = re.sub(r"\s*,\s*", ", ", method_signature)

        # error-prone
        method_signature = re.sub(r"<.*?>", "", method_signature)
        method_signature = method_signature.strip(">")
        tmp_sig1 = method_signature[: method_signature.rfind("(")]
        paras = method_signature[method_signature.rfind("(") :]
        fname = tmp_sig1[tmp_sig1.rfind(" ") + 1 :]
        tmp_sig2 = tmp_sig1[: tmp_sig1.rfind(" ")]
        returnType1 = tmp_sig2[tmp_sig2.rfind(" ") + 1 :]
        method_signature = returnType1 + " " + fname + paras
        method_signature = method_signature.strip(">")
        method_signature = method_signature.replace("<", "").replace(">", "")

        method_description = "" if c.div is None else c.div.text.strip()
        method_description = re.sub(r"\s+", " ", method_description)
        method_description = re.sub(r"\s*,\s*", ", ", method_description).replace(
            "&#8203;", ""
        )

        classInfo["methods"][method_signature] = method_description

    # CHA
    soup = BeautifulSoup(html_doc, "html.parser")
    inheritance = []
    ul_tags = soup.find_all("ul", {"class": "inheritance"})
    classHistory = set([])

    for ul in ul_tags:
        a_tags = ul.find_all("a")
        for a in a_tags:
            if a.a:
                s = str(a.a.text)
            else:
                s = str(a.text)
            if s not in classHistory:
                classHistory.add(s)
                inheritance.append(s)
    inheritance.reverse()
    classInfo["super class"] = inheritance
    return package_name, classInfo


def parserForOfBiz(filePath: str):
    """
    Default parser for OfBiz library documentation
    Args:
        filePath: The path to the HTML file
    Returns:
        package_name: The name of the package
        classInfo: A dictionary containing the class/interface name, category, and a list of methods with their descriptions
    """
    classInfo = {}

    if "package-summary" in filePath:
        return None, None

    # Load the HTML file
    try:
        with open(filePath, "r") as f:
            html_doc = f.read()
    except FileNotFoundError:
        print("File not found!")
        return None, None
    except IOError:
        print("An error occurred while reading the file!")
        return None, None
    except UnicodeDecodeError:
        print("An error occurred while decoding the file!")
        return None, None

    # Parse the HTML using BeautifulSoup
    soup = BeautifulSoup(html_doc, "html.parser")

    # Parse the package name
    package = soup.find_all("a", {"href": "package-summary.html"})

    package_name = (package[1]).text
    print(package_name)

    # Parse the class/interface name
    pre = soup.find("h2").text.split(" ")

    entity_category = pre[0].strip()
    class_name = pre[1].strip()
    class_name = re.sub(r"<.*?>", "", class_name)
    if "<" in class_name:
        class_name = class_name[: class_name.rfind("<")]

    classInfo["class"] = class_name

    classInfo["category"] = entity_category

    print(class_name)
    print(entity_category)
    print("\n")

    classInfo["methods"] = {}

    # Find the table that contains the method information
    method_table = soup.find_all("table", {"class": "memberSummary"})

    if len(method_table) == 0:
        return None, None

    # Find all the rows in the table
    method_rows = method_table[-1].find_all("tr")

    # Initialize an empty list to store the method descriptions
    method_list = []

    # Loop through each row and extract the method name and description
    for row in method_rows:
        # Find the columns in the row
        a = row.find("td", {"class": "colFirst"})
        b = row.find("th", {"class": "colSecond"})
        c = row.find("td", {"class": "colLast"})

        if a is None or b is None or c is None:
            continue

        method_signature = "".join(
            (a.code.text.strip() + " " + b.code.text.strip()).split("\n")
        )
        method_signature = re.sub(r"\s+", " ", method_signature)
        method_signature = re.sub(r"\s*,\s*", ", ", method_signature)

        # error-prone
        method_signature = re.sub(r"<.*?>", "", method_signature)
        method_signature = method_signature.strip(">")
        tmp_sig1 = method_signature[: method_signature.rfind("(")]
        paras = method_signature[method_signature.rfind("(") :]
        fname = tmp_sig1[tmp_sig1.rfind(" ") + 1 :]
        tmp_sig2 = tmp_sig1[: tmp_sig1.rfind(" ")]
        returnType1 = tmp_sig2[tmp_sig2.rfind(" ") + 1 :]
        method_signature = returnType1 + " " + fname + paras
        method_signature = method_signature.strip(">")
        method_signature = method_signature.replace("<", "").replace(">", "")

        method_description = "" if c.div is None else c.div.text.strip()
        method_description = re.sub(r"\s+", " ", method_description)
        method_description = re.sub(r"\s*,\s*", ", ", method_description).replace(
            "&#8203;", ""
        )

        classInfo["methods"][method_signature] = method_description

    # CHA
    soup = BeautifulSoup(html_doc, "html.parser")
    inheritance = []
    ul_tags = soup.find_all("ul", {"class": "inheritance"})
    classHistory = set([])

    for ul in ul_tags:
        a_tags = ul.find_all("a")
        for a in a_tags:
            if a.a:
                s = str(a.a.text)
            else:
                s = str(a.text)
            if s not in classHistory:
                classHistory.add(s)
                inheritance.append(s)
    quatified_className = package_name + "." + class_name
    # inheritance.append(quatified_className)
    inheritance.reverse()
    classInfo["super class"] = inheritance
    return package_name, classInfo


def parseProject(javadocPath: str, projectName: str):
    """
    Parse the Javadoc files in the given directory and extract the method information.
    Args:
        javadocPath: The path to the directory containing the Javadoc files
        projectName: The name of the project

    Returns: The documentation model
    """

    methodDoc = {}
    methods = []

    # Initialize an empty list to store the HTML files
    html_files = []

    # Loop through all the directories and files in the directory
    for root, dirs, files in os.walk(javadocPath):
        # Loop through all the files in the current directory
        for file in files:
            # Check if the file is an HTML file
            if file.endswith(".html"):
                # Add the file path to the list of HTML files
                html_files.append(os.path.join(root, file))

    # Print the list of HTML files
    for filePath in html_files:
        print(filePath)
        package_name, classInfo = pageParser(filePath, projectName)
        if package_name is not None and classInfo is not None:
            methods.append(classInfo)
            if package_name not in methodDoc:
                methodDoc[package_name] = {}
            methodDoc[package_name][classInfo["class"]] = classInfo

    total_size = sum(len(lst) for lst in methodDoc.values())
    print(total_size, " classes obtained")
    print(len(methods))
    return methodDoc
