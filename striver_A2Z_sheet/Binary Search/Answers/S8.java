
import java.util.Arrays;

public class S8 {
    public static boolean canWePlace(int[] stalls, int d, int c) {
        int n = stalls.length;
        int countCows = 1;
        int last = stalls[0];
        for(int i=1; i<n; i++) {
            if(stalls[i]-last >= d) {
                countCows++;
                last=stalls[i];
            }
            if(countCows>=c) {
                return true;
            }
        }
        return false;
    }
    // brute force
    public static int aggressiveCows1(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        for(int i=1; i<=stalls[n-1]-stalls[0]; i++) {
            if(canWePlace(stalls, i, k)==false) {
                return i-1;
            }
        }
        return -1; // dummy satement

    }
    // optimised using binary search
    public static int aggressiveCows2(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 0;
        int high = stalls[n-1]-stalls[0];
        int ans = -1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            if(canWePlace(stalls, mid, k) == true) {
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
