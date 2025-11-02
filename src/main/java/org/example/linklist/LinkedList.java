package org.example.linklist;
//| **Feature**                     | **ArrayList**                                                                                                                                 | **LinkedList**                                                                                                                                         |
//        | ------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
//        | **Data Structure**              | **Dynamic Array**: Stores elements in a contiguous block of memory.                                                                           | **Doubly Linked List**: Stores elements as nodes, where each node contains a reference to both the next and the previous node.                         |
//        | **Access Time (Random Access)** | O(1) for accessing elements by index (fast access).                                                                                           | O(n) for accessing elements by index (slower, requires traversal).                                                                                     |
//        | **Insertion/Deletion Time**     | O(n) for inserting/removing elements in the middle (due to shifting). O(1) for insertion/removal at the end (if no resizing needed).          | O(1) for inserting/removing at the beginning or end (given reference to node). O(n) for insertion/removal in the middle (due to traversal).            |
//        | **Memory Usage**                | **Low overhead**: Each element occupies only the space for the element itself.                                                                | **High overhead**: Each element stores two references (next and previous nodes), leading to higher memory usage.                                       |
//        | **Resizing**                    | Resizes the underlying array when the capacity is exceeded. This resizing operation is O(n).                                                  | No resizing needed; the list dynamically adjusts by adding/removing nodes.                                                                             |
//        | **Performance (Iteration)**     | **Better performance** for iteration due to contiguous memory allocation (better cache locality).                                             | **Slower iteration** because each element requires traversal via references (linked nodes).                                                            |
//        | **Memory Allocation**           | Elements are stored in contiguous memory, which can lead to memory wastage when resizing.                                                     | Memory is allocated dynamically for each node, but involves extra overhead for pointers.                                                               |
//        | **Use Case**                    | **Best for scenarios with frequent access and less frequent insertions/removals**. For example, if you need to frequently read from the list. | **Best for scenarios with frequent insertions and deletions**, especially at the beginning or middle. For example, queues or stacks with dynamic size. |
//        | **Thread Safety**               | Not thread-safe by default. You can use `Collections.synchronizedList` for synchronization if needed.                                         | Not thread-safe by default. You can use `Collections.synchronizedList` or other concurrent collections for thread safety.                              |
//        | **Underlying Implementation**   | Resizes dynamically, which may involve copying elements into a new array.                                                                     | Maintains references between nodes for dynamic insertion/removal.                                                                                      |
//        | **Cache Efficiency**            | **More cache-friendly** due to contiguous memory layout.                                                                                      | **Less cache-efficient** due to scattered memory locations for each node.                                                                              |
//        | **Growable Capacity**           | The array grows by 50% when the capacity is reached, but resizing can cause performance issues.                                               | No resizing involved, as elements are linked together with references.                                                                                 |

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next!=null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insetAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void show() {
        Node node = head;
        while (node.next!=null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insetAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }


}
