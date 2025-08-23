import java.util.ArrayList;

public class S6 {
    void dfs(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, int[] vis, int node) {
        vis[node] = 1;
        ans.add(node);
        for(int it : adj.get(node)) {
            if(vis[it] == 0) dfs(adj, ans,vis,it);
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] vis = new int[adj.size()];
        dfs(adj, ans, vis, 0);
        return ans;
    }
}
