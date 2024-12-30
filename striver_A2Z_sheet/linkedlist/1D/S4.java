public class S4 {
    public class Node {
        int data;
        Node next;
        Node(int d) { 
            this.data = d; 
            this.next = null;
        }
    }
    public int getCount(Node head) {
        // code here
        if(head == null) {
            return 0;
        }
        int length = 1;
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }
}
