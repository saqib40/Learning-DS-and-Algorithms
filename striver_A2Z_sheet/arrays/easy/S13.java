import java.util.HashMap;

public class S13 {
    // method 1; O(n^3)
    // method 2; O(n^2)
    // method 3; O(n) using hashmap
    public static int lenOfLongSubarr(int A[], int N, int K) {
        int preSum = 0;
        int ans = 0;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0; i<N; i++) {
            preSum+=A[i];
            if(preSum == K) {
                ans = Math.max(ans, i+1);
            }
            int rem = preSum-K;
            if(map.containsKey(rem)) {
                int len = i-map.get(rem);
                ans = Math.max(ans,len);
            }
            // finally update the map, below condition handles
            // non positive integers
            if (!map.containsKey(preSum)) {
                map.put(preSum, i);
            }
        }
        return ans;
    }
    // method 4; O(n) using two pointers, only if elements are non-ve
    public static int lenOfLongSubarr2(int A[], int N, int K) {
        int left = 0; int right = 0;
        int ans=0; int sum=A[0];
        while(right<N) {
            while (left <= right && sum > K) {
                sum -= A[left];
                left++;
            }
            if(sum == K) {
                ans = Math.max(ans,right-left+1);
            }
            right++;
            if(right<N) {
                sum += A[right];
            }
        }
        return ans;
    }
}
