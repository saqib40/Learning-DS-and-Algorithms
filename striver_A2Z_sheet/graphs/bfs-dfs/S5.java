import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class S5 {
    class Pair {
        int curr;
        int parent;
        Pair(int curr, int parent) {
            this.curr = curr;
            this.parent = parent;
        }
    }
    public boolean checkCycle(int src, int V, ArrayList<ArrayList<Integer>> adjL, boolean[] vis) {
        vis[src] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        while(!q.isEmpty()) {
            int curr = q.peek().curr;
            int parent = q.peek().parent;
            q.remove();
            for(int adjNode : adjL.get(curr)) {
                if(!vis[adjNode]) {
                    vis[adjNode] = true;
                    q.add(new Pair(adjNode, curr));
                }
                else if(parent != adjNode) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        // create adj list
        ArrayList<ArrayList<Integer>> adjL = new ArrayList<>();
        for(int i=0; i<V; i++) {
            adjL.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adjL.get(u).add(v);
            adjL.get(v).add(u);
        }
        // now the problem
        boolean vis[] = new boolean[V];
        for(int i=0; i<V; i++) {
            if(!vis[i]) {
                if(checkCycle(i, V, adjL, vis)) return true;
            }
        }
        return false;
    }
}
