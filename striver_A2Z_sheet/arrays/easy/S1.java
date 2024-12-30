public class S1 {
    // using for loop, TC O(n) and SC O(1)
    public static int largest(int arr[], int n)
    {
        int largestElement = arr[0];
        for(int i : arr)
        {
            if(i>largestElement)
            {
                largestElement = i;
            }
        }
        return largestElement;
    }
    // using recursion, TC O(n) and SC O(n)
    public static int largestR(int arr[], int n, int ans) {
        // write logic here
        if(n<2) {
            return ans;
        }
        if(arr[n-2] > ans) {
            return largestR(arr,n-1,arr[n-2]);
        }
        return largestR(arr,n-1,ans); //arr[n-2] <= ans
    }
    public static int largestR(int arr[], int n) {
        return largestR(arr,n,arr[n-1]);
    }
}
