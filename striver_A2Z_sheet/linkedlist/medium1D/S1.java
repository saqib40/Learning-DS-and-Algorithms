public class S1 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    // method 1
    // brute force
    // do two traversals

    // method 2
    // single traversal
    // Tortoise-Hare method
    public ListNode middleNode(ListNode head) {
        ListNode slow = head; ListNode fast = head;
        if(head.next == null) {
            head = null;
            return head;
        }
        while(fast.next.next != null && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
