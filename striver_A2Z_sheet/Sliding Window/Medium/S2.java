public class S2 {
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int l = 0;
            int r = 0;
            int maxLen = 0;
            int consecZer = 0;
            while(r<nums.length) {
                if(nums[r] == 0) {
                    consecZer++;
                }
                // in essence we have to take out zeros out of window while shrinking the window
                // but zeros can be anywhere not necessarily at the left
                while(consecZer > k) {
                    if(nums[l] == 0) consecZer--;
                    l++;
                }
                maxLen = Math.max(maxLen, r-l+1);
                r++;
            }
            return maxLen;
        }
    }
}
