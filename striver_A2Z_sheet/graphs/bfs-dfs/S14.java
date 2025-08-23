import java.util.ArrayList;

public class S14 {
    boolean dfs(int[] vis, int[] pathVis, int i, ArrayList<ArrayList<Integer>> adjL) {
        vis[i] = 1;
        pathVis[i] = 1;
        for(int it : adjL.get(i)) {
            if(vis[it] == 0) {
                if(dfs(vis,pathVis,it,adjL) == true) return true;
            } else if(pathVis[it] == 1) {
                return true;
            }
        }
        pathVis[i] = 0; // backtrack
        return false;
    }
    // directed graph cycle
    public boolean isCyclic(int V, int[][] edges) {
        // convert edges to adjL
        ArrayList<ArrayList<Integer>> adjL = new ArrayList<>();
        for(int i=0; i<V; i++) {
            adjL.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adjL.get(u).add(v);
            //adjL.get(v).add(u);
        }
        // now the question
        int[] vis = new int[V];
        int[] pathVis = new int[V];
        for(int i=0; i<V; i++) {
            if(vis[i] == 0) {
                if(dfs(vis, pathVis, i, adjL) == true) return true;
            }
        }
        return false;
    }
}
