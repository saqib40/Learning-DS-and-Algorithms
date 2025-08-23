import java.util.HashSet;

public class S12 {
    class Pair {
        int first;
        int second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    void dfs(int row, int col, StringBuilder sb, int[][] grid, int[][] vis, int row0, int col0) {
        vis[row][col] = 1;
        sb.append((row - row0) + "," + (col - col0) + " ");
        int n = grid.length;
        int m = grid[0].length;
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        for(int i=0; i<4; i++) {
            int nrow = row+delrow[i];
            int ncol = col+delcol[i];
            if(nrow >=0 && nrow<n && ncol>=0 && ncol<m && vis[row][col]==0 && grid[row][col]==1) {
                dfs(nrow, ncol, sb, grid, vis, row0, col0);
            }
        }
    }
    int countDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(vis[i][j] == 0 && grid[i][j] == 1) {
                    StringBuilder sb = new StringBuilder();
                    dfs(i,j,sb,grid,vis,i,j);
                    set.add(sb.toString());
                }
            }
        }
        return set.size();
    }
}
