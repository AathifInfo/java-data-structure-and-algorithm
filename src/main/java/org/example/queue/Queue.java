package org.example.queue;

//| **Feature**                  | **Queue**                                                                                                                                                                                               | **Stack**                                                                                                                                                             |
//        | ---------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
//        | **Order of Operations**      | **FIFO** (First In, First Out): The first element added is the first one to be removed.                                                                                                                 | **LIFO** (Last In, First Out): The last element added is the first one to be removed.                                                                                 |
//        | **Basic Operations**         | - **enqueue()**: Add element to the rear (tail).<br>- **dequeue()**: Remove element from the front (head).                                                                                              | - **push()**: Add element to the top.<br>- **pop()**: Remove element from the top.                                                                                    |
//        | **Access to Elements**       | Only the front element can be accessed directly.                                                                                                                                                        | Only the top element can be accessed directly.                                                                                                                        |
//        | **Use Case**                 | - Useful in scenarios where order of arrival matters (e.g., task scheduling, print queues).<br>- Implemented in real-time systems like CPU scheduling.                                                  | - Suitable for scenarios where the most recent item needs to be accessed or removed first (e.g., function calls, undo operations).                                    |
//        | **Real-World Examples**      | - Queue in a printer.<br>- Customers in line at a bank.<br>- Task scheduling in OS.                                                                                                                     | - Undo operations in text editors.<br>- Function call stack.<br>- Browser back button functionality.                                                                  |
//        | **Insertion/Removal Point**  | Elements are added at the **rear** (enqueue) and removed from the **front** (dequeue).                                                                                                                  | Elements are added and removed from the **top** (push/pop).                                                                                                           |
//        | **Time Complexity (Access)** | - **O(1)** for enqueue and dequeue.<br>- **O(1)** for accessing the front element.                                                                                                                      | - **O(1)** for push and pop.<br>- **O(1)** for accessing the top element.                                                                                             |
//        | **Implementation**           | Can be implemented using arrays, linked lists, or circular buffers.                                                                                                                                     | Can be implemented using arrays, linked lists.                                                                                                                        |
//        | **Queue Types**              | - **Simple Queue**: Basic FIFO operation.<br>- **Circular Queue**: The queue forms a circle to avoid space wastage.<br>- **Priority Queue**: Elements are dequeued based on priority rather than order. | - **Basic Stack**: Standard LIFO behavior.<br>- **Deque (Double-Ended Queue)**: Elements can be added/removed from both ends (can act like both a queue and a stack). |
//        | **Memory Usage**             | Typically requires more memory if implemented as a circular queue (to prevent overflow issues).                                                                                                         | Memory usage is generally more efficient because of the LIFO structure (elements are stacked on top).                                                                 |
//        | **Thread Safety**            | Can be thread-safe with synchronized methods or specialized concurrent collections like `ConcurrentLinkedQueue`.                                                                                        | Can be thread-safe with synchronized methods or specialized collections like `Stack` (deprecated) or `Deque`.                                                         |


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
