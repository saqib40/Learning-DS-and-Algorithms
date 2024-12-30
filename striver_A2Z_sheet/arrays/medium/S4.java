public class S4 {
    // using kadane's algorithm
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int subArrSum = 0;
        for(int i=0; i<n; i++) {
            subArrSum += nums[i];
            maxSum = Math.max(subArrSum,maxSum);
            if(subArrSum < 0) {
                subArrSum = 0;
            }
            //maxSum = Math.max(subArrSum,maxSum);
        }
        return maxSum;
    }
    // print that subarray
    public void maxSubArray2(int[] nums) {
        int startIndex = 0; int endIndex = 0;
        int n = nums.length;
        int maxSum = nums[0];
        int subArrSum = 0;
        for(int i=0; i<n; i++) {
            subArrSum += nums[i];
            if(subArrSum > maxSum) {
                maxSum = subArrSum;
                endIndex = i;
            }
            if(subArrSum < 0) {
                subArrSum = 0;
                startIndex = i+1;
            }
        }
        for(int j=startIndex; j<=endIndex; j++) {
            System.out.print("[ "+nums[j]+", ");
        }
        System.out.print("]");
    }
    // follow up leetcode
    // Follow up: If you have figured out the O(n) solution, 
    // try coding another solution using the divide and conquer approach, 
    // which is more subtle.
}
