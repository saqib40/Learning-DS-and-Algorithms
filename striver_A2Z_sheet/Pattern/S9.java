public class S9 {
    public static void nStarDiamond(int n) {
        // Write your code here
        //S7
        for(int i=1; i<=n; i++)
        {
            // initial spaces
            for(int z=n-i; z>=1; z--)
            {
                System.out.print(" ");
            }
            // stars
            for(int z=1; z<=2*i-1; z++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        //S8
        for(int i=1; i<=n; i++)
        {
            //spaces
            for(int m=1; m<=i-1; m++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=2*n-(2*i-1); j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
