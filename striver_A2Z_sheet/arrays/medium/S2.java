public class S2 {
    // method 1; Two traversals
    // method 2; single traversal using DNF (Dutch National Flag) Algorithm
    public void swap(int A, int B) {
        int temp = A;
        A = B;
        B = temp;
    }
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length;
        while(mid<=high) {
            if(nums[mid]==0) {
                swap(nums[low],nums[mid]);
                low++;
                mid++;
            }
            else if(nums[mid]==1) {
                mid++;
            }
            else {
                swap(nums[mid],nums[high]);
                high--;
            }
        }
    }
}
