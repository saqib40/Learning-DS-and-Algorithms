public class S1 {
    public int minBitFlips(int start, int goal) {
        int ans = start^goal;
        int counter = 0;
        for(int i=0; i<32; i++) {
            if((ans&(1<<i))!=0) {
                counter++;
            }
        }
        return counter;
    }
}
