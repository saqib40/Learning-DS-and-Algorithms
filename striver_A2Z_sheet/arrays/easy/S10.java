public class S10 {
    // method 1; nested loop with TC of O(n^2)
    // method 2; summation; overflow problem
    public int missingNumber1(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int x: nums) {
            sum += x;
        }
        // using sum of first n integers formula
        return ((n*(n+1))/2) - sum;
    }
    // method 3; bit manipulation
    public int missingNumber2(int[] nums) {
        int n = nums.length;
        // xor all nos till n
        int xor1 = 0;
        for(int i=0; i<=n; i++) {
            xor1 = (xor1^i);
        }
        // xor all nos of nums
        int xor2 = 0;
        for(int x : nums) {
            xor2 = (xor2^x);
        }
        return xor1^xor2;
    }
}
