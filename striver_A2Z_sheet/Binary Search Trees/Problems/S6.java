

public class S6 {
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
    public boolean isValidBST(TreeNode root, Integer[] temp) {
        if(root == null) {
            return true;
        }
        if(!isValidBST(root.left,temp)) {
            return false;
        }
        if(temp[0] != null && root.val <= temp[0]) {
                return false;
        }
        temp[0] = root.val;
        return isValidBST(root.right, temp);
    }
    public boolean isValidBST(TreeNode root) {
        Integer[] temp = new Integer[1];
        return isValidBST(root,temp);
    }
}
