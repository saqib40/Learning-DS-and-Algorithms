public class S21 {
    public static void getStarPattern(int n) {
        // Write your code here
        for(int i=1; i<=n; i++)
        {
            if(i==1||i==n) // first and last row
            {
                for(int j=1; j<=n; j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for(int j=1; j<=n-2; j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
