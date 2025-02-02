public class S3 {
    // sieve of erathosthenes
    // Why iterate only up to sqrt(n)?
    // Any non-prime number x has a factor a such that a ≤ sqrt(x).
    // If x has a factor greater than sqrt(x), then its other factor must be smaller than sqrt(x).
    // By marking multiples of numbers only up to sqrt(n), we ensure that all non-prime numbers are eliminated.
    public int countPrimes(int n) {
        if(n<=2) {
            return 0;
        }
        int[] arr = new int[n]; // initialise with 0
        //arr[0] = 1;
        //arr[1] = 1;
        int sqrt = (int)Math.sqrt(n);
        for(int i=2; i<=sqrt; i++) {
            if(arr[i] == 0) {
                /*
                int j = 2;
                while(i*j<n) {
                    arr[i*j] = 1;
                    j++;
                }
                */
                for (int j = i * i; j < n; j += i) {
                    arr[j] = 1;
                }
            }
        }
        int ans = 0;
        for(int i=2; i<n; i++) {
            if(arr[i]==0) {
                //System.out.print(i + " ");
                ans++;
            }
        }
        return ans;
    }
}
