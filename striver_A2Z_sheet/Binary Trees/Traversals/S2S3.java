import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class S2S3 {
    static class Node {
        int val;
        Node left;
        Node right;
        Node (int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }
    public static void createTree(Node root0, ArrayList<Integer> v ){
        // Code here
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root0);
        int i = 1;
        while(!queue.isEmpty()) {
            Node curr = queue.poll();
            // create the left child
            if(i<v.size()) {
                curr.left = new Node(v.get(i));
                queue.offer(curr.left);
                i++;
            }
            // create the right child
            if(i<v.size()) {
                curr.right = new Node(v.get(i));
                queue.offer(curr.right);
                i++;
            }
        }
    }

}
