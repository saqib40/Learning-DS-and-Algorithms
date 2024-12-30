public class S18 {
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                char a = (char) (65+n-j);
                System.out.print(a + " ");
            }
            System.out.println(" ");
        }
    }
}
