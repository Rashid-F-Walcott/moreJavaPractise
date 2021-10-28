package Day_4_thurs;

import java.util.Stack;

public class ParenthesisChecker {

    public boolean check(String inputStr2) {

        Stack<Character> stack = new Stack<>();
        char[] arrayOfStChars = inputStr2.toCharArray();

        if (inputStr2.isEmpty()) return false;

        for (char c : arrayOfStChars) {
            switch (c) {
                case '(', '{' -> stack.push(c);
                case ')' -> {
                    if (stack.empty()) {
                        return false;
                    } else if (stack.peek() == '(') {
                        stack.pop();
                    } else return false;
                } case '}' -> {
                    if (stack.empty()) {
                        return false;
                    } else if (stack.peek() == '{') {
                        stack.pop();
                    } else return false;
                }
            }
        }
        return stack.empty();
    }


}
