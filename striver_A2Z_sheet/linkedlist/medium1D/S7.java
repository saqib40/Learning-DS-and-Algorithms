public class S7 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    // method 1
    // use stack
    // TC O(n) & SC O(n)

    // method 2
    // TC O(n) & SC O(1)
    public ListNode reverse(ListNode head) {
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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        ListNode first = head;
        ListNode second = newHead;
        while(second != null) {
            if(first.val != second.val) {
                reverse(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverse(newHead);
        return true;
    }
}
