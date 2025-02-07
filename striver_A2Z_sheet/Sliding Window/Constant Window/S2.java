public class S2 {
    // Done
    // codechef
    // Min sum of size k subarray
    public class Main {
        public static long findMinSumSubarray(int n, int k, int[] arr) {
            // Write your code here
            long sum = 0;
            for(int i=0; i<k; i++) {
                sum += arr[i];
            }
            long minSum = sum;
            int left = 0;
            int right = k-1;
            while(right<n-1) {
                sum = sum-arr[left];
                left++;
                right++;
                sum = sum+arr[right];
                minSum = Math.min(sum, minSum);
            }
            return minSum;
        }
}
