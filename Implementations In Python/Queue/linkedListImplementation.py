class Node:
    def __init__(self, data = None, pointer = None):
        self.data = data
        self.pointer = pointer

class Queue:
    def __init__(self):
        self.front = self.rear = None
    
    def enQueue(self, data):
        myNode = Node(data, None)
        if self.front == None and self.rear == None:
            self.front = self.rear = myNode
        else:
            self.rear.pointer = myNode
            self.rear = myNode
    
    def deQueue(self):
        if self.front == None:
            return
        elif self.front == self.rear:
            self.front = self.rear = None
        else:
            myNode = self.front #we did this
            self.front = self.front.pointer
            del myNode # and we did this to free the memory (but we don't need to do it here cause once reference count reaches zero it happens in python automatically)
    
    def isEmpty(self):
        if self.front == None and self.rear == None:
            return True
        else:
            return False
    
    def Front(self):
        if self.front == None and self.rear == None:
            return
        else:
            return self.front.data
