public class S1 {
    //Given an integer N, return the number of digits in N.
    public static int countDigits(int N)
    {
        int dividend=N;
        int count=0;
        while(dividend>0)
        {
            dividend /= 10;
            count++;
        }
        return count;
    }
}
