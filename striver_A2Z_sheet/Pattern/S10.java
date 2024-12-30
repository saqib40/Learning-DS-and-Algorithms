public class S10 {
    public static void nStarTriangle(int n) {
        // Write your code here
        //S2
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        //Modified S5
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
