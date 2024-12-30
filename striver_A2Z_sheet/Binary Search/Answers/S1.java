public class S1 {
    // Method 1; Iterative with O(n) TC
    // Method 2; Netwon Raphson method, to find the decimal places as well
    // Method 3; For this question we will use Binary Search as we are returning floor if 'n' isn't perfect square
    int floorSqrt(int n) {
        // Your code here
        int low = 0;
        int high = n/2;
        int ans = 1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            if(mid*mid == n) {
                return mid;
            }
            if(mid*mid < n) {
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
