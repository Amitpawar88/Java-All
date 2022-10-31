package Stack.Questions;

import java.util.Stack;

public class Reverse {
    public static String reverseString(String str) {
        Stack<Character> s4 = new Stack<>();
        
        int index = 0;

        while (index < str.length()) {
            s4.push(str.charAt(index));
            index++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s4.isEmpty()) {
            char curr = s4.pop();
            result.append(curr);
        }

        return result.toString();
    }

    // Reverse Stack

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        // String str = "abc";
        // System.out.println(reverseString(str));

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        // 3, 2, 1
        reverseStack(s);
        printStack(s);
        // 1, 2, 3
    }
}
