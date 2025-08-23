public class S1 {
    // question 1
    static boolean isBSTTraversal(int arr[]) {
        // code here
        for(int i=1; i<arr.length; i++) {
            if(arr[i] <= arr[i-1]) return false;
        }
        return true;
    }
    // question 2
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
    boolean isBstUtil(Node root, int min, int max) {
        if(root == null) {
            return true;
        }
        if(root.data > max || root.data < min) {
            return false;
        }
        return isBstUtil(root.left, min, root.data) && isBstUtil(root.right, root.data, max);
    }
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        return isBstUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
