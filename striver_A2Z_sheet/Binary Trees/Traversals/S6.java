
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public List<Integer> iterativeInorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Stack<TreeNode> myStack = new Stack<>();
        TreeNode node = root;
        while(true) {
            if(node != null) {
                myStack.push(node);
                node = node.left;
            } else {
                if(myStack.isEmpty()) {
                    break;
                }
                node = myStack.pop();
                ans.add(node.val);
                node = node.right;
            }
        }
        return ans;
    }
}
