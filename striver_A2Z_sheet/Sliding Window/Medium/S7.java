public class S7 {
    class Solution {
        public int min(int[] arr) {
            if(arr[0] < arr[1] && arr[0] < arr[2]) {
                return arr[0];
            }
            else if (arr[1] < arr[0] && arr[1] < arr[2]) {
                return arr[1];
            }
            return arr[2];
        }
        public int numberOfSubstrings(String s) {
            int count = 0;
            int[] lastSeen = {-1,-1,-1};
            for(int i=0; i<s.length(); i++) {
                lastSeen[s.charAt(i) - 'a'] = i;
                //count = count + (1+min(lastSeen));
                if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
                    count += (1 + min(lastSeen));
                }
            }
            return count;
        }
    }
}
