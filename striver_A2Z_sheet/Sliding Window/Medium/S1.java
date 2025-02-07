
import java.util.HashMap;

public class S1 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character,Integer> map = new HashMap<>();
            int l = 0;
            //map.put(s.charAt(0), 0);
            int r = 0;
            int maxLength = 0;
            while(r<s.length()) {
                char c = s.charAt(r);
                if(map.containsKey(c)) {
                    //l = map.get(c) + 1;
                    l = Math.max(map.get(c) + 1, l); // Move `l` only forward e.g abba
                }
                map.put(c, r);
                maxLength = Math.max(maxLength, r-l+1);
                r++;
            }
            return maxLength;
        }
    }
}
