import java.util.ArrayList;

public class S9 {
    // Method 1
    // natural nested loop
    // TC => O(n^2)
    // Method 2
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> leaders = new ArrayList<Integer>();
        leaders.add(arr[n-1]);
        int greatest = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            if(arr[i]>=greatest) {
                greatest = arr[i];
                leaders.add(greatest);
            }
        }
        //reverse the array
        int i=0;
        int j=leaders.size()-1;
        while(i<j) {
            int temp = leaders.get(i);
            leaders.set(i,leaders.get(j));
            leaders.set(j,temp);
            i++;
            j--;
        }
        return leaders;
    }
}
