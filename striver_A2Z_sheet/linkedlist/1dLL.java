public class 1dLL {
    class Node {
        int data; 
        Node pointer; 
        Node(int data, Node pointer) {
            this.data = data;
            this.pointer = pointer;
        }
    }
    class LinkedList {
        Node head;
        LinkedList() {
            this.head = null;
        }
        // insert an element at a particular index
        void insertAt(int data, int i) {
            if(i==0 || this.head == null) { // at beginning
                this.head = new Node(data, this.head);
            }
            else { // at random index, handles end as well
                int j=0;
                Node temp = this.head;
                while(j<i-1 && temp.pointer != null) {
                    temp = temp.pointer;
                    j++;
                }
                temp.pointer = new Node(data,temp.pointer);
            }
        }
        // delete an element at a particula index
        void deleteAt(int i) {
            if(i==0 && this.head != null) { // at beginning
                this.head = this.head.pointer;
            }
            else { // at random index, handles end as well
                int j = 0;
                Node temp = this.head;
                while(j<i-1 && temp.pointer.pointer != null) {
                    temp = temp.pointer;
                }
                if(temp.pointer.pointer == null) {
                    temp.pointer = null;
                }
                else {
                    temp.pointer = temp.pointer.pointer;
                }
            }
        }
        // access an element's data at a particular index
        int accessAt(int i) {
            if(i==0 && this.head != null) {
                return this.head.data;
            }
            else {
                int j = 0;
                Node temp = this.head;
                while (j<i && temp.pointer != null) { 
                    temp = temp.pointer;
                }
                return temp.data;
            }
        }
    }
}
