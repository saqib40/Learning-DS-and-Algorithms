import java.util.ArrayList;
import java.util.List;

public class S7 {
    public List<List<Integer>> combinationSum(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(index == arr.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return ans;
        }
        if(arr[index]<=target) {
            ds.add(arr[index]);
            combinationSum(index,arr,target-arr[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        return combinationSum(index+1, arr, target, ans, ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        return combinationSum(0,candidates,target,ans,ds);
    }
}
