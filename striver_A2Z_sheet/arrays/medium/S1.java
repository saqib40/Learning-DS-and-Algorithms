import java.util.Arrays;
import java.util.HashMap;

public class S1 {
    // method 1; two loops O(n^2)
    // method 2; hashing O(n)
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            int rem = target-nums[i];
            if(map.containsKey(rem)) {
                ans[0] = i;
                ans[1] = map.get(rem);
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
    // method 3; using two pointers O(n), problem here being this doesn't preserve indexes
    public boolean twoSum2(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = n-1;
        while(left<right) {
            if(nums[left]+nums[right] == target) {
                return true;
            }
            else if(nums[left]+nums[right] > target) {
                right--;
            }
            else { // nums[left]+nums[right] < target
                left++;
            }
        }
        return false;
    }
}
