public class S5 {
    class StackNode {
        int data;
        StackNode next;
        StackNode(int a) {
            data = a;
            next = null;
        }
    }
    class MyStack {
        StackNode top;
        void push(int a) {
            // Add your code here
            if(top == null) {
                top = new StackNode(a);
            } else {
                StackNode temp = new StackNode(a);
                temp.next = top;
                top = temp;
            }
        } 
    
        int pop() {
            // Add your code here
            if(top == null) {
                return -1;
            }
            int temp = top.data;
            top = top.next;
            return temp;
        }
    }
}
