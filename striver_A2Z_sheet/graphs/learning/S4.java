import java.util.ArrayList;

public class S4 {
    void dfs(ArrayList<ArrayList<Integer>> adj, int[] vis, int node, ArrayList<Integer> temp) {
        vis[node] = 1;
        temp.add(node);
        for(int it : adj.get(node)) {
            if(vis[it] == 0) dfs(adj,vis,it, temp);
        }
    }
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // convert edges to adj list
        ArrayList<ArrayList<Integer>> adjL = new ArrayList<>();
        for(int i=0; i<V; i++) {
            adjL.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++) {
            // u and v represent vertices
            int u = edges[i][0];
            int v = edges[i][1];
            adjL.get(u).add(v);
            adjL.get(v).add(u);
        }
        // now the problem
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[] vis = new int[V];
        for(int i=0; i < adjL.size(); i++) {
            if(vis[i]==0) {
                ArrayList<Integer> temp = new ArrayList<>();
                dfs(adjL,vis,i, temp);
                ans.add(temp);
            }
        }
        return ans;
    }
}
