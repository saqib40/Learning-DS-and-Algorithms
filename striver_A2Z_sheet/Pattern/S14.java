public class S14 {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                int b=64+j;
                char a = (char)b;
                System.out.print(a + " ");
            }
            System.out.println("");
        }
    }
}
