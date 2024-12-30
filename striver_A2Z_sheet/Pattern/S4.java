public class S4 {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
