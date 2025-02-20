import java.util.ArrayList;
import java.util.List;

public class S2 {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0; int cnt2 = 0;
        int elem1 = 0; int elem2 = 0;
        for(int i=0; i<nums.length; i++) {
            if(cnt1 == 0 && nums[i] != elem2) {
                elem1 = nums[i];
                cnt1++;
            } else if (cnt2 == 0 && nums[i] != elem1) {
                elem2 = nums[i];
                cnt2++;
            } else if(elem1 == nums[i]) {
                cnt1++;
            } else if(elem2 == nums[i]) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        // traverse again and makesure
        List<Integer> ans = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == elem1) {
                cnt1++;
            }
            else if(nums[i] == elem2) {
                cnt2++;
            }
        }
        if(cnt1 > nums.length/3) {
            ans.add(elem1);
        }
        if(cnt2 > nums.length/3) {
            ans.add(elem2);
        }
        return ans;
    }
}
