import java.util.HashMap;

public class S5 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        map.clear();
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(t.charAt(i))) {
                if(map.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                map.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
    // optimised
    public boolean isIsomorphic2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] sMap = new int[256];
        int[] tMap = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
        
            // If already mapped but not matching
            if (sMap[sChar] != 0 && sMap[sChar] != tChar) return false;
            if (tMap[tChar] != 0 && tMap[tChar] != sChar) return false;
        
            // Map characters
            sMap[sChar] = tChar;
            tMap[tChar] = sChar;
        }
        return true;
    }
}
