#Here's linked list implementation of stack
#Preferred cause no need to worry about overflow / memory exhaustion 
#unless you exhaust the memory of system
#One con is extra memory is used to store pointer variables
#but that's ok compared to arrays cause overthere a lot of
#memory remains unused and hence wasted

class Node:
    def __init__(self, data = None, pointer = None):
        self.data = data
        self.pointer = pointer

class Stack:
    def __init__(self):
        self.top = None
    
    def push(self, data):
        myNode = Node(data, self.top)
        self.top = myNode
    
    def pop(self):
        if self.top == None:
            print('No element to pop')
            return
        k = self.top.pointer
        self.top = k
    
    def isEmpty(self):
        return True if self.top == None else False
    
    def top(self):
        return self.top.data
