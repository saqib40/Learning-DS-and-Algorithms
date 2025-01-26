
import java.util.Stack;

public class S7 {
    public boolean pair(char a, char b) {
        if(a == '(' && b == ')') {
            return true;
        }
        if(a == '{' && b == '}') {
            return true;
        }
        if(a == '[' && b == ']') {
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty() || !pair(stack.peek(), s.charAt(i))) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
