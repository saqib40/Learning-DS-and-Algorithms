public class S2 {
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
    Node addNode(Node head, int p, int x) {
        // Your code here
        if(head==null) { // your DLL is empty
            head = new Node(x);
            
        }
        else {
            int j = 0;
            Node temp = head;
            while(j<p && temp.next != null) {
                temp = temp.next;
                j++;
            }
            if(temp.next == null) {
                // we have reached the end
                Node newOne = new Node(x);
                temp.next = newOne;
                newOne.prev = temp;
            }
            else {
                // we are somewhere in middle
                Node newOne = new Node(x);
                newOne.next = temp.next;
                newOne.prev = temp;
                temp.next.prev = newOne;
                temp.next = newOne;
            }
        }
        return head;
    }
}
