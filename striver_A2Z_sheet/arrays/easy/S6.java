public class S6 {
    // rotate the given array by 1 place to left
    public static void leftRotate1(int[] myArray)
    {
        int n = myArray.length;
        int ref = myArray[0];
        for(int i = 1; i<n; i++)
        {
            myArray[i-1] = myArray[i];
        }
        myArray[n-1] = ref;
        //return myArray;
    }
    //Brute Force; TC => O(k.n) in worst case O(n^2) & SC => O(1)
    public static int[] leftRotate(int[] nums, int k)
    {
        for(int i=0; i<k; i++)
        {
            leftRotate1(nums);
        }
        return nums;
    }
    // Method 2; TC => O(n) & SC => O(n)
    // Method 3; TC => O(n) & SC => O(1) we using here Reversal Algorithm
    public static void reverseSubArray(int[] myArray, int startIndex, int endIndex)
    {
        int length = (endIndex - startIndex) + 1;
        for(int i = 0; i<length/2; i++)
        {
            int temp = myArray[startIndex+i];
            myArray[startIndex+i] = myArray[endIndex-i];
            myArray[endIndex-i] = temp;
        }
    }
    public static int[] leftRotateOptimized(int[] nums, int k)
    {
        int n = nums.length;
        //reverse first k elements
        reverseSubArray(nums,0,k-1);
        //reverse last n-k elements
        reverseSubArray(nums,k,n-1);
        //reverse all elements
        reverseSubArray(nums, 0, n-1);
        return nums;
    }
    //testing
    public static void main(String[] args) {
        int[] ok = {1,2,3,4,5};
        int[] myArray = leftRotate(ok, 3);
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
