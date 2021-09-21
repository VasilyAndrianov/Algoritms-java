package lesson_3;

import java.util.Stack;

public class ReversLine {
    public static String ReversLine(String str) {
        Stack<Character> stack = new Stack<>();
        String revLine = "";
        for (Character character : str.toCharArray()) {
            stack.add(character);
        }
        while (!stack.isEmpty()) {
            revLine = revLine + stack.pop();
        }
        return revLine;
    }
}
