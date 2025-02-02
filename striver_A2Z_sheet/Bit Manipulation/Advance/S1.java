import java.util.ArrayList;

public class S1 {
    public static void print_divisors(int n) {
        // code here
        int sqrt = (int)Math.sqrt(n);
        //int[] arr = new int[sqrt]; // initialises with value = 0
        ArrayList<Integer> arr = new ArrayList<>();
        //int j=0;
        for(int i=1; i<=sqrt; i++) {
            if(n%i == 0) {
               //arr[j] = i;
               System.out.print(i + " ");
               int cofac = n/i;
               if(cofac != i) {
                   arr.add(cofac);
               }
               //j++;
            } 
        }
        for(int i=arr.size()-1; i>=0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
