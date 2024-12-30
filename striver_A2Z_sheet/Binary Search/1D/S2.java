public class S2 {
    static int findFloor(int[] arr, int k) {
        // write code here
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(k==arr[mid]) {
                return mid;
            }
            if(k<arr[mid]) {
                high = mid-1;
            }
            if(k>arr[mid]) {
                ans = mid;
                low = mid+1;
            }
        }
        return ans;
    }
}
