public class S3 {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        nTriangle(4);
    }
}
