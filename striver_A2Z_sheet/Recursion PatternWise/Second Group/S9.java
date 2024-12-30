
import java.util.ArrayList;

public class S9 {
    public void subsetSums(int[] arr, int index, int sum, ArrayList<Integer> ans) {
        // code here
        if(index == arr.length) {
            ans.add(sum);
            return;
        }
        //sum+=arr[index];
        subsetSums(arr,index+1,sum+arr[index],ans);
        subsetSums(arr, index+1, sum, ans);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        subsetSums(arr, 0, 0, ans);
        return ans;
    }
}
