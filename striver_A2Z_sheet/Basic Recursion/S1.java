public class S1 {
    // N to 1
    public static void printNos2(int N)
    {
        if (N < 1)
        {
            return;
        }
        printNos2(N-1);
        System.out.print(N + " ");
    }
}
