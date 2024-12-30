public class S13 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i=1; i<=n; i++)
        {
            for(int j=0; j<i; j++)
            {
                int ai = (i*i-i+2)/2;
                System.out.print(ai+j + " ");
            }
            System.out.println("");
        }
    }
}
