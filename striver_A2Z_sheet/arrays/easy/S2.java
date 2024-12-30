public class S2 {
    // GFG
    int print2largest(int arr[], int n) {
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for(int i: arr)
        {
            if (i > largest)
            {
                secLargest = largest;
                largest = i;
            }
            if (i > secLargest && i != largest)
            {
                secLargest = i;
            }
        }
        if (secLargest == Integer.MIN_VALUE)
        {
            return -1;
        }
        else
        {
            return secLargest;
        }
    }
    // Striver; Given an array, find the second smallest and second largest element in the array.
    // Print ‘-1’ in the event that either of them doesn’t exist.
    // smallest has same logic just "<" instead of ">"
}