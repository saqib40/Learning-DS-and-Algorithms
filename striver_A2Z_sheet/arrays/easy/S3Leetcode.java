public class S3Leetcode {
    public boolean check(int[] nums) {
        int n = nums.length;
        int dips = 0;
        for(int i=1; i<n; i++)
        {
            if(nums[i] < nums[i-1])
            {
                dips++;
            }
        }
        if (dips == 1 && nums[n-1] <= nums[0])
        {
            return true;
        }
        if (dips == 0)
        {
            return true;
        }
        return false;
    }
}
