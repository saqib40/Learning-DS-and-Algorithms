# Linked List is data stored in nodes aka blocks and 
# each node stores data as well as link to the next node 
# cause unlike arrays they aren't stored in a contiguous memory

#implementation

class Node:
    def __init__(self, data = None, pointer = None):
        self.data = data
        self.pointer = pointer

class linkedList:
    def __init__(self):
        self.head = None #this works as pointer to the linked list, helps us in accessing the head node, it's none here cause linked list is empty
    
    #Insertion
    def insertAtBeginning(self, data): # Time Complexity of O(1)
        node = Node(data, self.head)
        self.head = node
     
    def insertAtEnd(self, data): #Time Complexity of O(n)
        if self.head is None:
            self.head = Node(data, None)
            return
        
        myNode = self.head
        while myNode.pointer:
            myNode = myNode.pointer
            
        myNode.pointer = Node(data, None)
    
    def insertAt(self, n, data): #Time Complexity of O(n)
        myNode = self.head
        if n == 0:
            myNode = Node(data, self.head)
            self.head = myNode
        else:
            i = 0
            while i < n-1:
                myNode = myNode.pointer
                i += 1
            k = myNode.pointer
            myNode.pointer = Node(data, k)
    
    #Deletion (Once referenceCount of an object goes to 0 memory deallocation happens)
    def popFront(self):
        k = self.head.pointer
        self.head = k
    
    def popEnd(self):
        myNode = self.head
        while myNode.pointer.pointer:
            myNode = myNode.pointer
        myNode.pointer = None
    
    def popPosition(self, n):
        myNode = self.head
        if n == 0:
            k = myNode.pointer
            self.head = k
        else:
            i = 0
            while i < n-1:
                myNode = myNode.pointer
                i += 1
            k = myNode.pointer
            myNode.pointer = k.pointer
    
    #Printing the list
    
    #Iteratively
    def printList(self):
        if self.head is None:
            print('The linked list is empty')
            return
        myNode = self.head
        myString = ''
        while myNode:
            myString += str(myNode.data) + ','
            myNode = myNode.pointer
        print(myString)
    
    #Recursively
    #Print recursively in the forward direction
    def printListRecursively(self, currentNode):
        if currentNode == None:
            return
        print(currentNode.data)
        self.printListRecursively(currentNode.pointer)
    
    #Print recursively in the reverse order
    def printListRecursively2(self, currentNode):
        if currentNode == None:
            return
        self.printListRecursively2(currentNode.pointer)
        print(currentNode.data)
    
    #Finding the length
    def lengthIterative(self):
        length = 0
        myNode = self.head
        while myNode:
            myNode = myNode.pointer
            length += 1
        return length
    
    def lengthRecursive(self, currentNode, length = 0):
        if currentNode == None:
            return length
        return self.lengthRecursive(currentNode.pointer, length + 1)
    
    
    #Reversing the list
    def reverseIteratively(self):
        myNode = self.head
        previous = None
        while myNode:
            next = myNode.pointer
            myNode.pointer = previous
            previous = myNode
            myNode = next
        self.head = previous
    
    def reverseRecursively(self, currentNode):
        if currentNode.pointer == None:
            self.head = currentNode
            return
        self.reverseRecursively(currentNode.pointer)
        currentNode.pointer.pointer = currentNode
        currentNode.pointer = None #this is the only line idk why it's here
        
    
    #Searching
    
    def searchIterative(self, data):
        myNode = self.head
        while myNode:
            if myNode.data == data:
                return True
            myNode = myNode.pointer
        return False
    
    def searchRecursively(self, currentNode, data): #Time complexity of O(n)
        if currentNode == None:
            return False
        if currentNode.data == data:
            return True
        return self.searchRecursively(currentNode.pointer, data)
        

myLinkedList = linkedList()
myLinkedList.insertAtBeginning(3)
myLinkedList.insertAtBeginning(4)
myLinkedList.insertAtEnd(5)
myLinkedList.insertAt(1,7)
myLinkedList.printList()
