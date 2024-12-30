
import java.util.ArrayList;

public class arrayKK {
    // sorted array check
    // iteratively
    static boolean checkI(int[] nums) {
        for(int i=0; i<=nums.length-2; i++) {
            if(nums[i]>nums[i+1]) {
                return false;
            }
        }
        return true;
    }
    // recursively
    static boolean checkR(int[] nums, int index) {
        if(index == nums.length-1) {
            return true;
        }
        if(nums[index] > nums[index+1]) {
            return false;
        }
        return checkR(nums,index+1);
    }
    static boolean checkR(int[] nums) {
        return checkR(nums,0);
    }

    // linear search
    // iteratively
    static int linearSearchI(int[] nums, int k) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == k) {
                return i;
            }
        }
        return -1;
    }
    // recursively
    static int linearSearchR(int[] nums, int k, int index) {
        if(index==nums.length) {
            return -1;
        }
        if(nums[index] == k) {
            return index;
        }
        return linearSearchR(nums, k, index+1);
    }
    static int linearSearchR(int[] nums, int k) {
        return linearSearchR(nums, k, 0);
    }

    // linear search on multiple occurances aka returning an ArrayList
    static ArrayList<Integer> lSearch(int[] nums, int k, int index, ArrayList<Integer> ans) {
        if(index==nums.length) {
            return ans;
        }
        if(nums[index] == k) {
            ans.add(index);
        }
        return lSearch(nums,k,index+1,ans);
    }
    static ArrayList<Integer> lSearch(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        return lSearch(nums,k,0,ans);
    }

    // return the list without passing the argument
    static ArrayList<Integer> lSearch2(int[] nums, int k, int index) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(index==nums.length) {
            return ans;
        }
        if(nums[index] == k) {
            ans.add(index);
        }
        // logic when the call stack reaches termination
        // and we are moving back up to empty it
        ArrayList<Integer> temp = lSearch2(nums, k, index+1);
        ans.addAll(temp);
        return ans;
    }
    // rotated binary search
    // seems pretty easy
    // will attempt it when I get back to revising BS
}
