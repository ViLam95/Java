package stack_queue;

import java.util.Stack;

public class ReverseArraysUsingStack {
    public static String reserve(String input){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            reversed.append(ch);
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "World Stack";
        String reserve = reserve(input);
        System.out.println(reserve);
    }

}

