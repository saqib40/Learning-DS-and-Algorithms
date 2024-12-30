public class S1 {
    static boolean isBSTTraversal(int arr[]) {
        // code here
        for(int i=1; i<arr.length; i++) {
            if(arr[i] <= arr[i-1]) return false;
        }
        return true;
    }
}
