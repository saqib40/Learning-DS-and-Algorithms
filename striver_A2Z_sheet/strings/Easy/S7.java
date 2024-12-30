public class S7 {
    public boolean isAnagram(String s, String t) {
        int[] myArr = new int[26]; // initialized with zero
        // iterate through s
        // and store frequency
        for(char x : s.toCharArray()) {
            myArr[x-'a'] += 1;
        }
        // iterate through t
        // and decrement frequency
        for(char x : t.toCharArray()) {
            myArr[x-'a'] -= 1;
        }
        // iterate through myArr
        // found non-zero return false
        for(int i : myArr) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
