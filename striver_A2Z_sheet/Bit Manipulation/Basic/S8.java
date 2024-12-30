public class S8 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) { //chudoo test case behenchod
        return Integer.MAX_VALUE;
        }
        boolean sign = true;
        if(dividend>=0&&divisor<0){
            sign=false;
        }
        if(dividend<=0&&divisor>0) {
            sign=false;
        }
        long n = Math.abs((long)dividend);
        //System.out.println(n);
        long d = Math.abs((long)divisor);
        //System.out.println(d);
        long ans = 0;
        while(n>=d) {
            int counter = 0;
            while(n>=(d<<(counter+1))) {
                counter++;
            }
            ans+=(1<<counter);
            n-=(d<<counter);
        }
        if(ans>Integer.MAX_VALUE){
            //System.out.println("Hii");
            return Integer.MAX_VALUE;
        }
        if(ans<Integer.MIN_VALUE){
            //System.out.println("hello");
            return Integer.MIN_VALUE;
        }
        return (sign)? (int)ans:(-1*(int)ans);
    }
}
