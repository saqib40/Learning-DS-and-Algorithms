public class S1 {
    static class Node {
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
    static Node constructLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1; i<arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
}
