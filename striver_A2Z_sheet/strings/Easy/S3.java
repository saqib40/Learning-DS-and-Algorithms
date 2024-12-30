public class S3 {
    // method 1; use a nested loop with O(n^2) finding all substrings
    // method 2;
    // odd numbers end with odd digit
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i=n-1; i>=0; i--) {
            if((num.charAt(i)-'0')%2 != 0) {
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
