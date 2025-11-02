package org.example.linklist;

public class LinkedListRunner {
    public static void main(String[] args) {
        System.out.println("Linked List Running!");
        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(38);
        list.show();
    }
}
