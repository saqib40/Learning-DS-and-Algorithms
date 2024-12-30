public class S8 {
    // TC => O(n) & SC => O(1)
    public static int search(int arr[], int K)
    {
        // to find if K is in arr or nah
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if (arr[i] == K)
            {
                return i;
            }
        }
        return -1;
    }
}
