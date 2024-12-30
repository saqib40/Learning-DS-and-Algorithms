public class 2dLL {

    class Node {
        int data;
        Node next;
        Node prev;
        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    class dLinkedList {
        Node head;

        dLinkedList() {
            this.head = null;
        }

        void inserAt(int data, int i) {
            if(i==0 || this.head == null) {
                this.head = new Node(data,this.head,null);
            }
            else {
                int j = 0;
                Node temp = this.head;
                while(j<i-1 && temp.next != null) {
                    temp = temp.next;
                }
                if(temp.next == null) { // handles insertion at the end
                    temp.next = new Node(data,null,temp);
                }
                else { // handles intermediate insertion
                    Node newOne = new Node(data,temp.next,temp);
                    temp.next.prev = newOne;
                    temp.next = newOne;
                }
            }
        }

        void deleteAt(int i) {
            // easy peazy
        }

        void accessAt(int i) {
            // easy peazy
        }
    }
}
