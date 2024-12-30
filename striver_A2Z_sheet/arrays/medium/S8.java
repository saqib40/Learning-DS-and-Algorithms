public class S8 {
    // solution 1 => Brute Force
    // find all permutations in sorted order, using backtracking
    // and then do linear search
    // factorial time complexity
    // important but will study when we reach backtracking
    // solution 2 => Optimal
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i=n-2; i>=0; i--) {
            if(nums[i]<nums[i+1]) {
                index = i;
                break;
            }
        }
        if(index != -1) {
            for(int i=n-1; i>=index; i--) {
                if(nums[i]>nums[index]) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
        }
        // now reverse the required part of array
        int i = index+1;
        int j = n-1;
        while(i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
