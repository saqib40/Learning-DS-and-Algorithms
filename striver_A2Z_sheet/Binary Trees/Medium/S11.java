import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class S11 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data) {
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Pair {
        TreeNode node;
        int horizontal;
        Pair(TreeNode node, int horizontal) {
            this.node = node;
            this.horizontal = horizontal;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()) {
            Pair front = q.poll();
            int horizontal = front.horizontal;
            map.put(horizontal, front.node.val);
            if(front.node.left != null) {
                q.offer(new Pair(front.node.left, horizontal+1));
            }
            if(front.node.right != null) {
                q.offer(new Pair(front.node.right, horizontal+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        //System.out.println(ans);
        return ans;
    }
}
