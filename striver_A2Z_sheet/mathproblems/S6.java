public class S6 {
    // the most optimised method to find all factors of a number is cofactor method
    // with TC of O(sqrt(n))
    public static void divisors(int n)
    {
        int a = (int) Math.sqrt(n); //assuming it takes constant time
        int i = 1;
        while(i<=a)
        {
            if (n%i == 0)
            {
                if (n/i == i)
                {
                    System.out.println(i);
                }
                else
                {
                    System.out.println(i);
                    System.out.println(n/i);
                }
            }
            i++;
        }
    }
}
