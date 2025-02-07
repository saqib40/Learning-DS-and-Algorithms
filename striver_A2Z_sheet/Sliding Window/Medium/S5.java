public class S5 {
    class Solution {
        public int lessOrEq(int[] nums, int goal) {
            if(goal < 0) return 0;
            int l = 0;
            int r = 0;
            int sum = 0;
            int count = 0;
            while(r<nums.length) {
                sum += nums[r];
                while(sum>goal) {
                    sum = sum-nums[l];
                    l++;
                }
                count = count + (r-l+1);
                r++;
            }
            return count;
        }
        public int numSubarraysWithSum(int[] nums, int goal) {
            return lessOrEq(nums,goal) - lessOrEq(nums,goal-1);
        }
    }
}
