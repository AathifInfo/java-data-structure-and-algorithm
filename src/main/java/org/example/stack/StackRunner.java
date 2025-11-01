package org.example.stack;

public class StackRunner {
    public static void main(String[] args) {
        System.out.println("Stack is running!");
        Stack stack = new Stack();
        stack.push(10);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(9);
        stack.show();
        System.out.println("Peek Element "+stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println();
        stack.show();
        System.out.println("Peek Element "+stack.peek());

    }
}
