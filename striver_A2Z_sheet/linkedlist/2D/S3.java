public class S3 {
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int x) {
            this.data = x;
            this.next = null;
            this.prev = null;
        }
    }
    // position 1-indexed
    public Node deleteNode(Node head, int x) {
        // code here
        Node temp = head;
        if(x==1) { // to delete the first node
            head.next.prev = null;
            head = head.next;
        }
        int j = 1;
        while(j<x-1 && temp.next != null) {
            temp = temp.next;
            j++;
        }
        if(temp.next.next == null) { // to delete the last node
            temp.next = null;
        }
        else { // to delete somewhere in the middle
            temp.next.next.prev = temp;
            temp.next = temp.next.next;
        }
        return head;
    }
}
