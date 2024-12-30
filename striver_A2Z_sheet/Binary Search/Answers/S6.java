public class S6 {
    public int maxElement(int[] arr) {
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            max=arr[i]>max?arr[i]:max;
        }
        return max;
    }
    public int days(int[] arr, int w) {
        int n = arr.length;
        int count = 0;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
            if(sum>w) {
                count++;
                sum = arr[i];
            }
        }
        return count+1;
    }
    public int sum(int[] arr) {
        int ans = 0;
        for(int x: arr) {
            ans += x;
        }
        return ans;
    }
    public int shipWithinDays1(int[] weights, int days) {
        int max = maxElement(weights);
        int sum = sum(weights);
        for(int i=max; i<=sum; i++) {
            int computedDays = days(weights,i);
            if(computedDays<=days) {
                return i;
            }
        }
        return -1; // dummy statement
    }
    // binary search
    public int shipWithinDays2(int[] weights, int days) {
        int ans = 0;
        int low = maxElement(weights);
        int high = sum(weights);
        while(low<=high) {
            int mid = low+(high-low)/2;
            int computedDays = days(weights,mid);
            if(computedDays<=days) {
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
}
