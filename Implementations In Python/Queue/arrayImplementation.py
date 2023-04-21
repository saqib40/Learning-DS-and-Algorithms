#A queue is a first-in-first-out (FIFO) type of data structure
#with the restriction that insertion happens at one end (rear)
#and deletion at other end (front)
#also all operations on it just like in stacks must take constant time i.e having TC of O(1)

#Array Implementation
#In a circular array
#If i = current element
#Next element = (i + 1) % N , where N = no of elements of array

myArray = [0] * 10
front = rear = -1
n = len(myArray)

def isEmpty():
    if front == -1 and rear == -1:
        return True
    else:
        return False

def Front():
    if front == -1: #when queue is empty
        return
    else:
        return myArray[front]

def enqueue(x):
    global rear
    global front
    if (rear + 1) % n == front: #The array is full
        return
    elif isEmpty():
        front = rear = 0
    else:
        rear = (rear + 1) % n
    myArray[rear] = x

def dequeue():
    global rear
    global front
    if isEmpty():
        return
    elif front == rear: #happens when there's single element in our queue
        front = rear = -1
    else:
        front = (front + 1) % n

def printQueue():
    i = front
    myString = ''
    while i != rear:
        myString += str(myArray[i]) + ' '
        i = (i + 1) % n
    return myString + str(myArray[rear])
