public class iterativeBubbleSort {
    //TC => O(n^2) & SC => O(1) for the worst and average cases and O(N) for the best case.
    public static void sort(int[] arr)
    {
        int n = arr.length;
        for(int i=1; i<n; i++) // running n-1 passes
        {
            int flag = 0;
            for(int j=0; j<=n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //update the flag
                    flag = 1;
                }
            }
            // if flag isn't updated after a pass
            if(flag == 0)
            {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] myArray = {4,7,6,3,2};
        sort(myArray);
        int m = myArray.length;
        for(int l=0; l<m; l++)
        {
            if (l==0)
            {
                System.out.print("[" + myArray[l] + ", ");
            }
            else if (l==m-1)
            {
                System.out.print(myArray[l] + "]");
            }
            else
            {
                System.out.print(myArray[l] + ", ");
            }
        }
    }
}
