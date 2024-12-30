public class Level1KK {
    // from n to 1
    static void printNos(int n) {
        if(n<1) {
            return;
        }
        System.out.println(n);
        printNos(n-1);
    }
    // from 1 to n
    static void printNos2(int n) {
        if(n<1) {
            return;
        }
        printNos(n-1);
        System.out.println(n);
    }
    // product of n to 1 aka factorial
    static int factorial(int n) {
        if(n<1) {
            return 1;
        }
        return n*factorial(n-1);
    }
    // sum of n to 1
    static int summation(int n) {
        if(n==1) {
            return 1;
        }
        return n+summation(n-1);
    }
    // sum of digits
    static int sumDigits(int n) {
        if(n/10 == 0) {
            return n;
        }
        return (n%10)+sumDigits(n/10);
    }
    // product of digits
    static int productDigits(int n) {
        if(n/10 == 0) {
            return n;
        }
        return (n%10)*productDigits(n/10);
    }
    // reverse a number
    // iteratively
    static int reverseNo(int n) {
        int rev = 0;
        while(n>0) {
            rev = rev*10 + (n%10);
            n = n/10;
        }
        return rev;
    }
    // recursively
    static int reverseNoR(int n, int rev) {
        if(n==0) {
            return rev;
        }
        rev = rev*10 + (n%10);
        return reverseNoR(n/10,rev);
    }
    static int reverseNoR(int n) {
        if(n<10) {
            return n;
        }
        return reverseNoR(n,0);
    }
    // check palindrome
    static boolean palindromeCheck(int n) {
        return n==reverseNo(n);
    }
    // count zeros
    static int countZeros(int n, int count) {
        if(n==0) {
            return count;
        }
        int last = n%10;
        if(last == 0) {
            count++;
        }
        return countZeros(n/10, count);
    }
    static int countZeros(int n) {
        return countZeros(n, 0);
    }
    // count steps leetcode
    // iterative solution
    static int numberOfSteps(int num) {
        int steps = 0;
        while(num>0) {
            if(num%2 != 0) {
                num--;
                steps++;
            } else {
                num = num/2;
                steps++;
            }
        }
        return steps;
    }
    // recursive solution
    static int numberOfStepsR(int num, int steps) {
        if(num==0) {
            return steps;
        }
        if(num%2 != 0) {
            return numberOfStepsR(--num,++steps);
        }
        return numberOfStepsR(num/2,++steps);
    }
    static int numberOfStepsR(int num) {
        return numberOfStepsR(num,0);
    }
}
