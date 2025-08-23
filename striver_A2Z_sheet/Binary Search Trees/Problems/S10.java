
import java.util.Stack;

public class S10 {
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
    class BSTIterator {
        Stack<TreeNode> st = new Stack<TreeNode>();
        void pushAll(TreeNode node) {
            while (node != null) { 
                st.push(node);
                node = node.left;
            }
        }
        public BSTIterator(TreeNode root) {
            pushAll(root);
        }
        public int next() {
            TreeNode top = st.pop();
            pushAll(top.right);
            return top.val;
        }
        
        public boolean hasNext() {
            return !st.isEmpty();
        }
    }
}
