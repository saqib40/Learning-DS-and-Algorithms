import java.util.HashMap;

public class S14 {
    public int subarraySum(int[] nums, int k) {
        int N = nums.length;
        int preSum = 0;
        int ans = 0;
        HashMap <Integer,Integer> map = new HashMap<>();
        map.put(0,1); // to handle subarrays starting from index 0
        for(int i=0; i<N; i++) {
            preSum+=nums[i];
            int rem = preSum-k;
            if(map.containsKey(rem)) {
                ans += map.get(rem);
            }
            map.put(preSum, map.getOrDefault(preSum, 0)+1);
        }
        return ans;
    }
}
