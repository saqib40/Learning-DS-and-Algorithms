import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S4 {
    // brute force
    // O(n^4)
    public List<List<Integer>> fourSum1(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; j<n; j++) {
                    for(int l=k+1; l<n; l++) {
                        if(nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            temp.sort(null);
                            st.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    // optimising it
    // O(n^3)
    public List<List<Integer>> fourSum2(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                Set<Integer> haSt = new HashSet<>();
                for(int k=j+1; k<n; k++) {
                    int value = target - (nums[i] + nums[j] + nums[k]);
                    if(haSt.contains(value)) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], value);
                        temp.sort(null);
                        st.add(temp);
                    }
                    haSt.add(nums[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    // optimised interms of space
    public List<List<Integer>> fourSum3(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1, l = n - 1;
                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}
