package lesson10;

import java.util.Stack;

public class Main03 {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        stack.push(4.2);
        stack.push(0.2);
        stack.push(4456.2);
        stack.push(4.00002);

        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
