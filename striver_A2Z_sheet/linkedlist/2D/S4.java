public class S4 {
    class DLLNode {
        int data;
        DLLNode next;
        DLLNode prev;
    
        DLLNode(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }
    DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode temp = head;
        while(temp.next != null) {
            DLLNode c = temp.next;
            temp.next = temp.prev;
            temp.prev = c;
            temp = c;
        }
        // now fix the last node
        DLLNode c = temp.prev;
        temp.next = c;
        temp.prev = null;
        head = temp;
        return head;
    }
}
