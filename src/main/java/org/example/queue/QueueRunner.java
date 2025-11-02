package org.example.queue;

public class QueueRunner {
    public static void main(String[] args) {
        System.out.println("Queue is running!");
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(8);
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.show();
        System.out.println();
        System.out.println("Size : "+queue.size());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(20);
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
        queue.show();
        System.out.println();
        System.out.println("Size : "+queue.size());
    }
}
