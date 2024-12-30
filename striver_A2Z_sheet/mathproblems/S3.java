public class S3 {
    //Given an integer N, return true if it is a palindrome else return false.
    public int reverse(int x) {
        int dividend=x;
        int remainder=0;
        int reversedNumber=0;
        while(dividend > 0)
        {
            remainder=dividend%10;
            dividend/=10;
            // Check for overflow before updating reversedNumber
            if (reversedNumber > Integer.MAX_VALUE / 10 || 
                (reversedNumber == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0; // Overflow case for positive numbers
            }
            reversedNumber = reversedNumber * 10 + remainder;
        }
        return reversedNumber;
    }
    public boolean isPalindrome(int x) {
        if(x==0)
        {
            return true;
        }
        // if negative or multiple of 10 => false
        if(x<0 || x%10 ==0)
        {
            return false;
        }
        return (reverse(x) == x)?(true):(false);
    }
}
