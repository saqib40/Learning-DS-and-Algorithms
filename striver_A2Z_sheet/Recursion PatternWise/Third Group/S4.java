import java.util.ArrayList;

public class S4 {
    class Solution {
        // Function to find all possible paths
        public ArrayList<String> ratInMaze(int[][] maze) {
            int n = maze.length;
            ArrayList<String> ans = new ArrayList<>();
            int[][] vis = new int[n][n];
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    vis[i][j] = 0;
                }
            }
            if(maze[0][0] == 1) solve(0,0,maze,n,ans, new StringBuilder(), vis);
            return ans;
        }
        static void solve(int i, int j, int a[][], int n, ArrayList<String>ans, StringBuilder move, int vis[][]) {
            if (i == n - 1 && j == n - 1) {
                ans.add(move.toString());
                return;
            }
            // i -> row && j -> column
            // downward
            if(i+1<n && vis[i+1][j] == 0 && a[i + 1][j] == 1) {
                vis[i][j] = 1;
                solve(i + 1, j, a, n, ans, new StringBuilder(move).append("D"), vis);
                vis[i][j] = 0;
            }
            // left
            if(j-1>=0 && vis[i][j-1] == 0 && a[i][j-1] == 1) {
                vis[i][j] = 1;
                solve(i, j - 1, a, n, ans, new StringBuilder(move).append("L"), vis);
                vis[i][j] = 0;
            }
            // right 
            if (j + 1 < n && vis[i][j + 1] == 0 && a[i][j + 1] == 1) {
                vis[i][j] = 1;
                solve(i, j + 1, a, n, ans, new StringBuilder(move).append("R"), vis);
                vis[i][j] = 0;
            }
            // upward
            if (i - 1 >= 0 && vis[i - 1][j] == 0 && a[i - 1][j] == 1) {
                vis[i][j] = 1;
                solve(i - 1, j, a, n, ans, new StringBuilder(move).append("U"), vis);
                vis[i][j] = 0;
            }
        }
    }
}
