import java.util.Arrays;
import java.util.HashSet;

public class S10 {
    // Method 1
    // TC being O(n^2)
    public static boolean linearSearch(int arr[], int K)
    {
        // to find if K is in arr or nah
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if (arr[i] == K)
            {
                return true;
            }
        }
        return false;
    }
    public int longestConsecutive1(int[] nums) {
        int ans = 0;
        for(int x : nums) {
            int i=0;
            int count=0;
            while(linearSearch(nums, x+i)) {
                i++;
                count++;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
    // Method 2
    // TC being O(nLogn)
    public int longestConsecutive2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int longestSequence = 0;
        int consecutiveSequence = 0;
        for(int i = 1; i<n; i++) {
            if(nums[i]-nums[i-1]==1) {
                consecutiveSequence++;
            }
            else {
                longestSequence = Math.max(longestSequence,consecutiveSequence+1);
            }
        }
        return Math.max(longestSequence,consecutiveSequence+1);
    }
    // Method 3
    // optimisation of method 1
    // TC being O(n)
    public int longestConsecutive3(int[] nums) {
        int ans = 0;
        HashSet <Integer> set = new HashSet<Integer>();
        for(int x:nums) {
            set.add(x);
        }
        for(int x:set) {
            if(!set.contains(x-1)) {
                int count = 0;
                int i = 0;
                while(set.contains(x+i)) {
                    count++;
                    i++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}
