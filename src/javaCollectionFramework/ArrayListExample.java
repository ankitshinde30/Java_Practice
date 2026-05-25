package javaCollectionFramework;

import java.util.*;

/*
    ============================================
    🔹 DEFINITION & CONCEPTS
    ============================================

    1) ArrayList:
       - Part of Java Collection Framework.
       - Implements List interface.
       - Dynamic array implementation.
       - Maintains insertion order.
       - Allows duplicate elements.
       - Allows null values.
       - Size increases automatically.

    ============================================
    🔹 IMPORTANT NOTE ⚠️
    ============================================

    ArrayList does NOT support:
        addFirst()
        addLast()

    These methods belong to:
        LinkedList

    ✔ Alternatives in ArrayList:
        add(0, element) → add at beginning
        add(element)    → add at end

    ============================================
    🔹 METHODS USED
    ============================================

    add()            → Adds element
    add(index,data)  → Inserts at specific index
    remove()         → Removes element
    contains()       → Checks if element exists
    get()            → Fetches element
    set()            → Updates element
    size()           → Returns size
    clone()          → Creates duplicate copy
    indexOf()        → Returns first occurrence index
    lastIndexOf()    → Returns last occurrence index
    forEach()        → Traverses elements
    Collections.sort()    → Sorts list
    Collections.reverse() → Reverses list

    ============================================
    🔹 IMPORTANT NOTE ABOUT getFirst() ⚠️
    ============================================

    ArrayList does NOT support:
        getFirst()

    ✔ getFirst() belongs to:
        LinkedList

    ✔ Correct alternative in ArrayList:
        al.get(0)

    ============================================
    🔹 DIFFERENCE:
       ArrayList vs LinkedList
    ============================================

    ArrayList:
       - Faster data access
       - Uses dynamic array

    LinkedList:
       - Faster insertion/deletion
       - Uses doubly linked list

    ============================================
    🔹 REAL-LIFE USAGE
    ============================================

    - Student record management
    - Shopping cart
    - Employee management
    - Dynamic data storage

*/

public class ArrayListExample {
        
    public static void main(String[] args) {
        
        // Creating Generic ArrayList of String type
        ArrayList<String> al = new ArrayList<String>();
        
        // Adding elements
        al.add("Apple");          // Add at end
        
        // ❌ Invalid methods for ArrayList
        // al.addFirst("Orange");
        // al.addLast("Kiwi");

        // ✔ Correct alternatives
        al.add(0, "Orange");      // Add at beginning
        al.add("Kiwi");           // Add at end
        
        al.add(0, "Banana");      // Insert at index 0
        al.add("Jack Fruit");     // Add at end
        
        // Printing ArrayList
        System.out.println(al);
        
        // Removing element at index 0
        al.remove(0);
        System.out.println(al);
        
        // Checking if element exists
        System.out.println(al.contains("Orange")); // true/false
        
        // Fetching element at index 2
        System.out.println(al.get(2));
        
        // Updating element at index 2
        al.set(2, "Grapes");
        System.out.println(al);
        
        // Printing size of ArrayList
        System.out.println(al.size());
        
        // ❌ Invalid in ArrayList
        // System.out.println(al.getFirst());

        // ✔ Correct alternative
        System.out.println(al.get(0));
        
        // clone() creates duplicate copy
        ArrayList dl = (ArrayList) al.clone();
        System.out.println(dl);
        
        // Returns first occurrence index
        System.out.println(al.indexOf("Grapes"));
        
        // Returns last occurrence index
        System.out.println(al.lastIndexOf("Jack Fruit"));
        
        // forEach loop traversal using Lambda Expression
        al.forEach(data -> System.out.println(data));
        
        // Sorting ArrayList in ascending order
        Collections.sort(al);
        System.out.println(al);
        
        // Reversing ArrayList
        Collections.reverse(al);
        System.out.println(al);
    }
}