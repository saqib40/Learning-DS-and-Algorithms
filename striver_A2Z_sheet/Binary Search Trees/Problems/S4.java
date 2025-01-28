public class S4 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key); // Update left subtree
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key); // Update right subtree
        } else {
            // Node to delete found
            if (root.left == null && root.right == null) {
                // Case 1: Leaf node
                root = null;
                //return null;
            } else if (root.left == null) {
                // Case 2: One child (right)
                root = root.right;
                //return root;
            } else if (root.right == null) {
                // Case 2: One child (left)
                root = root.left;
                //return root;
            } else {
                // Case 3: Two children
                TreeNode successor = findMin(root.right); // Find in-order successor
                root.val = successor.val; // Replace value with successor's value
                root.right = deleteNode(root.right, successor.val); // Delete successor
            }
        }
        return root;
    }
    
    // Helper function to find the smallest value in a subtree
    public TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    
}
