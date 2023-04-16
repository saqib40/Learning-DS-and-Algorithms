#Stack is a linear data structure with the restriction
#that insertion and deletion can be performed only
#from one end called the top of stack

#Array Implementation 

#Method 1
#A part of array can't store our stack like in C++ but the whole array (usually)
#It's cause we can't initialize an array with a given size in Python

myStack = []

myStack.append(3) #Time Complexity of O(n)
myStack.append(4)
print(myStack)
myStack.pop() #Time complexity of O(1)
print(myStack)

#Method 2
#Making a part of array do the job
#Cause it turns out we can actually 
#initialize an array of a specific datatype with a given size 
#though the method isn't built in and we will have to handle the
#edge case of overflow manually
#Why we need this case is that appending takes constant time 
#except when overflow happens 
#In the case above appending operation always has time complexity of O(n)

A = [0] * 10 #An integer array of size 10, it will look like this; [0,0,0,...], if size of array is m and we are multiplying by n then time complexity will be O(mn)

top = -1

def push(data):
    global top
    if top == len(A) - 1:
        print('Error: stack overflow') #You can get rid of this error by making the array dynamic 
        return
    top += 1
    A[top] = data

def pop():
    global top
    if top == -1:
        print('Error: No element in stack to pop')
        return
    top -= 1

def Top():
    if top == -1:
        print('Error: Stack is empty')
    return A[top]

def IsEmpty():
    return True if top == -1 else False

def printS():
    result = ''
    i = 0
    while i <= top:
        result += str(A[i]) + ' '
        i += 1
    print(result)

push(3)
push(4)
push(8)
printS()
pop()
push(5)
printS()
pop()
printS()
