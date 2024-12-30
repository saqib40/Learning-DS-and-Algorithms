public class S2 {
    //TC required is O(n*log(m))
    public int NthRoot(int n, int m)
    {
        // code here
        int low = 0;
        int high = m;
        while(low<=high) {
            int mid = low+(high-low)/2;
            double root = 1; // to handle overflow
            int i=0;
            while(i<n) {
                root *= mid;
                i++;
            }
            if(root == m) {
                return mid;
            }
            if(root<m) {
                low = mid+1;
            }
            else { // root>m
                high = mid-1;
            }
        }
        return -1;
    }
}
