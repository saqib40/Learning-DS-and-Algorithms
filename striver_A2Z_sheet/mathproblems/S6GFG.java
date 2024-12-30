public class S6GFG {
    // the most optimised method to find all factors of a number is cofactor method
    // with TC as O(sqrt(n))
    // summation of divisors of a particular number
    public static int divisors(int n)
    {
        int answer = 0;
        int a = (int) Math.sqrt(n); //assuming it takes constant time
        int i = 1;
        while(i<=a)
        {
            if (n%i == 0)
            {
                if (n/i == i)
                {
                    answer += i;
                }
                else
                {
                    answer += i;
                    answer += n/i;
                }
            }
            i++;
        }
        return answer;
    }
    // sum of the divisors of all numbers upto n, TC being O(nroot(n))
    static long sumOfDivisors1(int N){
        int answer = 0;
        for(int i=1; i<=N; i++)
        {
            answer += divisors(i);
        }
        return answer;
    }
    // optimised; TC being O(n)
    static long sumOfDivisors2(int N)
    {
        long answer = 0;
        for (int i = 1; i <= N; i++) {
            answer += i * (N / i);
        }
        return answer;
    }
}
