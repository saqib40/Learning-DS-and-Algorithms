public class S2 {
    class MyQueue {

        int front, rear;
        int arr[] = new int[100005];
    
        MyQueue()
        {
            front=-1;
            rear=-1;
        }
        
        //Function to push an element x in a queue.
        void push(int x)
        {
            // Your code here
            if(front == -1 && rear == -1) { //  empty stack
                front = 0;
                rear = 0;
            } else {
                rear = rear + 1;
            }
            arr[rear] = x;
            
        } 
    
        //Function to pop an element from queue and return that element.
        int pop()
        {
            // Your code here
            if(front == -1 && rear == -1) { //  empty stack
                return -1;
            }
            if(front == rear) { // single element
                int temp = arr[front];
                front = -1;
                rear = -1;
                return temp;
            }
            int temp = arr[front];
            front = front+1;
            return temp;
        } 
    }
}
