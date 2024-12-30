public class recursiveBubbleSort {
    // TC => O(n^2) & SC => O(1)
    public static void sort(int[] arr, int n)
    {
        if(n==1) //base case
        {
            return;
        }
        // pass logic
        int flag = 0;
        for(int j=0; j<n-1; j++)
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
            return;
        }
        sort(arr, n-1);
    }
    // pure recursion; no iterative statements; sadly saw over chatgpt
    public static void bubbleSortSinglePass(int[] arr, int n, int index) {
        if (index == n - 1) {
            return;
        }

        if (arr[index] > arr[index + 1]) {
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }

        // Recursive call for the next pair
        bubbleSortSinglePass(arr, n, index + 1);
    }
    public static void bubbleSort(int[] arr, int n) {
        // Base case: If the size of the array is 1, return
        if (n == 1) {
            return;
        }

        // Perform a single pass of bubble sort
        bubbleSortSinglePass(arr, n, 0);

        // Recursive call for the remaining array
        bubbleSort(arr, n - 1);
    }
}
