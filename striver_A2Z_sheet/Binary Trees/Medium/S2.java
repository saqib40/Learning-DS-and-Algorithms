public class S2 {
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
    public boolean isBalanced(TreeNode root) {
        if(hBalanced(root) == -1) {
            return false;
        } else {
            return true;
        }
    }
    public int hBalanced(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int lh = hBalanced(root.left);
        int rh = hBalanced(root.right);
        if(lh == -1 || rh == -1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return Math.max(lh,rh)+1;
    }
}
