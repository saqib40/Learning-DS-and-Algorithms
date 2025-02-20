public class S9LC {
    public int[] findErrorNums(int[] nums) {
        long n = nums.length;
        long Sn = (n * (n+1))/2;
        long S2n = (n * (n+1) * (2*n+1))/6;
        long S = 0;
        long S2 = 0;
        for(int i=0; i<n; i++) {
            S += nums[i];
            S2 += (long) nums[i] * (long) nums[i];
        }
        long k1 = S-Sn;
        long k2 = S2-S2n;
        k2 = k2/k1;
        long x = (k1+k2)/2;
        long y = x - k1;
        int[] ans = {(int)x, (int)y};
        //ArrayList<Integer> ans = new ArrayList<>();
        //ans.add((int) x);
        //ans.add((int) y);
        return ans;
    }
    // XOR approach
    // while revising bit manipulation
}
