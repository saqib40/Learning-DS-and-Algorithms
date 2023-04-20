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
def pairCheck(opening, closing):
    if closing == ')' and opening == '(':
        return True
    elif closing == '}' and opening == '{':
        return True
    elif closing == ']' and  opening == '[':
        return True
    else:
        return False

def checkBalanced(exp):
    n = len(exp)
    S = Stack()
    i = 0
    while i < n:
        if exp[i] == '(' or exp[i] == '{' or exp[i] == '[':
            S.push(exp[i])
        else:
            if S.isEmpty() or pairCheck(S.peek(), exp[i]) == False:
                return False
            else:
                S.pop()
        i += 1
    return True if S.isEmpty() else False


#Evaluating postfix using stack
def perform(operator, operand1, operand2):
    if operator == '+':
        return int(operand1) + int(operand2)
    elif operator == '-':
        return int(operand1) - int(operand2)
    elif operator == '*':
        return int(operand1) * int(operand2)
    elif operator == '/':
        return int(operand1) / int(operand2)
    elif operator == '**':
        return int(operand1) ** int(operand2)

def evaluatePostfix(exp):
    myStack = Stack()
    for x in exp:
        if x != '+' and x != '-' and x != '*' and x != '/': #assuming no exponent operator ** but this along with other cases are to be handled
            myStack.push(x)
        else:
            op2 = myStack.peek()
            myStack.pop()
            op1 = myStack.peek()
            myStack.pop()
            result = perform(x, op1, op2)
            myStack.push(result)
    return myStack.peek()

#Evaluating prefix using stack
def evaluatePrefix(exp):
    myStack = Stack()
    n = len(exp)
    i = n-1
    while i >= 0:
        x = exp[i]
        if x != '+' and x != '-' and x != '*' and x != '/': #assuming no exponent operator ** but this along with other cases are to be handled
            myStack.push(x)
        else:
            op1 = myStack.peek()
            myStack.pop()
            op2 = myStack.peek()
            myStack.pop()
            result = perform(x, op1, op2)
            myStack.push(result)
        i -= 1
    return myStack.peek()

#Converting infix to postfix using stack (concatenation of string is time consuming with TC of O(n^2))
def openingClosingP(x):
    if x == '(' or x == '[' or x == '{':
        return 'Opening Parentheses'
    elif x == ')' or x == ']' or x == '}':
        return 'Closing Parentheses'

def operatorWeight(x):
    if x == '+' or x == '-':
        return 1
    elif x == '*' or x == '/':
        return 2
    elif x == '**':
        return 3


def precedence(x,y):
    a = operatorWeight(x)
    b = operatorWeight(y)
    if a > b:
        return True
    elif a < b:
        return False
    elif a == b: #When equal precedence, return true if they are left associative and false if they are right associative
        if x == '**':
            return False
        else:
            return True

def infixToPostfix(exp):
    myStack = Stack()
    myString = ''
    for x in exp:
        if openingClosingP(x) == 'Opening Parentheses':
            myStack.push(x)
        elif openingClosingP(x) == 'Closing Parentheses':
            while myStack.isEmpty() == False and openingClosingP(myStack.peek()) != 'Opening Parentheses':
                myString += myStack.peek()
                myStack.pop()
            myStack.pop()
        elif x != '+' and x != '-' and x != '*' and x != '/': #skipping exponentation cause it isn't single character as we are assuming here single digit numbers and operators
            myString += x
        else:
            while myStack.isEmpty() == False and openingClosingP(myStack.peek()) != 'Opening Parentheses' and precedence(myStack.peek(),x):
                myString += myStack.peek()
                myStack.pop()
            myStack.push(x)
    while myStack.isEmpty() == False:
        myString += myStack.peek()
        myStack.pop()
    return myString
