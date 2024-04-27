import json
import sys
from openai import OpenAI

# For safety, we hide the OpenAI keys
# If you want to run DAInfer, please specify the keys
openai_key_baseline = "sk-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"

formal_contexts = [
    "In Java, aliasing relation of two values means that they refer to the same memory object. I want to derive a specific form of aliasing specification from Java documentation.\n",
    "The form of the aliasing specification is (s, t, [(i_1, j_1),..., (i_n, j_n)]-->(k, 0)), indicating that: when we invoke the method t after method s upon the same object, the return value of the method t is aliased with the k-th parameter of the method s if the i_m-th parameter of s is aliased with the j_m-th parameter of t for each 1 <= m <= n. It should be noticed that the index of the parameter starts from 1, while 0 is the index of the return value.\n",
    "Here are several examples.\n",
    "Example 1: We have two methods for java.util.ArrayList:",
    '- "void add(int index, E element)": "Inserts the specified element at the specified position in this list."',
    '- "E get(int index)": "Returns the element at the specified position in this list."',
    'Then we have the aliasing specification: ("void add(int index, E element)", "E get(int index)", [(1, 1)]-->(2, 0)), indicating that when the two methods have the same value of the first paramters, the return value of "E get(int index)" may be aliased with the second parameter of "void add(int index, E element)" if the method get is invoked after the method add."\n',
    "Example 2: We have two methods for java.util.ArrayList:",
    '- "boolean add(E e)": "Appends the specified element to the end of this list."',
    '- "E get(int index)": "Returns the element at the specified position in this list."',
    'Then we have the aliasing specification: ("void add(E element)", "E get(int index)", []-->(1, 0)), indicating that the return value of "E get(int index)" may be aliased with the first parameter of "void add(E element)" if the method get is invoked after the method add.\n',
    "Example 3: We have two methods for com.google.common.util.concurrent.ForwardingBlockingQueue:",
    '- "boolean offer(E e, long timeout, TimeUnit unit)": "Inserts the specified element into this queue, waiting up to the specified wait time if necessary for space to become available."',
    '- "E poll(long timeout, TimeUnit unit)": "Retrieves and removes the head of this queue, waiting up to the specified wait time if necessary for an element to become available."',
    'Then we have the aliasing specification: ("offer(E e, long timeout, TimeUnit unit)", "E poll(long timeout, TimeUnit unit)", []-->(1, 0)), indicating that the return value of "E poll(long timeout, TimeUnit unit)" may be aliased with the first parameter of "offer(E e, long timeout, TimeUnit unit)" if the method poll is invoked after the method offer.\n',
    "Example 4: We have two methods for javax.swing.JComponent:",
    '- "void setActionMap(ActionMap am)": "Sets the ActionMap to am."',
    '- "ActionMap getActionMap()": "Returns the ActionMap used to determine what Action to fire for particular KeyStroke binding."',
    'Then we have the aliasing specification: ("void setActionMap(ActionMap am)", "ActionMap getActionMap()", []-->(1, 0)), indicating that the return value of "ActionMap getActionMap()" may be aliased with the first parameter of "void setActionMap(ActionMap am)" if the method getActionMap is invoked after the method setActionMap.\n',
    "Now I will give you the content of a json file, which contains all the methods for a given Java class. Please list all the aliasing specification (s, t, [(i_1, j_1),..., (i_n, j_n)]-->(k, 0)) line by line. You do not need to add any explanations. Remember to list the correct specifications for all the method pairs.\n",
]


contexts = [
    "In Java, aliasing relation of two values means that they refer to the same memory object. I want to derive a specific form of aliasing specification from Java documentation: When we invoke the method t after method s upon the same object, the return value of the method t is aliased with the k-th parameter of the method s if the i_m-th parameter of s is aliased with the j_m-th parameter of t for each 1 <= m <= n. It should be noticed that the index of the parameter starts from 1, while 0 is the index of the return value.\n",
    "Here are several examples.\n",
    "Example 1: We have two methods for java.util.ArrayList:",
    '- "void add(int index, E element)": "Inserts the specified element at the specified position in this list."',
    '- "E get(int index)": "Returns the element at the specified position in this list."',
    'Then we have the aliasing specification: When the two methods have the same value of the first paramters, the return value of "E get(int index)" may be aliased with the second parameter of "void add(int index, E element)" if the method get is invoked after the method add."\n',
    "Example 2: We have two methods for java.util.ArrayList:",
    '- "boolean add(E e)": "Appends the specified element to the end of this list."',
    '- "E get(int index)": "Returns the element at the specified position in this list."',
    'Then we have the aliasing specification: The return value of "E get(int index)" may be aliased with the first parameter of "void add(E element)" if the method get is invoked after the method add.\n',
    "Example 3: We have two methods for com.google.common.util.concurrent.ForwardingBlockingQueue:",
    '- "boolean offer(E e, long timeout, TimeUnit unit)": "Inserts the specified element into this queue, waiting up to the specified wait time if necessary for space to become available."',
    '- "E poll(long timeout, TimeUnit unit)": "Retrieves and removes the head of this queue, waiting up to the specified wait time if necessary for an element to become available."',
    'Then we have the aliasing specification: The return value of "E poll(long timeout, TimeUnit unit)" may be aliased with the first parameter of "offer(E e, long timeout, TimeUnit unit)" if the method poll is invoked after the method offer.\n',
    "Example 4: We have two methods for javax.swing.JComponent:",
    '- "void setActionMap(ActionMap am)": "Sets the ActionMap to am."',
    '- "ActionMap getActionMap()": "Returns the ActionMap used to determine what Action to fire for particular KeyStroke binding."',
    'Then we have the aliasing specification: The return value of "ActionMap getActionMap()" may be aliased with the first parameter of "void setActionMap(ActionMap am)" if the method getActionMap is invoked after the method setActionMap.\n',
    "Now I will give you the content of a json file, which contains all the methods for a given Java class. Please list all the aliasing specifications line by line. You do not need to add any explanations. Remember to list the correct specifications for all the method pairs.\n",
]


def run(t):
    results = {}
    context = "\n".join(contexts)
    with open("../../data/javadoc/evalSubject.json", "r") as f:
        subjects = json.load(f)
    with open("../../data/javadoc/benchmark_fullMethodDoc.json", "r") as f:
        methodDoc = json.load(f)
    cnt = 0
    for className in subjects:
        if "." not in className:
            continue
        print(className)
        s = json.dumps(methodDoc[className][className], indent=4)

        message = context + s

        input = [
            {"role": "system", "content": ""},
            # {"role": "system", "content": ""},
            {"role": "user", "content": message},
        ]

        try:

            client = OpenAI(api_key=openai_key_baseline)

            response = client.chat.completions.create(
                model="gpt-3.5-turbo", messages=input, temperature=t
            )

            results[className] = response.choices[0].message.content
        except:
            error = sys.exc_info()[0]
            results[className] = str(sys.exc_info())
        print("---------------------------")
        print(message)
        print("---------------------------")
        print(results[className])
        cnt += 1
        print("class ID: ", cnt)
        with open("output.json", "w") as f:
            json.dump(results, f, indent=4)


if __name__ == "__main__":
    key_id = 4
    t = 0.7
    run(t)
