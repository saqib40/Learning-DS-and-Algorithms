import java.util.Arrays;

public class S3 {
    // works but TLE error for higher testcases
    // O(n^2) worst TC
    public int maxFrequency1(int[] nums, int k) {
        // sort
        Arrays.sort(nums);
        // nested loop but not fully only till k goes 0
        int n = nums.length;
        int maxF = 0;
        for(int i=n-1; i>=0; i--) {
            int tempF = 0;
            int tempD = k;
            int j = i;
            while(tempD>0 && j>=0) {
                int diff = Math.abs(nums[i] - nums[j]);
                j--;
                if(diff>tempD) {
                    break;
                }
                tempD = tempD-diff;
                tempF++;
                maxF = Math.max(maxF,tempF);
            }
        }
        return maxF;
    }

    // method 2
    // Two pointer problem
    public int maxFrequency2(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int maxF = 0;
        long windowS = 0;
        while(right < nums.length) {
            windowS += nums[right];
            while(((long)nums[right] * (right-left+1) - windowS) > k) {
                windowS -= nums[left];
                left++;
            }
            maxF = Math.max(maxF, right-left+1);
            right++;
        }
        return maxF;
    }
}
