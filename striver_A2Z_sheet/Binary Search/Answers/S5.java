public class S5 {
    public int maxElement(int[] arr) {
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            max=arr[i]>max?arr[i]:max;
        }
        return max;
    }
    public int sum(int[] arr, int k) {
        int ans = 0;
        for(int x : arr) {
            ans += Math.ceil((double)x/(double)k);
        }
        return ans;
    }
    // Brute Force => O(n^2)
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<maxElement(nums); i++) {
            int sum = sum(nums,nums[i]);
            if(sum<=threshold) {
                ans = Math.min(ans,nums[i]);
            }
        }
        return ans;
    }
    // Method 2
    public int smallestDivisor2(int[] nums, int threshold) {
        int ans = 0;
        int low = 1;
        int high = maxElement(nums);
        while(low<=high) {
            int mid = low+(high-low)/2;
            int sum = sum(nums,mid);
            if(sum>=threshold) {
                ans = mid;
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return ans;
    }
}
