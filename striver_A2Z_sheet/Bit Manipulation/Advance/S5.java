public class S5 {
    class Solution {
        public double myPow(double x, int n) {
            //int pow = Math.abs(n);
            long pow = Math.abs((long) n);
            double ans = 1;
            while(pow>0) {
                if(pow%2 == 1) {
                    ans = ans*x;
                    pow = pow-1;
                }
                else {
                    pow = pow/2;
                    x = x*x;
                }
            }
            if(n<0) ans = 1.0/ans;
            return ans;
        }
    }
}
