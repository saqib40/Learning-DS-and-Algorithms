public class S12 {
    public static void numberCrown(int n) {
        // Write your code here.
        for(int i=1; i<=n; i++)
        {
            // initial numbers
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            // spaces
            for(int j=1; j<=2*n-2*i; j++)
            {
                System.out.print(" ");
            }
            // final numbers
            for(int j=i; j>=1; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
