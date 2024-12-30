
import java.util.ArrayList;

public class S5 {
    // print subsequences whose sum is k
    public void perfectSumP(int[] nums, int target) {
        ArrayList<Integer> temp = new ArrayList<>();
        perfectSumP(nums,target,0,0,temp);
    }
    public void perfectSumP(int[] nums, int target, int tempSum, int index, ArrayList<Integer> temp) {
        if(index == nums.length) {
            if(tempSum == target) {
                System.out.println(temp);
            }
            return;
        }
        temp.add(nums[index]);
        tempSum += nums[index];
        perfectSumP(nums,target,tempSum,index+1,temp);
        temp.remove(temp.size()-1);
        tempSum -= nums[index];
        perfectSumP(nums,target,tempSum,index+1,temp);
    }
    // print only one subsequence whose sum is k
    static boolean perfectSumOne(int[] nums, int target, int tempSum, int index, ArrayList<Integer> temp) {
        if(index == nums.length) {
            if(tempSum == target) {
                System.out.println(temp);
                return true;
            }
            return false;
        }
        temp.add(nums[index]);
        tempSum += nums[index];
        if(perfectSumOne(nums,target,tempSum,index+1,temp) == true) {
            return true; // no need to move forward
        };
        temp.remove(temp.size()-1);
        tempSum -= nums[index];
        if(perfectSumOne(nums,target,tempSum,index+1,temp) == true) {
            return true;
        };
        return false;
    }
    // GFG, problem with TLE need DP concepts to optimise it
    public int perfectSum1(int[] nums, int target, int index, int ans, int tempSum) {
        if(index == nums.length) {
            if(tempSum == target) {
                ans+=1;
            }
            return ans;
        }
        ans = perfectSum1(nums, target, index+1, ans, tempSum+nums[index]);
        ans = perfectSum1(nums, target, index+1, ans, tempSum);
        return ans; // this ain't executing upar wala return statement does
    }
    public int perfectSum1(int[] nums, int target) {
        // code here
        return perfectSum1(nums,target,0,0,0);
    }
    // striver's approach, same error of TLE, nice patten to remember
    public int perfectSum(int[] nums, int target, int index, int tempSum) {
        if(index == nums.length) {
            if(tempSum == target) {
                return 1;
            }
            return 0;
        }
        int left = perfectSum(nums, target, index+1, tempSum+nums[index]);
        int right = perfectSum(nums, target, index+1, tempSum);
        return left+right;
    }
}
