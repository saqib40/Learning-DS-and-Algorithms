public class S1GFG {
    static int evenlyDivides(int N){
        // code here
        int dividend=N;
        int remainder;
        int count=0;
        while(dividend>0)
        {
            remainder = dividend%10;
            if(remainder==0)
            {
                dividend /= 10;
                continue;
            }
            else if(N%remainder == 0)
            {
                count++;
            }
            dividend /= 10;
        }
        return count;
    }
}
