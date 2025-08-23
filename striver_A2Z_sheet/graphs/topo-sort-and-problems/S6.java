import java.util.ArrayList;
import java.util.List;

public class S6 {
    boolean dfs(int i, List<List<Integer>> adj, int vis[], int pathVis[], int check[]) {
        vis[i] = 1;
        pathVis[i] = 1;
        check[i] = 0;
        for(int it : adj.get(i)) {
            if(vis[it] == 0) {
                if(dfs(it,adj,vis,pathVis,check) == true) return true;
            } else if (pathVis[it] == 1) {
                return true;
            }
        }
        check[i] = 1;
        pathVis[i] = 0;
        return false;
    }
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
        int vis[] = new int[V];
        int pathVis[] = new int[V];
        int check[] = new int[V];
        for(int i=0; i<V; i++) {
            if(vis[i] == 0) {
                dfs(i, adj, vis, pathVis, check);
            }
        }
        List<Integer> safeNodes = new ArrayList<>();
        for(int i=0; i<V; i++) {
            if(check[i] == 1) safeNodes.add(i);
        }
        return safeNodes;
    }
}
