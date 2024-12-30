public class S5 {
    // brute force (easy peazy)
    
    // quite difficult aaj shaam ko kartye hai TC being O(digits in N) i.e O(LogN to base 10 + 1)
    public static int countSetBits(int n){
        int count = 0;
        int x = 0;
        while((1<<x)<=n) {
            int totalNums = n+1;
            int completeCycles = totalNums>>(x+1);
            int remainder = totalNums&((1<<(x+1))-1);
            
            count += completeCycles<<x;
            if(remainder > (1<<x)) {
                count += remainder-(1<<x);
            }
            x++;
        }
        return count;
    }
}
