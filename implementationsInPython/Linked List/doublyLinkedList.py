#Doubly Linked List has a pointer to the next node and a pointer to the previous node

class Node:
    def __init__(self, data = None, pointerNext = None, pointerPrev = None):
        self.data = data
        self.pointerNext = pointerNext
        self.pointerPrev = pointerPrev

class dLinkedList:
    def __init__(self):
        self.head = None
    
    #insertion
    def insertAtBeginning(self, data):
        node = Node(data, self.head, None)
        self.head = node
    
    def insertAtEnd(self, data):
        myNode = self.head
        while myNode.pointerNext:
            myNode = myNode.pointerNext
        myNode.pointerNext = Node(data, None, myNode)
    
    def insertAt(self, n, data):
        myNode = self.head
        if n == 0:
            node = Node(data, self.head, None)
            self.head = node
        else:
            i = 0
            while i < n-1:
                myNode = myNode.pointerNext
                i += 1
            k = myNode.pointerNext
            myNode.pointerNext = k.pointerPrev = Node(data, k, myNode)
    
    #similarly deletion, search, length & reverse operations can be done
    
    def printList(self):
        if self.head is None:
            print('The linked list is empty')
            return
        myNode = self.head
        myString = ''
        while myNode:
            myString += str(myNode.data) + ','
            myNode = myNode.pointerNext
        print(myString)

myLinkedList = dLinkedList()
myLinkedList.insertAtBeginning(3)
myLinkedList.insertAtBeginning(4)
myLinkedList.insertAtEnd(5)
myLinkedList.insertAt(1,7)
myLinkedList.printList()