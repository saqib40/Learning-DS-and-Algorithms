public class S4GFG {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] answer = new Long[2];
        Long hcf,lcm;
        Long dividend = (A>=B)? A:B;
        Long divisor = (A<=B)? A:B;
        while(divisor!=0)
        {
            Long remainder = dividend%divisor;
            dividend=divisor;
            divisor=remainder;
        }
        hcf = dividend;
        lcm = (A*B)/hcf;
        answer[0] = lcm;
        answer[1] = hcf;
        return answer;
    }
}
