package javaCollectionFramework;

import java.util.*;

/*
    ============================================
    🔹 DEFINITION & CONCEPTS
    ============================================

    1) ArrayList:
       - Part of Java Collection Framework.
       - Implements List interface.
       - Allows duplicate elements.
       - Maintains insertion order.
       - Allows null values.
       - Dynamic size (can grow/shrink).

    2) Important Note ⚠️:
       - ArrayList does NOT support:
            addFirst()
            addLast()
       - These methods belong to LinkedList.
       - Using them in ArrayList will give COMPILE-TIME ERROR.

       ✔ Correct alternative:
            add(0, element) → works like addFirst()
            add(element)    → adds at end (like addLast())

    ============================================
    🔹 METHODS USED
    ============================================

    add()        → Adds element
    add(index)   → Adds element at specific position
    remove()     → Removes element by index
    contains()   → Checks element
    get()        → Fetch element by index
    set()        → Update element
    size()       → Returns number of elements

*/

public class ArrayListExample {
        
    public static void main(String[] args) {
        
        // Creating ArrayList of String type (Generic)
        ArrayList<String> al = new ArrayList<String>();
        
        // Adding elements
        al.add("Apple");          // Add at end
        
        // ❌ Invalid in ArrayList (will give error)
        // al.addFirst("Orange");
        // al.addLast("Kiwi");

        // ✔ Correct way:
        al.add(0, "Orange");      // Works like addFirst()
        al.add("Kiwi");           // Works like addLast()
        
        al.add(0, "Banana");      // Insert at index 0
        al.add("Jack Fruit");     // Add at end
        
        // Printing list (ordered output)
        System.out.println(al);
        
        // Removing element at index 0
        al.remove(0);
        System.out.println(al);
        
        // Checking if "Orange" exists
        System.out.println(al.contains("Orange")); // true/false
        
        // Getting element at index 2
        System.out.println(al.get(2));
        
        // Updating element at index 2
        al.set(2, "Grapes");
        System.out.println(al);
        
        // Getting size of ArrayList
        System.out.println(al.size());
    }
}