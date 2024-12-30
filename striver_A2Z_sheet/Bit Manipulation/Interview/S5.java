public class S5 {
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        int xorr = 0;
        for(int i=0; i<N; i++) {
            xorr^=Arr[i];
        }
        int rightMost = ((xorr&(xorr-1))^xorr);
        int b1=0;
        int b2=0;
        for(int i=0; i<N; i++) {
            if((Arr[i]&rightMost) != 0) {
                b1 ^= Arr[i];
            }
            else {
                b2 ^= Arr[i];
            }
        }
        int[] myArr = new int[2];
        myArr[0] = b1 > b2 ? b1 : b2;
        myArr[1] = b1 > b2 ? b2 : b1;
        return myArr;
    }
}
