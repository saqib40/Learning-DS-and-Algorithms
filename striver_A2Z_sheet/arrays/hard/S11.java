public class S11 {
    public static int merge(int[] L,int [] R, int[] A)
    {
        int count = 0;
        int nL = L.length;
        int nR = R.length;
        int i=0; //to iterate through L
        int j=0; //to iterate through R
        int k=0; //to iterate through A
        int rightPointer = 0;
        for (i = 0; i < nL; i++) {
            while (rightPointer < nR && L[i] > 2L * R[rightPointer]) {
                rightPointer++;
            }
            count += rightPointer;
        }
        i = 0; j = 0; k = 0;
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
    public int reversePairs(int[] nums) {
        return mergeSort(nums);
    }
}
