public class iterativeInsertionSort {
    //TC => O(n^2), for the worst case (seen in reverse sorted array) & average cases and O(n) in best case (seen in already sorted array)
    public static void insertionSort(int arr[], int n)
    {
      for(int i=1; i<n; i++)
      {
        int value = arr[i];
        int hole = i;
        while(hole>0 && arr[hole-1] > value)
        {
            arr[hole] = arr[hole-1];
            hole -=1;
        }
        arr[hole] = value;
      }
    }
    public static void main(String[] args) {
        int[] myArray = {4,7,6,3,2};
        insertionSort(myArray, 5);
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
