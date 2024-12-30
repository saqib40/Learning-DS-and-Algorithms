public class S3 {
    public int hours(int[] arr, int speed) {
        int totalTime = 0;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            totalTime += Math.ceil((double)arr[i]/(double)speed);
        }
        return totalTime;
    }
    public int maxElement(int[] arr) {
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            max=arr[i]>max?arr[i]:max;
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 0;
        int high = maxElement(piles);
        int ans=Integer.MAX_VALUE;
        while(low<=high) {
            int mid = low+(high-low)/2;
            int timeTaken = hours(piles,mid);
            if(timeTaken<=h) {
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
