public class S6 {
    public static boolean isSubsetPresent(int n, int k, int []a, int index, int tempSum) {
        // Write your code here
        if(index == n) {
            if(tempSum == k) {
                return true;
            }
            return false;
        }
        if(isSubsetPresent(n, k, a, index+1, tempSum+a[index]) == true) {
            return true;
        }
        if(isSubsetPresent(n, k, a, index+1, tempSum) == true) {
            return true;
        }
        return false;
    }
    public static boolean isSubsetPresent(int n, int k,int []a) {
        // Write your code here
        return isSubsetPresent(n, k, a, 0, 0);
    }
}
