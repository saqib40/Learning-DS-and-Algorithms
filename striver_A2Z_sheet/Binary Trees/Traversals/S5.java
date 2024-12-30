
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public void preorderTraversal(TreeNode root, List<Integer> ans) {
        if(root == null) {
            return;
        }
        ans.add(root.val);
        preorderTraversal(root.left,ans);
        preorderTraversal(root.right,ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorderTraversal(root,ans);
        return ans;
    }

    // Iterative Preorder
    public List<Integer> iterativePreOrderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Stack<TreeNode> myStack = new Stack<>();
        myStack.add(root);
        while(!myStack.isEmpty()) {
            TreeNode top = myStack.pop();
            ans.add(top.val);
            if(top.right != null) {
                myStack.add(top.right);
            }
            if(top.left != null) {
                myStack.add(top.left);
            }
        }
        return ans;
    }
}
