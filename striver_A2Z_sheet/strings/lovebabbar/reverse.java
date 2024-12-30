public class reverse {
    // reverse the string
    public static String reverseString1(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for(int i=n-1; i>=0; i--) {
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
    // leetcode reverse the string
    public void reverseString2(char[] s) {
        int low = 0;
        int high = s.length-1;
        while(low<=high) {
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
    }
}
