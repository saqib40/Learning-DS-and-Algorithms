public class S1 {
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
    Node constructDLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1; i<arr.length; i++) {
            Node newOne = new Node(arr[i]);
            newOne.prev = temp;
            temp.next = newOne;
            temp = temp.next;
        }
        return head;
    }
}
