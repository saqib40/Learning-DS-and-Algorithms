import java.util.ArrayList;
import java.util.List;

public class S3 {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> answer = new ArrayList<>();
        int subsets = 1<<n; //2^n
        for (int i=0; i<subsets; i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<n; j++) {
                if((i&(1<<j))!=0) {
                    temp.add(nums[j]);
                }
            }
            answer.add(temp);
        }
        return answer;
    }
}
