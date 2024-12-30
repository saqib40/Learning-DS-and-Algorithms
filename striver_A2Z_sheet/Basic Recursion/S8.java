public class S8 {
    // to reverse an array using recursion
    static void reverse(int[] arr, int low, int high) {
        if(low>=high) {
            return;
        }
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        reverse(arr,low+1,high-1);
    }
    static void reverse(int[] arr) {
        reverse(arr,0,arr.length-1);
    }
}
