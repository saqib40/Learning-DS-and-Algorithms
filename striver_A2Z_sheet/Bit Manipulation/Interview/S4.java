public class S4 {
    public static int findXOR1(int N) { //xor from 1 to N
        if(N%4==1) {
            return 1;
        }
        else if(N%4==2) {
            return N+1;
        }
        else if(N%4==3) {
            return 0;
        }
        else {
            return N;
        }
    }
    public static int findXOR(int l, int r) {
        return findXOR1(l-1)^findXOR1(r);
    }
}
