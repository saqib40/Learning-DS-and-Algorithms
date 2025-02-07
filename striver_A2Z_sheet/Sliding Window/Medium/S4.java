public class S4 {
    class Solution {
        public int characterReplacement(String s, int k) {
            int l = 0;
            int r = 0;
            int maxLen = 0;
            int maxFreq = 0;
            int[] hash = new int[26];
            while(r<s.length()) {
                hash[s.charAt(r) - 'A']++;
                maxFreq = Math.max(maxFreq, hash[s.charAt(r) - 'A']);
                if((r-l+1) - maxFreq > k) {
                    hash[s.charAt(l) - 'A']--;
                    l++;
                }
                if((r-l+1) - maxFreq <= k) {
                    maxLen = Math.max(maxLen, r-l+1);
                }
                r++;
            }
            return maxLen;
        }
    }
}
