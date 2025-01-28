public class S1 {
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
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        return findCeil(root,key,Integer.MAX_VALUE);
    }
    int findCeil(Node root, int key, int ceil) {
        if (root == null) return ceil == Integer.MAX_VALUE ? -1 : ceil;
        if(root.data == key) {
            return root.data;
        }
        else if (key < root.data) {
            //ceil = root.data;
            ceil = Math.min(root.data,ceil);
            return findCeil(root.left,key,ceil);
        }
        else {
            return findCeil(root.right,key,ceil);
        }
    }
}
