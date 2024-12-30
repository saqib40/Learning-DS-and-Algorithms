import java.util.Stack;

public class duplicates {
    public String removeDuplicates(String s) {
        Stack<Character> myStack = new Stack<>();
        int n = s.length();
        for(int i=n-1; i>=0; i--) {
            char ch = s.charAt(i);
            if(!myStack.isEmpty() && myStack.peek() == ch) {
                myStack.pop();
            }
            else {
                myStack.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!myStack.isEmpty()) {
            ans.append(myStack.pop());
        }
        return ans.toString();
    }
}
