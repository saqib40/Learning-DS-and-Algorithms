public class Primes {
    // to check if a given integer is prime or nah, best TC being O(sqrt(n))
    public static boolean isPrime(int n)
    {
        int i = (int) Math.sqrt(n);
        while(i>1)
        {
            if(n%i == 0)
            {
                return false;
            }
            i--;
        }
        return true;
    }
    // to get all prime numbers upto n
    // Method 1;
    // iterate from 1 to n, and check each if it's prime or nah
    // TC will be O(nroot(n))
    // Method 2;
    // Sieve Of Erathosthenes
    // TC being O(nLog(Log(n)))
    public static void sieveOfErathosthenes(int n)
    {
        //initialise
        int primes[] = new int[n+1];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = 1;
        }
        //core logic of algorithm
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if(primes[i] == 1)
            {
                int j = 2;
                while(i*j <= n)
                {
                    primes[i*j] = 0;
                    j++;
                }
            }
        }
        //printing
        for(int i = 2; i <= n; i++)
        {
            if(primes[i] == 1)
            {
                System.out.println(i);
            }
        }
    }
    //prime factorization, TC being O(n)
    public static void primeFactorization1(int n)
    {
        int myNum = n;
        for(int i=2; i<=n; i++)
        {
            if (myNum%i == 0)
            {
                int count = 0;
                while(myNum%i == 0)
                {
                    count++;
                    myNum /= i;
                }
                System.out.println(myNum + "^" + count);
            }
        }
    }
    // prime factorization, TC being O(sqrtn)
    // logic is that once n is reduced to prime we exit the loop
    public static void primeFactorization2(int n)
    {
        int myNum = n;
        for(int i = 2; i<= Math.sqrt(n); i++)
        {
            if (myNum%i == 0)
            {
                int count = 0;
                while(myNum%i == 0)
                {
                    count++;
                    myNum /= i;
                }
                System.out.println(myNum + "^" + count);
            }
        }
        //By the time we get out of above loop we will end up with either 1 or a prime number
        if(myNum != 1)
        {
            System.out.println(myNum + "^" + 1);
        }
    }
}
