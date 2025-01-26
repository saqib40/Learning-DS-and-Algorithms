public class S4 {
    // Brute force; TC=>O(n) & SC being O(n)
    // such a shitty solution idk mainey kya phooka thaa uss din jis din mainey yeh code likha
    public static int[] removeDuplicates(int[] nums) {
        int n = nums.length;
        int unique = 0;
        int i = 1;
        while(i<n) // replacing duplicates with -200
        {
            if(nums[i-1] == nums[i])
            {
                nums[i-1] = -200; // because -100 <= nums[i] <= 100
            }
            i++;
        }
        for(int j=0; j<n; j++)
        {
            if(nums[j] != -200)
            {
                unique++;
            }
        }
        int myArray[] = new int[unique];
        int k = 0;
        for(int j=0; j<n; j++)
        {
            if(nums[j] != -200)
            {
                myArray[k] = nums[j];
                k++;
            }
        }
        //printing the array
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
        return myArray;
    }
    // Optimal Way => TC O(n) & SC O(1)
    public static int removeDuplicates2(int[] nums) {
        int n = nums.length;
        int i = 0; // i represents unique
        for (int j = 1; j<=n-1; j++) // j to iterate through array
        {
            if(nums[i] != nums[j]) // true when new element is found
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1; // + 1 cause even though we have assumed one unique value initially we initialised i with 0 for index reasons 
    }
    // won't modify the array inplace so won't work
    public static int removeDuplicates3(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n-1; i++) {
            if(nums[i]!=nums[i+1]) {
                count++;
            }
        }
        return count+1;
    }
}
