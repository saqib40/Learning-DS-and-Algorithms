public class mergeSort {
    // to merge two sorted arrays (L&R) into one (A)
    public static void merge(int[] L,int [] R, int[] A)
    {
        int nL = L.length;
        int nR = R.length;
        int i=0; //to iterate through L
        int j=0; //to iterate through R
        int k=0; //to iterate through A
        while(i<nL && j<nR)
        {
            if(L[i] <= R[j])
            {
                A[k] = L[i];
                i++;
            }
            else
            {
                A[k] = R[j];
                j++;
            }
            k++;
        }
        // if elements in L are left
        while(i<nL)
        {
            A[k] = L[i];
            k++;
            i++;
        }
        // if elements in R are left
        while(j<nR)
        {
            A[k] = R[j];
            k++;
            j++;
        }
    }
    // the logic for mergeSort
    public static void mergeSort(int[] A)
    {
        int n = A.length;
        if(n<2)
        {
            return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for(int i=0; i<mid; i++)
        {
            left[i] = A[i];
        }
        for(int i=mid; i<n; i++)
        {
            right[i-mid] = A[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,A);
    }
    // driver code
    public static void main(String[] args) {
        int[] myArray = {4,7,6,3,2};
        mergeSort(myArray);
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
