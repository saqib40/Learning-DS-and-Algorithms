
import java.util.ArrayList;
import java.util.List;

public class S3 {
    // Method 1; Power Set Algorithm of Bit Manipulation => faster
    // TC is O(2^n*n) and SC O(1)
    // Method 2; Using Recursion
    // TC is O(2^n*n) and SC O(n)
    // print all subsequences
    static void printSubSets(int[] nums, int size, ArrayList<Integer> temp, int index) {
        if(index == size) {
            System.out.println(temp);
            return;
        } 
        temp.add(nums[index]);
        printSubSets(nums, size, temp, index+1);
        temp.remove(temp.size()-1); // pop out the last element
        printSubSets(nums, size, temp, index+1);
    }
    static void printSubSets(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        printSubSets(nums,nums.length,temp,0);
    }
    // leetcode
    public List<List<Integer>> subsets(int[] nums, int index, List<List<Integer>> ans, int n, List<Integer> temp) {
        if(index==n) {
            // In Java, when you add a list to another list, it adds a reference to the same object.
            // rather than a copy
            // To fix the issue, 
            // you need to create a new copy of the temp list when adding it to the ans list.
            ans.add(new ArrayList<>(temp)); // 
            return ans;
        }
        temp.add(nums[index]);
        subsets(nums,index+1,ans,n,temp);
        temp.remove(temp.size() - 1); // remove last element
        return subsets(nums,index+1,ans,n,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        return subsets(nums, 0, answer, nums.length, temp);
    }

}
