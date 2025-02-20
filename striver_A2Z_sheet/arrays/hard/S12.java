public class S12 {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int pre = 1;
        int suff = 1;
        for(int i=0; i<n; i++) {
            if(pre == 0) pre =1;
            if(suff == 0) suff = 1;
            pre = pre * nums[i];
            suff = suff * nums[n-i-1];
            ans = Math.max(ans, Math.max(pre,suff));
        }
        return ans;
    }
}
