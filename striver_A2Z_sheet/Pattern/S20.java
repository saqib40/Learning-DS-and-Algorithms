public class S20 {
    public static void symmetry(int n) {
        // Write your code here
        //first part
        for(int i=1; i<n; i++)
        {
            //initial stars
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            //spaces
            for(int j=1; j<=2*n-2*i; j++)
            {
                System.out.print(" ");
            }
            //final stars
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        //second part
        for(int i=1; i<=n; i++)
        {
            //initial stars
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print("* ");
            }
            //spaces
            for(int j=1; j<=2*(i-1); j++)
            {
                System.out.print(" ");
            }
            //final stars
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
