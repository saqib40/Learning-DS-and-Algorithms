public class uniquePath2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                // base case
                if(row == 0 && col == 0) {
                    if(obstacleGrid[row][col] == 1) {
                        dp[row][col] = 0;
                    } else {
                        dp[row][col] = 1;
                    }
                    continue;
                }
                if(obstacleGrid[row][col] == 1) {
                    dp[row][col] = 0;
                    continue;
                }
                int up = 0;
                int left = 0;
                if(row > 0) {
                    up = dp[row-1][col];
                }
                if(col > 0) {
                    left = dp[row][col-1];
                }
                dp[row][col] = up + left;
            }
        }
        return dp[m-1][n-1];
    }
}
