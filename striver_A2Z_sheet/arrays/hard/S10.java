public class S10 {
    //static int count = 0; not a good practice though makes it quite easy
    public static int merge(int[] L,int [] R, int[] A)
    {
        int count = 0;
        int nL = L.length;
        int nR = R.length;
        int i=0; //to iterate through L
        int j=0; //to iterate through R
        int k=0; //to iterate through A
        while(i<nL && j<nR)
        {
            // left is smaller
            if(L[i] <= R[j])
            {
                A[k] = L[i];
                i++;
            }
            // right is smaller
            else
            {
                A[k] = R[j];
                count += nL - i; // one line addition
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
        return count;
    }
    // the logic for mergeSort
    public static int mergeSort(int[] A)
    {
        int count = 0;
        int n = A.length;
        if(n<2)
        {
            return count;
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
        count += mergeSort(left);
        count += mergeSort(right);
        count += merge(left,right,A);
        return count;
    }
    static int inversionCount(int arr[]) {
        // Your Code Here
        //count = 0; // since it's static to handle multiple test cases effectively 
        return mergeSort(arr);
        //return count;
    }
}
