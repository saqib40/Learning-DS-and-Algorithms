// we will have circular array implementation

public class queueArray {
    int front, rear;
    int arr[];

    queueArray() {
        front = -1;
        rear = -1;
        arr = new int[100];
    }
    
    void deQueue() {
        if(front == -1 && rear == -1) { // no element
            return;
        }
        if(front == rear) { // single element
            front = -1;
            rear = -1;
        } else {
            front = (front + 1)%100;
        }
    }

    void enQueue(int x) {
        if(((rear + 1)%100) == front) { // our array is full
            return;
        }
        if(front == -1 && rear == -1) {
            front = rear = 0;
        } else {
            rear = (rear+1)%100;
        }
        arr[rear] = x;
    }
}
