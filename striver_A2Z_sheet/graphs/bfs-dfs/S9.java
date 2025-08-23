public class S9 {
    // Method 1
    // quite similar to S8 => DFS
    void dfs(int row, int col, int grid[][], int vis[][]) {
        vis[row][col] = 1;
        int n = grid.length;
        int m = grid[0].length;
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        for(int i=0; i<4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if(nrow >=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1) {
                dfs(nrow,ncol,grid,vis);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        // traverse first and last row
        for(int j=0; j<m; j++) {
            // first row
            if(vis[0][j] == 0 && grid[0][j] == 1) {
                dfs(0, j, grid, vis);
            }
            // last row
            if(vis[n-1][j] == 0 && grid[n-1][j] == 1) {
                dfs(n-1, j, grid, vis);
            }
        }
        // traverse first and last column
        for(int i=0; i<n; i++) {
            // first column
            if(vis[i][0] == 0 && grid[i][0] == 1) {
                dfs(i,0,grid,vis);
            }
            // last column
            if(vis[i][m-1] == 0 && grid[i][m-1] == 1) {
                dfs(i,m-1,grid,vis);
            }
        }
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 1 && vis[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    // Method 2
    // BFS => Multisource BFS, striver nai kya hai yeh
    // do it some other day
    // quite similar to problems that we have already done
}
