public class S9 {
    public boolean search(int[] nums, int target) {
        int low = 0; int high = nums.length-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(nums[mid]==target) {
                return true;
            }
            if(nums[low]==nums[mid]&&nums[mid]==nums[high]) {
                low++;
                high--;
                continue;
            }
            if(nums[mid]<=nums[high]) { // implies our right half is sorted
                // now check if element does exist in this half
                if(target>nums[mid] && target<=nums[high]) {
                    low = mid+1;
                }
                else {
                    // if not move to other half
                    high = mid-1;
                }
            }
            if(nums[low]<=nums[mid]) { // implies our left half is sorted
                // now check if element does exist in this half
                if(target<nums[mid] && target>=nums[low]) {
                    high = mid-1;
                }
                else {
                    // if not move to other half
                    low = mid+1;
                }
            }
        }
        return false;
    }
}
