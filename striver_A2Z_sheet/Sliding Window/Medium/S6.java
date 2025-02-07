public class S6 {
    class Solution {
        public int lessOrEq(int[] nums, int goal) {
                if(goal < 0) return 0;
                int l = 0;
                int r = 0;
                int sum = 0;
                int count = 0;
                while(r<nums.length) {
                    sum += nums[r]%2;
                    while(sum>goal) {
                        sum = sum-nums[l]%2;
                        l++;
                    }
                    count = count + (r-l+1);
                    r++;
                }
                return count;
            }
        public int numberOfSubarrays(int[] nums, int k) {
            return lessOrEq(nums,k) - lessOrEq(nums,k-1);
        }
    }
}
