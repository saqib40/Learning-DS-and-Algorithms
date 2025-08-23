
import java.util.ArrayList;
import java.util.List;

public class S5 {
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
    // method 1
    class Solution {
        public void inorderTraversal(TreeNode root, List<Integer> ans) {
            if(root == null) {
                return;
            }
            inorderTraversal(root.left,ans);
            ans.add(root.val);
            inorderTraversal(root.right,ans);
        }
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            inorderTraversal(root,ans);
            return ans;
        }
        public int kthSmallest(TreeNode root, int k) {
            List<Integer> sorted = inorderTraversal(root);
            return sorted.get(k-1);
        }
    }
    // method 2
    class Solution2 {
        int count = 0;
        int result = -1;
        void inorder(TreeNode root, int k) {
            if (root == null) return;
            inorder(root.left, k);
            count++;
            if (count == k) {
                result = root.val;
                return;
            }
            inorder(root.right, k);
        }
        public int kthSmallest(TreeNode root, int k) {
            inorder(root,k);
            return result;
        }
    }
}
