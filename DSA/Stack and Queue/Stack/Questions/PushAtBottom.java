package Stack.Questions;

import java.util.*;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s3 = new Stack<>();
        s3.push(1);
        s3.push(2);
        s3.push(3);

        pushAtBottom(s3, 4);

        while (!s3.isEmpty()) {
            System.out.println(s3.pop());
        }
    }

    public static void pushAtBottom(Stack<Integer> s3, int data) {
        if (s3.isEmpty()) {
            s3.push(data);
            return;
        }

        int top = s3.pop();
        pushAtBottom(s3, data);
        s3.push(top);
    }
}
