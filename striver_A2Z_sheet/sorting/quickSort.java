import java.util.Random;

public class quickSort {
    public static int partition(int[] A, int start, int end)
    {
        int pivot = A[end]; // not needed just intution
        int pIndex = start;
        for(int i=start; i<=end-1; i++)
        {
            if(A[i] <= pivot)
            {
                //swap
                int temp = A[pIndex];
                A[pIndex] = A[i];
                A[i] = temp;
                //increment pIndex
                pIndex++;
            }
        }
        //swap
        int temp = A[pIndex];
        A[pIndex] = A[end];
        A[end] = temp;
        return pIndex;
    }
    //randomized partition
    public static int randomizedPartition(int[] arr, int start, int end)
    {
        //random picking of element
        Random myRandom = new Random();
        int pIndex = myRandom.nextInt((end-start)+1)+start;
        // swap last element with it
        int temp = arr[pIndex];
        arr[pIndex] = arr[end];
        arr[end] = temp;
        // now do the partition
        return partition(arr, start, end);
    }
    public static void quickSortt(int[] A, int start, int end)
    {
        if(start < end)
        {
            int pIndex = randomizedPartition(A, start, end);
            quickSortt(A, start, pIndex-1);
            quickSortt(A, pIndex+1, end);
        }
    }
    public static void main(String[] args) {
        int[] myArray = {4,7,6,3,2};
        quickSortt(myArray,0,4);
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
