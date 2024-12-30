public class S17 {
    public static void alphaHill(int n) {
        // Write your code here
        for(int i=1; i<=n; i++)
        {
            //spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            //pattern1
            for(int j=1; j<=i; j++)
            {
                char a = (char) (64+j);
                System.out.print(a + " ");
            }
            //pattern2
            for(int j=0; j<i-1; j++)
            {
                char a = (char) (63+i-j);
                System.out.print(a + " ");
            }
            System.out.println("");
        }
    }
}
