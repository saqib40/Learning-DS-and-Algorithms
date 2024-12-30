public class S2S3 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseListIteratively(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        if(current == null) {
            return head;
        }
        while(current.next != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        current.next = prev;
        head = current;
        return head;
    }
    public ListNode reverseListRecursively(ListNode head) {
        if(head == null || head.next == null) { // base case of empty or termination
            return head;
        }
        ListNode newHead = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null; // to ensure null for the first element after reversal, if omitted cycyle is created between first and second element
        return newHead;
    }
}
