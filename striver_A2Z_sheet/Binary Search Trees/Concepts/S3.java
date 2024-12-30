public class S3 {
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
    int minValue(Node root) {
        // code here
        if(root == null) {
            return -1;
        }
        if(root.left == null) {
            return root.data;
        }
        return minValue(root.left);
    }
}
