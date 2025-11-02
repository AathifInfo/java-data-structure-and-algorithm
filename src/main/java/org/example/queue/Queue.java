package org.example.queue;

public class Queue {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    void enqueue(int num) {
        if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            queue[rear] = num;
            rear = (rear+1)%5;
            size++;
        }
    }


    int dequeue() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            data = queue[front];
            front = (front+1)%5;
            size--;
        }
        return data;
    }

    int size() {
        return size;
    }

    boolean isFull() {
        return size == queue.length;
    }

    Boolean isEmpty() {
        return size() == 0;
    }

    void show() {
        System.out.print("Circular Queue Elements : ");
        for (int i = 0; i < size(); i++) {
            System.out.print(queue[(front+i)%5]+" ");
        }
        System.out.println();
        System.out.print("Linear Queue Elements : ");
        for (int e: queue) {
            System.out.print(e+" ");
        }
    }


}
