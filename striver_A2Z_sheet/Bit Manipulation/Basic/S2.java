public class S2 {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
        int operation = n & (1<<k);
        return (operation!=0)?true:false;
    }
}
