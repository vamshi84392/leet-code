import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if ( ch == '{' || ch == '(' || ch == '[' ) {
                stack.push(ch);
            } else {
                if (!stack.isEmpty()) {
                    Character peek = stack.peek();
                    if ((ch == '}' && peek == '{') 
                    || (ch == ')' && peek == '(') 
                    || (ch == ']' && peek == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()[]{}"));
    }
}
