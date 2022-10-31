package Stack;

import java.util.Stack;

public class InBuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(2);
        stack.push(61);
        stack.push(32);
        stack.push(54);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
