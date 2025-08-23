import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class S10 {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    static class Pair {
        Node node;
        int vertical;
        Pair(Node node, int vertical) {
            this.node = node;
            this.vertical = vertical;
        }
    }
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()) {
            Pair front = q.poll();
            int vertical = front.vertical;
            map.put(vertical, front.node.data);
            if(front.node.left != null) {
                q.offer(new Pair(front.node.left, vertical-1));
            }
            if(front.node.right != null) {
                q.offer(new Pair(front.node.right, vertical+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
}
