package Stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
        // CustomStack stack = new CustomStack(5);
        // DynamicStack stack = new DynamicStack(5);
        CustomStack stack = new DynamicStack(5);

        stack.push(3);
        stack.push(2);
        stack.push(61);
        stack.push(32);
        stack.push(54);
        stack.push(91); // this will say stack is full or gave an error -> without DynamicStack but with DynamicStack it will add this integer to the stack


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
