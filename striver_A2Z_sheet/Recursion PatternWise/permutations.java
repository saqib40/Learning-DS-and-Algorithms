
import java.util.ArrayList;
import java.util.List;

public class permutations {
    // leetcode
    // method 1
    void permutations1(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0; i<nums.length; i++) {
            if(!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                permutations1(nums, ds, ans, freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
    public List<List<Integer>> permute1(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permutations1(nums, ds, ans, freq);
        return ans;
    }
    // method 2
    void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    void permutations(int[] nums, int index, List<List<Integer>> ans) {
        if(index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for(int x: nums) {
                ds.add(x);
            }
            ans.add(ds);
            return;
        }
        for(int i=index; i<nums.length; i++) {
            swap(i,index,nums);
            permutations(nums, index+1, ans);
            swap(i,index,nums);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations(nums, 0, ans);
        return ans;
    }
    // follow up - write code for permutation of "n" things taken "r" at a time
}
