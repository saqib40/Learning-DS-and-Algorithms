public class S4 {
    // N to 1
    public static void printNos1(int N)
    {
        if (N < 1)
        {
            return;
        }
        System.out.print(N + " ");
        printNos1(N-1);
    }
}
