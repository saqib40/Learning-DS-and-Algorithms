public class S2 {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static int floor(Node root, int x) {
        // Code here
        if (root == null) return -1;
        // Code here
        return floor(root,x,Integer.MIN_VALUE);
    }
    static int floor(Node root, int key, int floor) {
        if (root == null) return floor == Integer.MIN_VALUE ? -1 : floor;
        if(root.data == key) {
            return root.data;
        }
        else if (key < root.data) {
            //ceil = root.data;
            //floor = Math.max(root.data,floor);
            return floor(root.left,key,floor);
        }
        else {
            floor = Math.max(root.data,floor);
            return floor(root.right,key,floor);
        }
    }
}
