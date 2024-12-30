import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean LTR = true;
        while(!queue.isEmpty()) {
            int size = queue.size();
            //List<Integer> temp = new ArrayList<>();
            LinkedList<Integer> temp = new LinkedList<>();
            for(int i=0; i<size; i++) {
                TreeNode front = queue.poll();
                // find the position to fill the node
                //int index = (LTR) ? i:(size-1-i);
                //temp.add(index, front.val);
                if (LTR) {
                    temp.addLast(front.val);
                } else {
                    temp.addFirst(front.val);
                }
                if(front.left != null) {
                    queue.offer(front.left);
                }
                if(front.right != null) {
                    queue.offer(front.right);
                }
            }
            result.add(temp);
            LTR = !LTR;
        }
        return result;
    }
}
