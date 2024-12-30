public class length {
    // find length
    public static int lengthOfStr(String s) {
        int length = 0;
        for(char c : s.toCharArray()) {
            length++;
        }
        return length;
        // s.length() has O(1) TC
    }
}
