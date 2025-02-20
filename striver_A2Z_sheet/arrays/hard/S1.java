import java.util.ArrayList;
import java.util.List;

public class S1 {
    // variation 1
    // Given the number of rows n. Print the first n rows of Pascal’s triangle.
    // O(n^2)
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> iterator = new ArrayList<>();
        iterator.add(1);
        ans.add(iterator);
        for(int i=1; i<numRows; i++) {
            List<Integer> answer = new ArrayList<>();
            answer.add(1);
            for(int j=0; j<iterator.size()-1; j++) {
                answer.add(iterator.get(j) + iterator.get(j+1));
            }
            answer.add(1);
            ans.add(answer);
            iterator = answer;
        }
        return ans;
    }

    // variation 2
    // Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.
    // O(r) = O(c-1), c = number of columns
    public int nCr(int n, int r) {
        int ans = 1;
        for(int i=0; i<r; i++) {
            ans = ans*(n-i);
            ans = ans/(i+1);
        }
        return ans;
    }

    // variation 3
    // Generating a particular column
    // O(n)
    // we gonna print it
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        int val = 1;
        ans.add(val);
        for(int i=1; i<=rowIndex; i++) {
            val = val * (rowIndex-i+1)/i;
            ans.add(val);
        }
        return ans;
    }
}
