import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class S13 {
    // method 1
    // BFS
    // did the leetcode problem
    boolean bfs(int[][] graph, int[] color, int i) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        color[i] = 0;
        while(!q.isEmpty()) {
            int node = q.poll();
            for(int it : graph[node]) {
                if(color[it] == -1) {
                    color[it] = 1-color[node];
                    q.add(it);
                }
                else if(color[it] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for(int i=0; i<n; i++) color[i] = -1;
        for(int i=0; i<n; i++) {
            if(color[i] == -1) {
                if(bfs(graph, color, i) == false) {
                    return false;
                }
            }
        }
        return true;
    }
    // method 2
    // DFS
    // did the gfg problem
    boolean dfs(ArrayList<ArrayList<Integer>> adjL, int[] color, int i, int col) {
        color[i] = col;
        for(int it : adjL.get(i)) {
            if(color[it] == -1) {
                if(dfs(adjL, color, it, 1-col) == false) {
                    return false;
                }
            }
            else if(color[it] == col) {
                return false;
            }
        }
        return true;
    }
    public boolean isBipartitegfg(int V, int[][] edges) {
        // convert edges to adj list
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
        int[] color = new int[V];
        for(int i=0; i<V; i++) color[i] = -1;
        for(int i=0; i<V; i++) {
            if(color[i] == -1) {
                if(dfs(adjL, color, i, 0) == false) {
                    return false;
                }
            }
        }
        return true;
    }
}
