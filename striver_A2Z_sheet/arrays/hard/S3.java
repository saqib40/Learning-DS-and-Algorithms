import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S3 {
    // brute force
    // O(n^3)
    public List<List<Integer>> threeSum1(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]); temp.add(nums[j]); temp.add(nums[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }
        //List<List<Integer>> ans = new ArrayList<>();
        //for(List<Integer> x : st) {
        //    ans.add(x);
        //}
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    // using hashing
    // slightly better
    // O(n^2)
    public List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            Set<Integer> haSt = new HashSet<>();
            for(int j=i+1; j<nums.length; j++) {
                int value = -(nums[i] + nums[j]);
                if(haSt.contains(value)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], value);
                    temp.sort(null);
                    st.add(temp);
                }
                haSt.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    // best approach
    public List<List<Integer>> threeSum3(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0) {
                    j++;
                }else if(sum>0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}
