package demo.baiTapCuaNgu.bai_tap_pt;

import java.util.Stack;

public class Parentheses {
    public static boolean checkParentheses(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String ngoac1 = "()(()())()";
        String ngoac2 = "()()()(";
        System.out.println(checkParentheses(ngoac1));
        System.out.println(checkParentheses(ngoac2));
    }
}
