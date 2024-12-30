import java.util.Arrays;

public class basicConcepts {

    // converting a dec to binary
    public static int d2b(int dec) {
        // we have to go with successive division algorithm
        int answer = 0;
        //int pow = 0;
        int pow = 1; // 10^0 = 1
        while (dec > 0) {
            int rem = dec%2;
            dec /= 2;
            //answer += rem*Math.pow(10,pow);
            //pow++;
            answer += rem*pow;
            pow *= 10;
        }
        return answer;
    }

    // converting a binary to dec
    public static int b2d(int bin) { // assuming an unsigned binary
        int answer = 0;
        //int pow = 0;
        int pow = 1; // 2^0 = 1
        while (bin > 0) {
            int rem = bin%10;
            bin /= 10;
            //answer += rem*Math.pow(2,pow);
            //pow++;
            answer += rem*pow;
            pow *= 2;
        }
        return answer;
    }

    // count the number of set bits
    // Method 1
    // Method 2

    // Every number appears thrice except for one
    // Method 1; Basic Loops (understood)
    // Method 2; Using map (understood)
    // Method 3; Using bitwise
    public static int thriceUnique(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int bitIndex=0; bitIndex<32; bitIndex++) {
            int count = 0;
            for(int i=0; i<n; i++) {
                if((nums[i] & (1<<bitIndex)) != 0) {
                    count++;
                }
            }
            if(count%3 == 1) {
                ans = ans | (1<<bitIndex);
            }
        }
        return ans;
    }
    // Method 4; Jump
    public static int thriceUnique2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=1; i<n; i=i+3) {
            if(nums[i] != nums[i-1]) {
                return nums[i-1];
            }
        }
        return nums[n-1];
    }
    // Method 5; Using buckets (not an easy approach to think of)
    public static int thriceUnique3(int[] nums) {
        int n = nums.length;
        int ones = 0;
        int twos = 0;
        for(int i=0; i<n; i++) {
            ones = ((ones^nums[i])&(~twos));
            twos = ((twos^nums[i])&(~ones));
        }
        return ones;
    }
}
