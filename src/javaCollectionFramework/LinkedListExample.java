package javaCollectionFramework;

import java.util.*;

/*
    ============================================
    🔹 DEFINITION & CONCEPTS
    ============================================

    1) LinkedList:
       - Part of Java Collection Framework.
       - Implements List and Deque interfaces.
       - Uses Doubly Linked List data structure.
       - Allows duplicate elements.
       - Maintains insertion order.
       - Allows null values.
       - Efficient for insertion/deletion (no shifting like ArrayList).

    2) Special Methods in LinkedList:
       - addFirst() → Adds element at beginning
       - addLast()  → Adds element at end
       - remove()   → Removes first element (default behavior)
       - remove(index) → Removes element at specific index

    ============================================
    🔹 METHODS USED
    ============================================

    add()        → Adds element
    addFirst()   → Adds at beginning
    addLast()    → Adds at end
    add(index)   → Inserts at specific index
    remove()     → Removes first element
    remove(index)→ Removes element at index
    contains()   → Checks if element exists
    get()        → Fetch element by index
    set()        → Update element
    size()       → Returns number of elements

    ============================================
    🔹 ADVANTAGE OVER ARRAYLIST
    ============================================

    - Faster insertion and deletion
    - No shifting of elements required
    - Better when frequent modifications are needed

*/

public class LinkedListExample {

    public static void main(String[] args) {
        
        // Creating LinkedList of String type
        LinkedList<String> al = new LinkedList<String>();
        
        // Adding elements
        al.add("Apple");          // Add at end
        al.addFirst("Orange");    // Add at beginning
        al.addLast("Kiwi");       // Add at end
        al.add(0, "Banana");      // Insert at index 0
        al.add("Jack Fruit");     // Add at end
        
        // Printing list (insertion order maintained)
        System.out.println(al);
        
        // Removing elements
        al.remove();      // Removes first element
        al.remove(2);     // Removes element at index 2
        
        System.out.println(al);
        
        // Checking if "Orange" exists
        System.out.println(al.contains("Orange")); // true/false
        
        // Getting element at index 2
        System.out.println(al.get(2));
        
        // Updating element at index 2
        al.set(2, "Grapes");
        System.out.println(al);
        
        // Getting size of LinkedList
        System.out.println(al.size());
    }
}