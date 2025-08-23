import java.util.ArrayList;

public class S1 {
    void dfs(ArrayList<ArrayList<Integer>> adj, int[] vis, int node) {
        vis[node] = 1;
        for(int it : adj.get(node)) {
            if(vis[it] == 0) dfs(adj,vis,it);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        // convert adjM to adjL
        ArrayList<ArrayList<Integer>> adjL = new ArrayList<>();
        for(int i=0; i<isConnected.length; i++) {
            adjL.add(new ArrayList<>());
        }
        for(int i=0; i<isConnected.length; i++) {
            for(int j=0; j<isConnected.length; j++) {
                if(isConnected[i][j] == 1 && i != j) {
                    adjL.get(i).add(j);
                    adjL.get(j).add(i);
                }
            }
        }
        // now the problem
        int counter = 0;
        int[] vis = new int[adjL.size()];
        for(int i=0; i<adjL.size(); i++) {
            if(vis[i] == 0) {
                counter++;
                dfs(adjL, vis, i);
            }
        }
        return counter;
    }
}
