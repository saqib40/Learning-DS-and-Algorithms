import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class S7 {
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
    
    public void postorderTraversal(TreeNode root, List<Integer> ans) {
        if(root == null) {
            return;
        }
        postorderTraversal(root.left,ans);
        postorderTraversal(root.right,ans);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorderTraversal(root,ans);
        return ans;
    }
    // iterative postorder using two stacks
    public List<Integer> iterativePostOrderTraversal1(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root);
        while(!stack1.isEmpty()) {
            TreeNode top = stack1.pop();
            stack2.push(top);
            if(top.left != null) {
                stack1.push(top.left);
            }
            if(top.right != null) {
                stack1.push(top.right);
            }
        }
        while (!stack2.isEmpty()) { 
            ans.add(stack2.pop().val);
        }
        return ans;
    }
    // iterative postorder using single stack, not intuitive
    public List<Integer> iterativePostOrderTraversal2(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        while (curr != null || !stack.isEmpty()) { 
            if(curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode temp = stack.peek().right;
                if(temp == null) {
                    temp = stack.pop();
                    ans.add(temp.val);
                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        ans.add(temp.val);
                    }
                } else {
                    curr = temp;
                }
            }
        }
        return ans;
    }
}
