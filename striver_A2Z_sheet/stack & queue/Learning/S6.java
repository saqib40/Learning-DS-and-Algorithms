public class S6 {
    class MyQueue
{
    class QueueNode {
        int data;
        QueueNode next;
        QueueNode(int a) {
            data = a;
            next = null;
        }
    }
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode newNode = new QueueNode(a);
        if(front == null && rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front == null && rear == null) { // no element
            return -1;
        }
        if(front == rear) { // single element
            int temp = front.data;
            front = rear = null;
            return temp;
        }
        int temp = front.data;
        front = front.next;
        return temp;
	}
}
}
