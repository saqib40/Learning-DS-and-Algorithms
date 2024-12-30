public class S16 {
    public static void alphaRamp(int n) {
        // Write your code here
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                char a = (char) (64+i);
                System.out.print(a + " ");
            }
            System.out.println("");
        }
    }
}
