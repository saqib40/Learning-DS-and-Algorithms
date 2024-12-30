public class S12 {
    // already done in bit manipulation
    // Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
    // a simple xor operation of elements of array
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for(int i=0; i<n; i++) {
            xor ^= nums[i];
        }
        return xor;
    }
}
