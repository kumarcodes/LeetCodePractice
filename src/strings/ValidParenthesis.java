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
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                stack.push(str.charAt(i));
            }
            else {
                if(stack.isEmpty())
                    return false;

                else if(!stack.isEmpty() && ((str.charAt(i)==']' && stack.peek()=='[')
                        || (str.charAt(i)=='}' && stack.peek()=='{')
                        || (str.charAt(i)==')' && stack.peek()=='(')
                ))
                    stack.pop();
                else
                    return false;
            }
        }
        if(stack.isEmpty())
            return true;

        return false;
    }
}
