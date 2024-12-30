public class S11 {
    // print all elements of a matrix
    public static void printer(int[][] nums) {
        int nr = nums.length; // rows
        int nc = nums[0].length; // columns
        for(int i=0; i<nr; i++) {
            for(int j=0; j<nc; j++) {
                System.out.println(nums[i][j]);
            }
        }
    }
    // Method 1; Brute Force, TC is O(n^3) and SC is O(1)
    // Method 2; Little Optimisation, TC is O(n^2) and SC is O(n)
    // Method 3; Optimal, TC is O(n^2) and SC is O(1)
    public void setZeroes(int[][] matrix) {
        int nr = matrix.length;
        int nc = matrix[0].length;
        int col0 = 1;
        // to update the first row and column
        for(int i=0; i<nr; i++) {
            for(int j=0; j<nc; j++) {
                if(matrix[i][j] == 0) {
                    if(i==0) {
                        matrix[0][0] = 0;
                    }
                    if(j==0) {
                        col0 = 0;
                    }
                    if(i != 0 && j != 0) {
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                    //matrix[0][j] = 0;
                    //matrix[i][0] = 0;
                }
            }
        }
        // to update the matrix according to first row and column
        for(int i=1; i<nr; i++) {
            for(int j=1; j<nc; j++) {
                if(matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        // to fix first row and first column
        // fix row first
        if(matrix[0][0] == 0) {
            for(int i=1; i<nc; i++) {
                matrix[0][i] = 0;
            }
        }
        // now fix the column
        if(col0 == 0) {
            for(int i=0; i<nr; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
