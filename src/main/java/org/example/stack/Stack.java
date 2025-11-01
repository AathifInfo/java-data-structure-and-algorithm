package org.example.stack;

public class Stack {
    int stack[] =  new int[5];
    int top = 0;


    void push(int num) {
        if (isFull()) {
            System.out.println("The stack is full!");
        } else {
            stack[top] = num;
            top++;
        }
    }

    int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }

    int peek() {
        return !isEmpty() ? stack[top-1] : 0    ;
    }

    void show() {
        System.out.print("Current Stack Output: ");
        for (int item: stack) {
            System.out.print(item+" ");
        }
        System.out.println();
    }

    boolean isEmpty() {
        return top <= 0;
    }

    boolean isFull() {
        return top == stack.length;
    }
}
