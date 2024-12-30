public class S4 {
    // using brute force; TC in worst case which being (n,n-1), O(n)
    public static int lcm(int a, int b)
    {
        int greater,smaller;
        if(a>b)
        {
            greater = a;
            smaller = b;
        }
        else
        {
            greater = b;
            smaller = a;
        }
        int i = 1;
        while (true) {
            if((greater*i)%smaller == 0)
            {
                return greater*i;
            }
            i++;
        }
    }

    //Now GCD, brute force, TC being O(n/2)
    public static int gcd1(int a, int b)
    {
        int greater,smaller;
        if(a>b)
        {
            greater = a;
            smaller = b;
        }
        else
        {
            greater = b;
            smaller = a;
        }
        if(greater%smaller == 0)
        {
            return smaller;
        }
        int i = smaller/2;
        while (i>0) { 
            if((smaller%i == 0) && (greater%i == 0))
            {
                return i;
            }
            i--;
        }
        // when loop doesn't run i.e in case of smaller = 1;
        return 1;
    }
    // GCD using cofactor method, TC being O(sqrt(n))
    public static int gcd2(int a, int b)
{
    int greater, smaller;
    if (a > b)
    {
        greater = a;
        smaller = b;
    }
    else
    {
        greater = b;
        smaller = a;
    }
    if (greater % smaller == 0)
    {
        return smaller;
    }
    int maxGCD = 1;
    int sqrtSmaller = (int) Math.sqrt(smaller); // assuming it takes constant time
    for (int i = 1; i <= sqrtSmaller; i++) {
        if (smaller % i == 0) {
            // Check the divisor
            if (greater % i == 0) {
                maxGCD = i;
            }
            // Check the paired divisor
            int pairedDivisor = smaller / i;
            if (greater % pairedDivisor == 0) {
                maxGCD = pairedDivisor;
            }
        }
    }
    return maxGCD;
}
    //optimal approach, Euclid's Algorithm with TC of O(log(min(a,b))), quite weird to understand how
    public static int gcd3(int a, int b)
    {
        int dividend = (a>=b)? a:b;
        int divisor = (a<=b)? a:b;
        while(divisor!=0)
        {
            int remainder = dividend%divisor;
            dividend=divisor;
            divisor=remainder;
        }
        return dividend;
    }
    public static void main(String[] args) {
        System.out.println(lcm(14,8));
        System.out.println(gcd1(8,14));
        System.out.println(gcd2(8,14));
        System.out.println(gcd3(8,14));
    }
}
