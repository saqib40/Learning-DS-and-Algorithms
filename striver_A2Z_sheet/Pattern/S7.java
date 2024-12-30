public class S7 {
    public static void nStarTriangle(int n) {
        // Write your code here
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
    }
}
