
import java.util.Stack;

public class evaluatePostfix {
    public boolean isOperand(String s) {
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            return false;
        }
        return true;
    }
    public String perform(String operator, String operand1, String operand2) {
        int op1 = Integer.valueOf(operand1);
        int op2 = Integer.valueOf(operand2);
        int ans = 0;
        if(operator.equals("+")) {
            ans = op1 + op2;
        } else if (operator.equals("-")) {
            ans = op1 - op2;
        } else if(operator.equals("*")) {
            ans = op1 * op2;
        } else { // division
            ans = op1 / op2;
        }
        return String.valueOf(ans);
    }
    public int evaluate(String[] arr) {
        // code here
        Stack<String> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            if(isOperand(arr[i])) {
                stack.push(arr[i]);
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String result = perform(arr[i], operand1, operand2);
                stack.push(result);
            }
        }
        return Integer.valueOf(stack.peek());
    }
}
