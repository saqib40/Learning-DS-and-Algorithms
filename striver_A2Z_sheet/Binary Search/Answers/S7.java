public class S7 {
    // Brute Force O(n)
    public int findKthPositive1(int[] arr, int k) {
        int n=arr.length;
        for(int i=0; i<n; i++) {
            if(arr[i]<=k) {
                k++;
            } else {
                break;
            }
        }
        return k; //dummy
    }
    // Binary Search O(Log(n))
    public int findKthPositive2(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            } else {
                high = mid-1;
            }
        }
        return low+k; //or high+1+k
    }
}
