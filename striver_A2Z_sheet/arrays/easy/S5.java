public class S5 {
    // left rotate by one place
    // TC => O(n) & SC => O(1)
    public static int[] leftRotate1(int[] myArray)
    {
        int n = myArray.length;
        int ref = myArray[0];
        for(int i = 1; i<n; i++)
        {
            myArray[i-1] = myArray[i];
        }
        myArray[n-1] = ref;
        return myArray;
    }
    public static void main(String[] args) {
        int[] ok = {1,2,3,4,5};
        int[] myArray = leftRotate1(ok);
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
