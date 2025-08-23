import java.util.Stack;

public class S1 {
    // Method 1 => Using Stack
    public String removeOuterParentheses1(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(st.size()==0 && c == '(') {
                st.push(c);
            }
            else if(st.size() == 1 && c == ')') {
                st.pop();
            }
            else {
                if (c == '(') {
                    st.push(c);
                } else {
                    st.pop();
                }
                ans.append(c);
            }     
        }
        return ans.toString();
    }
    // Method 2 => Without Stack
    // keeping the track using depth counter
    // opening => check first then append & increment
    // closing => decrement first then check and append
    public String removeOuterParentheses2(String s) {
        StringBuilder ans = new StringBuilder();
        int depth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) ans.append(c);
                depth++;
            } else {
                depth--;
                if (depth > 0) ans.append(c);
            }
        }
        return ans.toString();
    }
}
