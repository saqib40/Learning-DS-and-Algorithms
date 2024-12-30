public class S1 {
    // iterative implementation
    public int search1(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(nums[mid]==target) {
                return mid;
            }
            else if (nums[mid]<target) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }
    // recursive implementation
    public int search2(int[] nums, int low, int high, int target) {
        if(low>high) {
            return -1;
        }
        int mid = low + (high-low)/2;
        if(nums[mid] == target) {
            return mid;
        }
        else if(nums[mid]<target) {
            return search2(nums,mid+1,high,target);
        }
        else {
            return search2(nums,low,mid-1,target);
        }
    }
    public int search2(int[] nums, int target) {
        return search2(nums,0,nums.length-1,target);
    }
}
