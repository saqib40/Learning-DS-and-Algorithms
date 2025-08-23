import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class S5 {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] vis = new int[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = 1;
        while(!q.isEmpty()) {
            int front = q.poll();
            ans.add(front);
            for(int it : adj.get(front)) {
                if(vis[it] != 1) {
                    q.add(it);
                    vis[it] = 1;
                }
            }
        }
        return ans;
    }
}
