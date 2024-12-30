public class S5 {
    // sum of first n natural numbers
    // loop => O(n)
    // formula => O(1)
    // recursive => O(n) and SC also O(n)
    // functional recursion
    public static int sumOfSeries1(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n + sumOfSeries1(n-1);
    }
    //parametrized recursion, adding one parameter, for default value in JAVA we use method overload
    public static int sumOfSeries2(int n)
    {
        return sumOfSeries2(n, 1);
    }
    public static int sumOfSeries2(int n, int sum) {
        if(n==1)
        {
            return sum;
        }
        // sum = sum + n;
        return sumOfSeries2(n-1,sum + n);
    }
}
