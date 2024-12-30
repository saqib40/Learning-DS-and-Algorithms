import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class S8 {
    public HashSet<List<Integer>> combinationSum2(int index, int[] arr, int target, HashSet<List<Integer>> ans, List<Integer> ds) {
        if(index == arr.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return ans;
        }
        if(arr[index]<=target) {
            ds.add(arr[index]);
            combinationSum2(index+1,arr,target-arr[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        return combinationSum2(index+1, arr, target, ans, ds);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> ds = new ArrayList<>();
        HashSet<List<Integer>> result = combinationSum2(0,candidates,target,ans,ds);
        // convert this hashset into list of list and return the value
    }
    // method 2 => modifying recursion
    public void combinationSum22(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind; i<arr.length; i++) {
            if(i>ind && arr[i] == arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            combinationSum22(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum22(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum22(0,candidates,target,ans,ds);
        return ans;
    }
}
