package strings;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "([{}])";
        boolean isValid = isValidParenthesisChecker(str);
        System.out.println(isValid);

    }

    private static boolean isValidParenthesisChecker(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            else if (!stack.isEmpty() && (ch == ')' && stack.peek() == '('))
                stack.pop();
            else if (!stack.isEmpty() && (ch == '}' && stack.peek() == '{'))
                stack.pop();
            else if (!stack.isEmpty() && (ch == ']' && stack.peek() == '['))
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }
}
