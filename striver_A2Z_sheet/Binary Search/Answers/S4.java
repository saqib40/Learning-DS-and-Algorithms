public class S4 {
    public int countConsecutiveFreq(int[] arr, int x, int k) {
        int n = arr.length;
        int count = 0;
        int countConsFreq = 0;
        for(int i=0; i<n; i++) {
            if(arr[i]<=x) {
                countConsFreq++;
                if(countConsFreq == k) {
                    count++;
                    countConsFreq = 0;
                }
            }
            else {
                countConsFreq = 0;
            }
        }
        if(countConsFreq == k) {
            count++;
        }
        return count;
    }
    public int maxElement(int[] arr) {
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            max=arr[i]>max?arr[i]:max;
        }
        return max;
    }
    public int minElement(int[] arr) {
        int n = arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            min=arr[i]<min?arr[i]:min;
        }
        return min;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int ans = -1;
        if(m*k>bloomDay.length) {
            return -1;
        }
        int low = minElement(bloomDay);
        int high = maxElement(bloomDay);
        while(low<=high) {
            int mid = low+(high-low)/2;
            int count = countConsecutiveFreq(bloomDay, mid, k);
            if(count>=m) {
                ans = mid;
                high = mid-1;
            }
            else //(count<m)
            {
                low = mid+1;
            }
        }
        return ans;
    }
}
