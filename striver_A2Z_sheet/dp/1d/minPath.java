public class minPath {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int r=0; r<m; r++) {
            for(int c=0; c<n; c++) {
                // base case
                if(r == 0 && c == 0) {
                    dp[r][c] = grid[r][c];
                    continue;
                }
                // can go up
                int sumUp = Integer.MAX_VALUE;
                if(r > 0) {
                    sumUp = grid[r][c] + dp[r-1][c];
                }
                // can go left
                int sumLeft = Integer.MAX_VALUE;
                if(c > 0) {
                    sumLeft = grid[r][c] + dp[r][c-1];
                }
                dp[r][c] = Math.min(sumUp, sumLeft);
            }
        }
        return dp[m-1][n-1];
    }
}
