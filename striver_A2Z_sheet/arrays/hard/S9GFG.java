import java.util.ArrayList;

public class S9GFG {
    // method 1 => brute force => O(n^2)
    // method 2 => Using Hashing
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int[] hashArr = new int[arr.length+1];
        for(int i=0; i<arr.length; i++) {
            hashArr[arr[i]]++;
        }
        int missing = -1;
        int repeating = -1;
        for(int i=1; i<hashArr.length; i++) {
            if(hashArr[i] == 2) {
                repeating = i;
            } else if(hashArr[i] == 0) {
                missing = i;
            }
            if(missing != -1 && repeating != -1) {
                break;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeating);
        ans.add(missing);
        return ans;
    }
    // method 3 => Mathematical Equations
    ArrayList<Integer> findTwoElement2(int arr[]) {
        long n = arr.length;
        long Sn = (n * (n+1))/2;
        long S2n = (n * (n+1) * (2*n+1))/6;
        long S = 0;
        long S2 = 0;
        for(int i=0; i<n; i++) {
            S += arr[i];
            S2 += (long) arr[i] * (long) arr[i];
        }
        long k1 = S-Sn;
        long k2 = S2-S2n;
        k2 = k2/k1;
        long x = (k1+k2)/2;
        long y = x - k1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int) x);
        ans.add((int) y);
        return ans;
    }
    // method 4 => XOR approach
    // while revising bit manipulation
}
