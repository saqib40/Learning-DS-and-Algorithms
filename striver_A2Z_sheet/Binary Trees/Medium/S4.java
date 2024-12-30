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
    int maxSum = Integer.MIN_VALUE;
    public int maxSinglePathSum(TreeNode root) { // returns max single path sum
        if(root == null) {
            return 0;
        }
        int maxSumL = Math.max(0,maxSinglePathSum(root.left));
        int maxSumR = Math.max(0,maxSinglePathSum(root.right));
        maxSum = Math.max(root.val+maxSumL+maxSumR,maxSum);
        return root.val + Math.max(maxSumL, maxSumR);
    }
    public int maxPathSum(TreeNode root) {
        maxSinglePathSum(root);
        return maxSum;
    }
}
