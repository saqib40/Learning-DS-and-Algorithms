public class S8 {
    static void dfs(int row, int col, char mat[][], int vis[][]) {
        vis[row][col] = 1;
        int n = mat.length;
        int m = mat[0].length;
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        for(int i=0; i<4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if(nrow >=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && mat[nrow][ncol]=='O') {
                dfs(nrow,ncol,mat,vis);
            } 
        }
    }
    static char[][] fill(char mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int vis[][] = new int[n][m];
        // traverse first and last row
        for(int j=0; j<m; j++) {
            // first row
            if(vis[0][j] == 0 && mat[0][j] == 'O') {
                dfs(0, j, mat, vis);
            }
            // last row
            if(vis[n-1][j] == 0 && mat[n-1][j] == 'O') {
                dfs(n-1, j, mat, vis);
            }
        }
        // traverse first and last column
        for(int i=0; i<n; i++) {
            // first column
            if(vis[i][0] == 0 && mat[i][0] == 'O') {
                dfs(i,0,mat,vis);
            }
            // last column
            if(vis[i][m-1] == 0 && mat[i][m-1] == 'O') {
                dfs(i,m-1,mat,vis);
            }
        }
        // transform the given matrix
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(vis[i][j] == 0) {
                    mat[i][j] = 'X';
                }
            }
        }
        return mat;
    }
}