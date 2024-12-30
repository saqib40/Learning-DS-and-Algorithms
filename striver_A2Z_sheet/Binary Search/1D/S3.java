
import java.util.Arrays;

public class S3 {
    public int findFloor(int[] arr, int k) {
        // write code here
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(k==arr[mid]) {
                return arr[mid];
            }
            if(k<arr[mid]) {
                high = mid-1;
            }
            if(k>arr[mid]) {
                ans = arr[mid];
                low = mid+1;
            }
        }
        return ans;
    }
    public int findCeil(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(k==arr[mid]) {
                return arr[mid];
            }
            if(k<arr[mid]) {
                ans = arr[mid];
                high = mid-1;
            }
            if(k>arr[mid]) {
                low = mid+1;
            }
        }
        return ans;
    }
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int[] ans = {findFloor(arr, x), findCeil(arr, x)};
        return ans;
    }
    // solution 2 using basic iteration
    // without sorting
}
