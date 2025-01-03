public class S4 {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(target==nums[mid]) {
                return mid;
            }
            if(target<nums[mid]) {
                ans = mid;
                high = mid-1;
            }
            if(target>nums[mid]) {
                low = mid+1;
            }
        }
        return ans;
    }
}
