
import java.util.Stack;

// method 1
public class S8 {
    public class MinStack {
        class Pair {
            int value;
            int min;
            Pair(int value, int min) {
                this.value = value;
                this.min = min;
            }
        }
        Stack<Pair> myStack;
        public MinStack() {
            myStack = new Stack<>();
        }
        
        public void push(int val) {
            if(myStack.isEmpty()) {
                myStack.push(new Pair(val, val));
            } else {
                Pair top = myStack.peek();
                if(val < top.min) {
                    myStack.push(new Pair(val, val));
                } else {
                    myStack.push(new Pair(val, top.min));
                }
            }
        }
        
        public void pop() {
            myStack.pop();
        }
        
        public int top() {
            return myStack.peek().value;
        }
        
        public int getMin() {
            return myStack.peek().min;
        }
    }

    // method 2
    class MinStack2 {
        Stack<Long> stack;
        Long minimum;
        public MinStack2() {
            stack = new Stack<>();
            minimum = Long.MAX_VALUE;
        }
        
        public void push(int val) {
            Long newValue = Long.valueOf(val);
            if(stack.isEmpty()) {
                minimum = newValue;
                stack.push(newValue);
            } else {
                if(newValue >= minimum) {
                    stack.push(newValue);
                } else {
                    Long encoded = 2*newValue-minimum;
                    stack.push(encoded);
                    minimum = newValue;
                }
            }
        }
        
        public void pop() {
            if (stack.isEmpty()) return;
            Long popped = stack.pop();
            if(popped < minimum) {
                Long decoded = 2*minimum - popped;
                minimum = decoded;
            }
        }
        
        public int top() {
            Long top = stack.peek();
            if(top>=minimum) {
                return top.intValue();
            }
            return minimum.intValue();
        }
        
        public int getMin() {
            return minimum.intValue();
        }
    }
    
}