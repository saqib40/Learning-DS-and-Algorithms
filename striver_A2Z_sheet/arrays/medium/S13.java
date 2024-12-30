import java.util.ArrayList;
import java.util.List;

public class S13 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0; int bottom = n-1;
        int left = 0; int right = m-1;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(left<=right && top<=bottom) {
            for(int i=left; i<=right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            // more conditions for single row and column
            // single row
            if(top<=bottom) {
                for(int i=right; i<=left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // single column
            if(left<=right) {
                for(int i=bottom; i<=top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
