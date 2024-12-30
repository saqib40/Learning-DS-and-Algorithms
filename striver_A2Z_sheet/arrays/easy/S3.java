public class S3 {
    public static boolean isSorted(int[] arr, int n)
    {
        if (n==1)
        {
            return true;
        }
        for (int i = 0; i <= n-2; i++)
        {
            // checking if array is sorted in ascending order
            if(arr[i] >= arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4};
        int size = 4;
        System.out.println(isSorted(myArray,size));
    }
}
