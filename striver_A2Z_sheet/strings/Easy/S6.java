public class S6 {
    // TC being O(n^2)
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return true;
        }
        StringBuilder temp = new StringBuilder(s);
        for(int i=0; i < s.length(); i++) {
            temp.append(temp.charAt(0));
            temp.delete(0,1);
            if(temp.toString().equals(goal)) { // comparison has O(n) TC
                return true;
            }
        }
        return false;
    }
    // optimal approach
    // s+s contains all possible rotations of s
    public boolean rotateString2(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String concatenated = s + s;
        return concatenated.contains(goal);
    }
}
