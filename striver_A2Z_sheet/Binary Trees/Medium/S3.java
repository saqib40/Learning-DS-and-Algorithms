public class S3 {
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
    // Method 1; brute force with TC of O(n^2)
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
    public int diameterOfBT(TreeNode root, int max) {
        if (root == null) {
            return max;
        }
        
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        
        max = Math.max(max, lh + rh);

        max = diameterOfBT(root.left, max);
        max = diameterOfBT(root.right, max);
        
        return max;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return diameterOfBT(root, Integer.MIN_VALUE);
    }

    // Method 2; O(N)
    int max;
    public int diameterOfBT2(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int lh = diameterOfBT2(root.left);
        int rh = diameterOfBT2(root.right);
        max = Math.max(lh+rh, max);
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree2(TreeNode root) {
        diameterOfBT2(root);
        return max;
    }
}
