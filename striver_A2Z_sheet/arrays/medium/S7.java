
import java.util.ArrayList;

public class S7 {
    // leetcode problem
    // brute force two traversals
    // optimal involves single traversal
    public int[] rearrangeArray1(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int posIndex=0;
        int negIndex=1;
        for(int i=0; i<n; i++) { // i to iterate through nums
            if(nums[i]>0) {
                ans[posIndex] = nums[i];
                posIndex += 2;
                continue;
            }
            // nums[i] < 0 because nums[i] will never be 0
            ans[negIndex] = nums[i];
            negIndex += 2;
        }
        return ans;
    }
    // variety 2
    // number of positive elements and negative elements may or may not be equal
    // fallback to brute force approach with a slight variation
    public int[] rearrangeArray2(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int x: nums) {
            if(x<0) {
                neg.add(x);
            }
            else {
                pos.add(x);
            }
        }
        if(pos.size()>neg.size()) {
            for(int j=0; j<neg.size(); j++) {
                nums[2*j] = pos.get(2*j);
                nums[2*(j+1)] = neg.get(2*(j+1));
            }
            int index = neg.size()*2;
            for(int i=neg.size(); i<pos.size(); i++) {
                nums[index] = pos.get(i);
                index++;
            }
        }
        else {
            for(int j=0; j<pos.size(); j++) {
                nums[2*j] = pos.get(2*j);
                nums[2*(j+1)] = neg.get(2*(j+1));
            }
            int index = pos.size()*2;
            for(int i=pos.size(); i<neg.size(); i++) {
                nums[index] = neg.get(i);
                index++;
            }
        }
        return nums;
    }
}
