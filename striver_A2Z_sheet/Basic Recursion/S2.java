public class S2 {
    public static void printGfg(int N) {
        // code here
        if (N < 1)
        {
            return;
        }
        System.out.print("GFG ");
        printGfg(N-1);
    }
}
