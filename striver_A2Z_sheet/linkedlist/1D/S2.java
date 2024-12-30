public class S2 {
    class Node {
        int data;
        Node next;
    
        Node() {
            this.data = 0;
            this.next = null;
        }
        Node(int d) { 
            this.data = d; 
            this.next = null;
        }
    }
    Node insertAtEnd(Node head, int x) {
        // code here
        // to insert at end we have to iterate till end
        if(head == null) {
            return new Node(x);
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(x);
        return head;
    }
}
