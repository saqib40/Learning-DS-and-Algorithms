import java.util.ArrayList;

public class S6GFG {
    // Brute Force
    // Method 1; TC being O(n^3)
    public static int factorial(int n)
    {
        if(n<2)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void factorialNumbers1(int n) {
        for(int i=1; i<=n; i++)
        {
            int k = 1;
            while (k <= i) { 
                int factorial = factorial(k);
                if(factorial == i)
                {
                    System.out.println(i);
                }
                k++;
            }
        }
    }
    // Method 2, TC being O(n^2)
    public static long factorialLoop(int x) {
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
    public static void factorialNumbers2(int n) {
        for (int i = 1; i <= n; i++) {
            long factorial = factorialLoop(i);
            if (factorial <= n) {
                System.out.println(factorial);
            } else {
                break; // Exit the loop if factorial exceeds n
            }
        }
    }
    // Method 3, TC being O(Logn)
    static ArrayList<Long> factorialNumbers3(long n) {
        ArrayList<Long> myArray = new ArrayList<Long>();
        Long fact = 1L;
        Long x = 2L;
        while(fact <= n)
        {
            myArray.add(fact);
            fact *= x;
            x++;
        }
        return myArray;
    }

    public static void main(String[] args) {
        factorialNumbers2(30);
        System.err.println(factorialNumbers3(30));
    }
}
