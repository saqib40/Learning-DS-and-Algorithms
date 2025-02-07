// same as fruits into baskets
import java.util.HashMap;

public class S1 {
    class Solution {
        public int longestkSubstr(String s, int k) {
            // code here
            int l = 0;
            int r = 0;
            int maxLen = -1;
            HashMap<Character,Integer> map = new HashMap<>();
            while(r<s.length()) {
                if(map.containsKey(s.charAt(r))) {
                    map.put(s.charAt(r), map.get(s.charAt(r))+1);
                } else {
                    map.put(s.charAt(r), 1);
                }
                if(map.size() > k) {
                    while(map.size() > k) {
                        map.put(s.charAt(l), map.get(s.charAt(l))-1);
                        if(map.get(s.charAt(l)) == 0) {
                            map.remove(s.charAt(l));
                        }
                        l++;
                    }
                }
                if(map.size() == k) {
                    maxLen = Math.max(maxLen, r-l+1);
                }
                r++;
            }
            return maxLen;
        }
    }
}
