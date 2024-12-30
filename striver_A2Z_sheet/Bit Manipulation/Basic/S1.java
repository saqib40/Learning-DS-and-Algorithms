public class S1 {
    // the actual question
    public static void bitManipulation(int num, int i) {
        // convert the num to binary
        int binary = 0;
        int pow = 0;
        while (num > 0) {
            int rem = num%2;
            num /= 2;
            binary += rem*Math.pow(10,pow);
            pow++;
        }
        // Get ith bit & then set ith bit & then clear ith bit
        int myBit = 0;
        int setBit = 0;
        int clearBit = 0;
        int counter = 1;
        pow = 0;
        while (binary>0) {
            int rem = binary%10;
            binary /= 10;
            if (counter == i) {
                myBit = rem;
                setBit += (rem | 1)*Math.pow(10,pow);
                clearBit += (rem & 0)*Math.pow(10,pow);
            }
            else {
                setBit += rem*Math.pow(10,pow);
                clearBit += rem*Math.pow(10,pow);
            }
            pow++;
            counter++;
        }
        // now print accordingly
        System.out.println(myBit + "   " + setBit + "   " + clearBit);
    }
    // above logic being error prone because
    // 1
    // int type cannot store the full binary representation of large numbers directly,
    // especially if the number has more bits than the maximum number of bits in an integer
    // 2
    // (Math.pow(10, pow)) rounding errors, especially with large numbers.
    // Direct bit manipulation is the way to go
    public static void bitManipulation2(int num, int i) {
        // Get ith bit (starting from 1)
        int iBit = (num>>(i-1)) & 1;
        // Set ith bit
        int setNum = num | (1<<(i-1));
        // clear ith bit
        int clrNum = num & ~(1<<(i-1));
        System.out.println(iBit + " " + setNum + " " + clrNum);
    }
}
