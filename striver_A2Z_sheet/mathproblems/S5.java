public class S5 {
    //Given an integer N, return true it is an Armstrong number otherwise return false
    public static boolean armstrong(int n)
    {
        int dividend = n;
        int length = (int) Math.log10(n) + 1; //math.log takes double and returns double
        int answer = 0;
        while (dividend != 0) { 
            int remainder = dividend%10;
            answer += Math.pow(remainder, length); // it also takes and returns double but type promotion is happening
            dividend /= 10;
        }
        return (answer == n)?(true):(false);
    }
}
