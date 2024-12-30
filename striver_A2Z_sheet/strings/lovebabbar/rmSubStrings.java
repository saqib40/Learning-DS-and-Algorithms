public class rmSubStrings {
    // method 1;
    // TC being O(n^2)
    // no such thing as inplace algorithm in strings
    // SC is O(n^2) cause for each iteration substrings are created
    public String removeOccurrences1(String s, String part) {
        while (s.indexOf(part) != -1) {
            int index = s.indexOf(part);
            s = s.substring(0, index) + s.substring(index + part.length()); // Remove 'part'
        }
        return s;
    }
    // method 2
    // TC O(n)
    // SC O(n)
    public String removeOccurrences2(String s, String part) {
        StringBuilder ans = new StringBuilder();
        int pl = part.length();
        int sl = s.length();
        for(int i=0; i<sl; i++){
            char ch = s.charAt(i);
            ans.append(ch);
            if(ans.length() >= pl && ans.substring(ans.length()-pl).equals(part)){
                ans.delete(ans.length() - pl, ans.length());
            }
        }
        return ans.toString();
    }
}
