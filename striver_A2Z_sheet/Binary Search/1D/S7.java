public class S7 {
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
    int countFreq(int[] arr, int target) {
        // code here
        if(firstOccurance(arr,target) == -1) {
            return 0;
        }
        int ans = (lastOccurance(arr, target) - firstOccurance(arr, target)) + 1;
        return ans;
    }
}
