public class S6 {
    public static int factorial(int n)
    {
        if(n<2)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}
