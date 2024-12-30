public class S10 {
    public int findMin(int[] nums) {
        int minimum=Integer.MAX_VALUE;
        int low = 0; int high = nums.length-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(nums[low]<=nums[high]) { // search space is already sorted; optimisation
                minimum = Math.min(nums[low], minimum);
                break;
            }
            if(nums[mid]<=nums[high]) { // right half is sorted
                minimum = Math.min(nums[mid], minimum);
                high = mid-1;
            }
            if (nums[mid]>=nums[low]) { // left half is sorted
                minimum = Math.min(nums[low], minimum);
                low = mid+1;
            }
        }
        return minimum;
    }
}
