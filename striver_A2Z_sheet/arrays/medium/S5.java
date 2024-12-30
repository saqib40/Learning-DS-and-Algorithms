import java.util.List;

public class S5 {
    // striver
    // printing using kaden's algorithm
    public int maxSubArray2(int[] nums) {
        int startIndex = -1;
        int endIndex = -1;
        int n = nums.length;
        int maxSum = nums[0];
        int subArrSum = 0;
        for(int i=0; i<n; i++) {
            subArrSum += nums[i];
            //maxSum = Math.max(subArrSum,maxSum);
            if(subArrSum > maxSum) {
                maxSum = subArrSum;
                endIndex=i;
            }
            if(subArrSum < 0) {
                subArrSum = 0;
                startIndex = i;
            }
            //maxSum = Math.max(subArrSum,maxSum);
        }
        // print the subArray
        for(int j=startIndex; j<=endIndex; j++) {
            System.out.print(nums[j] + ", ");
        }
        return maxSum;
    }
    // GFG
    public int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int n = arr.size();
        int maxSum = 0;
        for(int i=0; i<n-1; i++) {
            maxSum = Math.max(arr.get(i)+arr.get(i+1), maxSum);
        }
        return maxSum;
    }
}
