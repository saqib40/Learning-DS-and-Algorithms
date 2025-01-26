public class removeLoop {
    class Node
    {
        int data;
        Node next;
    }
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) {
            // If the list is empty or contains only one node, no loop is possible.
            return;
        }
        // code here
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // Special case: if the loop starts from the head, move fast to the end of the loop
            if(slow==fast) {
                slow = head;
                if(slow == fast) {
                    while (fast.next != slow) {
                        fast = fast.next;
                    }
                } else {
                    while(slow.next != fast.next) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                }
                fast.next = null;
                return;
            }
        }
        return;
    }
}
