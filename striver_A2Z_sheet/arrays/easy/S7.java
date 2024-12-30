public class S7 {
    // method 1; TC => O(n) & SC => O(n), by using another array
    // method 2; TC => O(n) & SC => O(1), by using two pointers
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        // place j
        int j;
        for(j=0; j<n; j++)
        {
            if(nums[j] == 0)
            {
                break;
            }
        }
        // if we didn't find any zero in array
        if(j>=n) 
        {
            return;
        }
        // now with i
        for(int i=j+1; i<n; i++)
        {
            if(nums[i] != 0)
            {
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
        }
    }
}
