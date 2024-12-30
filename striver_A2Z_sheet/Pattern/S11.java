public class S11 {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        for (int i=1; i<=n; i++)
        {
            if(i%2!=0) //the case of odd row
            {
                boolean decider = true;
                for(int j=1; j<=i; j++)
                {
                    if(decider)
                    {
                        System.out.print("1 ");
                        decider = false;
                    }
                    else
                    {
                        System.out.print("0 ");
                        decider = true;
                    }
                }
                System.out.println("");
            }
            else //the case of even row
            {
                boolean decider = true;
                for(int j=1; j<=i; j++)
                {
                    if(decider)
                    {
                        System.out.print("0 ");
                        decider = false;
                    }
                    else
                    {
                        System.out.print("1 ");
                        decider = true;
                    }
                }
                System.out.println("");
            }
        }
    }
}
