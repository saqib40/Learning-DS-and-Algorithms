public class S9 {
    // Given an integer N, Print the Fibonacci sequence up to the Nth term, consider 0 based indexing
    // method 1; using loop
    // TC => O(n)
    public static void fibSequence1(int n)
    {
        // not handling cases like n = 0 or negative ....
        int f0 = 0;
        System.out.println(f0);
        int f1 = 1;
        System.out.println(f1);
        int f;
        int i = 0;
        while(i<=n-2)
        {
            f = f0 + f1;
            System.out.println(f);
            f0 = f1;
            f1 = f;
            i++;
        }
    }
    // method 2; using recursion to find nth term of fib sequence
    // TC => O(2^n)
    // SC => O(n)
    public static int fibSequence2(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibSequence2(n-1) + fibSequence2(n-2);
    }
    // print fib sequence using recursion
    public static void fibSequence3(int n, int f0, int f1)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(f0);
        fibSequence3(n-1, f1, f0+f1);
    }
    public static void main(String[] args) {
        fibSequence3(5, 0, 1);
    }
}
