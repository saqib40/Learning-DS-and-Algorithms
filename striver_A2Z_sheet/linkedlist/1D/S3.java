public class S3 {
    // since we aren't allowed to traverse
    // and we been told that given node isn't last node
    // so hum yeh karey gay
    // ki agley node ka value given node mai copy karo
    // aur agley node ko remove karo
    // TC O(1)
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
