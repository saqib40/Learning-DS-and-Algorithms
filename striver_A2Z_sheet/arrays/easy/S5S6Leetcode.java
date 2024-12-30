public class S5S6Leetcode {
    // right rotate by k
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
    public static void rightRotate(int[] nums, int k)
    {
        int n = nums.length;
        //reverse last k elements
        reverseSubArray(nums, n-k, n-1);
        //reverse first n-k elements
        reverseSubArray(nums, 0, n-k-1);
        //reverse all elements
        reverseSubArray(nums, 0, n-1);
        //return nums;
    }
    // let's do it without callback
    public static void rightRotate2(int[] nums, int k)
    {
        int n = nums.length;
        k = k % nums.length; // keeps k within range of array length, cause sometime k > array length
        //reverse last k elements
        int startIndex = n-k;
        int endIndex = n-1;
        int length = (endIndex - startIndex) + 1;
        for(int i = 0; i<length/2; i++)
        {
            int temp = nums[startIndex+i];
            nums[startIndex+i] = nums[endIndex-i];
            nums[endIndex-i] = temp;
        }
        //reverse first n-k elements
        startIndex = 0;
        endIndex = n-k-1;
        length = (endIndex - startIndex) + 1;
        for(int i = 0; i<length/2; i++)
        {
            int temp = nums[startIndex+i];
            nums[startIndex+i] = nums[endIndex-i];
            nums[endIndex-i] = temp;
        }
        //reverse all elements
        startIndex = 0;
        endIndex = n-1;
        length = (endIndex - startIndex) + 1;
        for(int i = 0; i<length/2; i++)
        {
            int temp = nums[startIndex+i];
            nums[startIndex+i] = nums[endIndex-i];
            nums[endIndex-i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] myArray = {-1,-100,3,99};
        rightRotate2(myArray, 2);
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
