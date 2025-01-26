public class queueLL {
    class QueueNode {
        int data;
        QueueNode next;
        QueueNode(int a) {
            data = a;
            next = null;
        }
    }

    QueueNode front, rear;

    queueLL() {
        front = null;
        rear = null;
    }

    void enQueue(int a)
	{
        QueueNode newNode = new QueueNode(a);
        if(front == null && rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
	}
    void deQueue()
    {
        if(front == null && rear == null) { // no element
            return;
        }
        if(front == rear) { // single element
            front = rear = null;
            return;
        }
        front = front.next;
    }

}
