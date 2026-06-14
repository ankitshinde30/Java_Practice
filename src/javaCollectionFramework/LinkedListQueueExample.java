package javaCollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

/*
    ============================================
    🔹 DEFINITION & CONCEPTS
    ============================================

    1) Queue Interface:
       - Part of Java Collection Framework.
       - Follows FIFO principle:
            First In First Out

       Meaning:
            The element inserted first
            is removed first.

    ============================================
    🔹 LINKEDLIST AS QUEUE
    ============================================

    LinkedList class can implement:
       ✔ List
       ✔ Queue
       ✔ Deque

    Here:
       Queue is implemented using LinkedList.

    ============================================
    🔹 FIFO WORKING
    ============================================

    Example:

       Insert:
          Apple
          Orange
          Kiwi

       Queue:
          Front → Apple Orange Kiwi ← Rear

       poll():
          Apple removed first

    ============================================
    🔹 ADVANTAGES OF LINKEDLIST QUEUE
    ============================================

    ✔ Faster insertion and deletion
    ✔ Dynamic size
    ✔ Maintains insertion order
    ✔ Efficient queue operations

    ============================================
    🔹 METHODS USED
    ============================================

    add()
       → Adds element to queue

    offer()
       → Safely adds element

    peek()
       → Returns front element
       → Does NOT remove element

    poll()
       → Removes front element

    contains()
       → Checks if element exists

    size()
       → Returns number of elements

    isEmpty()
       → Checks if queue is empty

    clear()
       → Removes all elements

    forEach()
       → Traverses queue elements

    ============================================
    🔹 DIFFERENCE:
       add() vs offer()
    ============================================

    add()
       - Throws exception if insertion fails

    offer()
       - Returns false if insertion fails

    ============================================
    🔹 DIFFERENCE:
       LinkedList Queue vs PriorityQueue
    ============================================

    LinkedList Queue:
       ✔ Maintains insertion order

    PriorityQueue:
       ✔ Maintains priority order
       ❌ Does not maintain insertion order

    ============================================
    🔹 REAL-LIFE USAGE
    ============================================

    - Ticket booking systems
    - Printer queue
    - Customer support systems
    - CPU scheduling
    - Call center waiting systems

*/

public class LinkedListQueueExample {

    public static void main(String[] args) {

        // Queue implemented using LinkedList
        Queue<String> al = new LinkedList<>();


        // =====================================
        // 🔹 ADD METHODS
        // =====================================

        // Adding elements
        al.add("Apple");

        al.add("Orange");

        // offer() safely adds element
        al.offer("Kiwi");

        al.offer("Mango");

        al.add("Papaya");


        // Printing Queue
        System.out.println("Queue:");
        System.out.println(al);


        // =====================================
        // 🔹 peek()
        // =====================================

        // Returns front element
        // Does NOT remove element
        System.out.println("\npeek(): " + al.peek());


        // =====================================
        // 🔹 poll()
        // =====================================

        // Removes front element
        System.out.println("poll(): " + al.poll());

        System.out.println("\nAfter poll():");
        System.out.println(al);


        // =====================================
        // 🔹 contains()
        // =====================================

        // Checks if element exists
        System.out.println("\ncontains(\"Apple\"): "
                + al.contains("Apple"));


        // =====================================
        // 🔹 size()
        // =====================================

        // Returns number of elements
        System.out.println("size(): " + al.size());


        // =====================================
        // 🔹 isEmpty()
        // =====================================

        // Checks if queue is empty
        System.out.println("\nisEmpty(): "
                + al.isEmpty());


        // =====================================
        // 🔹 forEach()
        // =====================================

        System.out.println("\nUsing forEach:");

        // Traversing queue using Lambda Expression
        al.forEach(fruit -> System.out.println(fruit));


        // =====================================
        // 🔹 clear()
        // =====================================

        // Removes all elements
        al.clear();

        System.out.println("\nAfter clear():");
        System.out.println(al);


        // Checking again
        System.out.println("isEmpty(): "
                + al.isEmpty());
    }
}