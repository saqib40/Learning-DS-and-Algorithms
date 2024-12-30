public class S9GFG {
    public int fib(int n) {
        if (n<=1)
        {
            return n;
        }
        int f0 = 0;
        int f1 = 1;
        int f = 0;
        int i = 0;
        while(i<=n-2)
        {
            f = f0 + f1;
            f0 = f1;
            f1 = f;
            i++;
        }
        return f;
    }
}
