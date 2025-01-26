import java.util.Stack;

public class S1 {
    public static boolean isOperand(char s) {
        if(s=='^' || s=='+' || s=='-' || s=='*' || s=='/') {
            return false;
        }
        return true;
    }
    public static boolean isOpeningParan(char c) {
        if(c == '(' || c == '[' || c == '{') {
            return true;
        }
        return false;
    }
    public static boolean isClosingParan(char c) {
        if(c == ')' || c == ']' || c == '}') {
            return true;
        }
        return false;
    }
    public static boolean higherPrec(char a, char b) {
        return getPrecedence(a) >= getPrecedence(b);
    }  
    private static int getPrecedence(char op) {
        switch (op) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
            default: return 0;
        }
    }
    public static String infixToPostfix(String s) {
        // Your code here
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(isOperand(s.charAt(i))) {
                str.append(s.charAt(i));
            } else if (isOpeningParan(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (isClosingParan(s.charAt(i))) {
                while(!stack.isEmpty() && !isOpeningParan(stack.peek())) {
                    str.append(stack.pop());
                }
                stack.pop();
            } else { 
                // so it's an operator
                while(!stack.isEmpty() && !isOpeningParan(stack.peek()) && higherPrec(stack.peek(), s.charAt(i))) {
                    str.append(stack.pop());
                }
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()) {
            str.append(stack.pop());
        }
        return str.toString();
    }
}
