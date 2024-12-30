public class S4 {
    // Method 1
    public String longestCommonPrefix1(String[] strs) {
        String smallest = strs[0];
        for(String x : strs) {
            if(x.length() < smallest.length()) {
                smallest = x;
            }
        }
        int n = smallest.length();
        for(int i=0; i<n; i++) {
            for(String x : strs) {
                if(x.charAt(i) != smallest.charAt(i)) {
                    return smallest.substring(0,i); // 0 to i-1
                }
            }
        }
        return smallest;
    }
    // Method 2
    // Binary Search
    // Won't imporve optimization that much
    public boolean commonPrefix(String[] strs, int index) {
        String prefix = strs[0].substring(0,index+1);
        for(String x : strs) {
            for(int i=0; i<=index; i++) {
                if(x.charAt(i) != prefix.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
    public String longestCommonPrefix2(String[] strs) {
        String smallest = strs[0];
        for(String x : strs) {
            if(x.length() < smallest.length()) {
                smallest = x;
            }
        }
        int low = 0;
        int high = smallest.length()-1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            if(commonPrefix(strs,mid)) {
                low = mid + 1;
            }
            else {
                high = mid-1;
            }
        }
        return strs[0].substring(0,low+(high-low)/2);
    }
}
