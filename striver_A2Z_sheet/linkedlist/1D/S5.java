public class S5 {
    public class Node {
        int data;
        Node next;
        Node(int d) { 
            this.data = d; 
            this.next = null;
        }
    }
    static boolean searchKey(int n, Node head, int key) {
        if(head == null) {
            return false;
        }
        Node temp = head;
        while(temp.next != null) {
            if(temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return (temp.data==key) ? true:false;
    }
}
