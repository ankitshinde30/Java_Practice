package javaCollectionFramework;

import java.util.*;

/*
    ============================================
    🔹 DEFINITION & CONCEPTS
    ============================================

    1) LinkedList:
       - Part of Java Collection Framework.
       - Implements:
            ✔ List Interface
            ✔ Deque Interface

       - Uses Doubly Linked List data structure.
       - Maintains insertion order.
       - Allows duplicate elements.
       - Allows null values.
       - Dynamic in size.

    ============================================
    🔹 ADVANTAGES OF LINKEDLIST
    ============================================

    ✔ Faster insertion and deletion
    ✔ No shifting of elements
    ✔ Supports queue and stack operations

    ============================================
    🔹 LINKEDLIST CAN WORK AS:
    ============================================

    1) List
    2) Queue
    3) Deque
    4) Stack

    ============================================
    🔹 METHODS USED
    ============================================

    🔹 ADD METHODS
    add()         → Adds element
    addFirst()    → Adds at beginning
    addLast()     → Adds at end
    offer()       → Adds element
    offerFirst()  → Adds at beginning
    offerLast()   → Adds at end

    🔹 PEEK METHODS
    peek()        → Returns first element
    peekFirst()   → Returns first element
    peekLast()    → Returns last element

    🔹 POLL METHODS
    poll()        → Removes first element
    pollFirst()   → Removes first element
    pollLast()    → Removes last element

    🔹 STACK METHODS
    push()        → Adds element at beginning
    pop()         → Removes first element

    🔹 REMOVE METHODS
    remove()      → Removes first element
    remove(index) → Removes element at index

    🔹 OTHER METHODS
    contains()    → Checks element existence
    get()         → Fetches element
    set()         → Updates element
    size()        → Returns size
    indexOf()     → First occurrence index
    lastIndexOf() → Last occurrence index
    clone()       → Creates copy
    clear()       → Removes all elements
    isEmpty()     → Checks if empty

    ============================================
    🔹 ITERATION METHODS
    ============================================

    ListIterator
       - Traverses elements one by one

    forEach()
       - Traverses using Lambda Expression

    ============================================
    🔹 REAL-LIFE USAGE
    ============================================

    - Music playlist
    - Browser history
    - Queue management
    - Undo/Redo operations
    - Navigation systems

*/

public class LinkedListExample {

    public static void main(String[] args) {

        // Creating Generic LinkedList of String type
        LinkedList<String> al = new LinkedList<String>();


        // =====================================
        // 🔹 ADD METHODS
        // =====================================

        al.add("Apple");              // Add at end

        al.addFirst("Orange");        // Add at beginning

        al.addLast("Kiwi");           // Add at end

        al.add(0, "Banana");          // Insert at index 0

        al.offer("Mango");            // Add element

        al.offerFirst("Pineapple");   // Add at beginning

        al.offerLast("Papaya");       // Add at end

        al.add("Apple");              // Duplicate allowed

        // Printing LinkedList
        System.out.println("After Adding Elements:");
        System.out.println(al);


        // =====================================
        // 🔹 PEEK METHODS
        // =====================================

        // Returns first element
        System.out.println("\npeek(): " + al.peek());

        // Returns first element
        System.out.println("peekFirst(): " + al.peekFirst());

        // Returns last element
        System.out.println("peekLast(): " + al.peekLast());


        // =====================================
        // 🔹 POLL METHODS
        // =====================================

        // Removes first element
        System.out.println("\npoll(): " + al.poll());

        // Removes first element
        System.out.println("pollFirst(): " + al.pollFirst());

        // Removes last element
        System.out.println("pollLast(): " + al.pollLast());

        // Printing after poll operations
        System.out.println("\nAfter Poll Operations:");
        System.out.println(al);


        // =====================================
        // 🔹 PUSH & POP METHODS
        // =====================================

        // Adds at beginning (Stack operation)
        al.push("Strawberry");

        al.push("Watermelon");

        System.out.println("\nAfter push():");
        System.out.println(al);

        // Removes first element
        System.out.println("pop(): " + al.pop());

        System.out.println("After pop():");
        System.out.println(al);


        // =====================================
        // 🔹 REMOVE METHODS
        // =====================================

        al.remove(); // Removes first element

        al.remove(1); // Removes element at index 1

        System.out.println("\nAfter Remove Operations:");
        System.out.println(al);


        // =====================================
        // 🔹 OTHER METHODS
        // =====================================

        // Checks if element exists
        System.out.println("\ncontains(\"Apple\"): "
                + al.contains("Apple"));

        // Fetches element at index 1
        System.out.println("get(1): " + al.get(1));

        // Updating element
        al.set(1, "Grapes");

        System.out.println("\nAfter set():");
        System.out.println(al);

        // Returns size
        System.out.println("\nsize(): " + al.size());


        // =====================================
        // 🔹 indexOf() & lastIndexOf()
        // =====================================

        al.add("Apple");

        // First occurrence index
        System.out.println("\nindexOf(\"Apple\"): "
                + al.indexOf("Apple"));

        // Last occurrence index
        System.out.println("lastIndexOf(\"Apple\"): "
                + al.lastIndexOf("Apple"));


        // =====================================
        // 🔹 clone()
        // =====================================

        // Creating duplicate copy
        LinkedList<String> clonedList =
                (LinkedList<String>) al.clone();

        System.out.println("\nCloned LinkedList:");
        System.out.println(clonedList);


        // =====================================
        // 🔹 listIterator()
        // =====================================

        System.out.println("\nUsing ListIterator:");

        // Creating ListIterator object
        ListIterator<String> itr = al.listIterator();

        // Traversing LinkedList
        while (itr.hasNext()) {

            System.out.println(itr.next());
        }


        // =====================================
        // 🔹 forEach()
        // =====================================

        System.out.println("\nUsing forEach:");

        // Traversing using Lambda Expression
        al.forEach(fruit -> System.out.println(fruit));


        // =====================================
        // 🔹 isEmpty()
        // =====================================

        // Checks if LinkedList is empty
        System.out.println("\nisEmpty(): "
                + al.isEmpty());


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