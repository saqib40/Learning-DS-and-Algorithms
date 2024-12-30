public class S6 {
    public static int firstOccurance(int[] nums, int target) {
        int ans = -1;
        int low = 0; int high = nums.length-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == target) {
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid] < target) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return ans;
    }
    public static int lastOccurance(int[] nums, int target) {
        int ans = -1;
        int low = 0; int high = nums.length-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == target) {
                ans = mid;
                low = mid+1;
            }
            else if(nums[mid] < target) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int [] result = {firstOccurance(nums,target), lastOccurance(nums, target)};
        return result;
    }
}
