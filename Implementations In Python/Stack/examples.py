from linkedListImplementation import *

#Reversing a given string array using stack

#A better space effective program can be written for this process but that will be done after learning space complexity
def reverse(stringArray): #Time complexity of O(n)
    myStack = Stack()
    for x in stringArray:
        myStack.push(x)
    i = 0
    while myStack.isEmpty() == False:
        stringArray[i] = myStack.peek()
        myStack.pop()
        i += 1
    return stringArray

print(reverse(['S', 'a', 'q', 'i', 'b']))

#Reverse a given linked list using stack
#Here we will use explicit stack for the job unlike
#in recursive approach where we use implicit one

class Node:
    def __init__(self, data = None, pointer = None):
        self.data = data
        self.pointer = pointer

class linkedList:
    def __init__(self):
        self.head = None 

    def reverse(self):
        myStack = Stack()
        myNode = self.head
        while myNode.pointer:
            myStack.push(myNode)
            myNode = myNode.pointer
        self.head = myNode
        #myStack.pop() #HOW THE F???? This makes perfect sense but it makes our code problematic, without it our code seems to work with just one garbage iteration but idk why this statement is bringing problem overhere
        while myStack.isEmpty() == False:
            myNode.pointer = myStack.peek()
            myStack.pop()
            myNode = myNode.pointer
        myNode.pointer = None



#Check for balanced parantheses in the given string