import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class S4 {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
        }
        TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
        }
        TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
        }
    };
    static class Pair {
        TreeNode first;
        int sec;
        Pair(TreeNode first, int sec) {
            this.first = first;
            this.sec = sec;
        }
    }
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        // Write your code here.
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> PreOrder = new ArrayList<>();
        List<Integer> InOrder = new ArrayList<>();
        List<Integer> PostOrder = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        stack.add(new Pair(root,1));
        while(!stack.isEmpty()) {
            Pair top = stack.peek();
            if(top.sec == 1) {
                PreOrder.add(top.first.data);
                top.sec++;
                if(top.first.left != null) {
                    stack.add(new Pair(top.first.left,1));
                }
            }
            else if(top.sec == 2) {
                InOrder.add(top.first.data);
                top.sec++;
                if(top.first.right != null) {
                    stack.add(new Pair(top.first.right,1));
                }
            }
            else if(top.sec == 3) {
                PostOrder.add(top.first.data);
                stack.pop();
            }
        }
        ans.add(InOrder);
        ans.add(PreOrder);
        ans.add(PostOrder);
        return ans;
    }
}
