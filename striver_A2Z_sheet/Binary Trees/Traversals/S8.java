
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S8 {
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
    // Basic print in levelOrder manner
    // O(n) as TC
    public void levelOrderP(TreeNode root) {
        if(root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode front = queue.poll();
            System.out.printf(front.val+" ");
            if(front.left != null) {
                queue.offer(front.left);
            }
            if(front.right != null) {
                queue.offer(front.right);
            }
        }
    }
    // O(n) as TC cause we enqueueing and dequeueing each node only once
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int sizeQ = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=1; i<=sizeQ; i++) {
                TreeNode front = queue.poll();
                temp.add(front.val);
                if(front.left != null) {
                    queue.offer(front.left);
                }
                if(front.right != null) {
                    queue.offer(front.right);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
