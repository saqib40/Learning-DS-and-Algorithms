
import java.util.HashMap;

public class S3 {
    // method 1; using nested loop; O(n^2)
    // method 2; using a hashmap
    public int majorityElement1(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
                if(map.get(nums[i]) > n/2) {
                    return nums[i];
                }
            }
            else {
                map.put(nums[i],1);
            }
        }
        return 0; // if not found
    }
    // method 3; Moore’s Voting Algorithm
    public int majorityElement2(int[] nums) {
        int count = 0; // counting occurances of element
        int element = 0;
        for(int x : nums) {
            if(count == 0) {
                element = x;
                count++;
            }
            else if (x==element) {
                count++;
            }
            else if(x!=element) {
                count--;
            }
        }
        // if question doesn't gurantee the existance of majority element we
        // gotta run one more loop to verify that element does occur >n/2 times
        return element;
    }
}
