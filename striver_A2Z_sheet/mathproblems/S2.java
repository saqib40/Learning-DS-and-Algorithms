public class S2 {
    //Given an integer N return the reverse of the given number
    public static int reverse(int x) {
        int dividend=x;
        int remainder=0;
        int reversedNumber=0;
        while(dividend != 0)
        {
            remainder=dividend%10;
            dividend/=10;
            // Check for overflow before updating reversedNumber
            if (reversedNumber > Integer.MAX_VALUE / 10 || 
                (reversedNumber == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0; // Overflow case for positive numbers
            }
            if (reversedNumber < Integer.MIN_VALUE / 10 || 
                (reversedNumber == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0; // Overflow case for negative numbers
            }
            reversedNumber = reversedNumber * 10 + remainder;
        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        System.err.println(reverse(0120));
    }
}
