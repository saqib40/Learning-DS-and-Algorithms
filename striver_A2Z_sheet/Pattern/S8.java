public class S8 {
    public static void nStarTriangle(int n) {
        // Write your code here
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
