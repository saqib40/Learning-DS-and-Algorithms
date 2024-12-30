public class selectionSort {
    //TC => O(n^2) & SC => O(1) for all best, average and worst cases
    public static void sort(int[] nums)
    {
        int n = nums.length;
        for(int i=0; i<n-1; i++)
        {
            int minI = i;
            int j;
            for(j=i+1; j<n; j++)
            {
                if(nums[j] < nums[minI])
                {
                    minI = j;
                }
            }
            // here we swapping
            int temp = nums[i];
            nums[i] = nums[minI];
            nums[minI] = temp;
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
