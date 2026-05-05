package javaCollectionFramework;

import java.util.*;

/*
    ============================================
    🔹 DEFINITION & CONCEPTS
    ============================================

    1) Vector:
       - Part of Java Collection Framework.
       - Implements List interface.
       - Dynamic array (like ArrayList).
       - Synchronized (thread-safe).
       - Slower than ArrayList due to synchronization.
       - Maintains insertion order.
       - Allows duplicate elements and null values.

    2) Special Note:
       - Vector is considered a legacy class.
       - Mostly replaced by ArrayList in modern applications.
       - Still used where thread safety is required.

    ============================================
    🔹 METHODS USED
    ============================================

    addElement()      → Adds element at end
    addFirst()        → Adds element at beginning
    addLast()         → Adds element at end
    add()             → Adds element at end

    removeElement()   → Removes specific element
    removeElementAt() → Removes element at given index

    elementAt()       → Gets element at index
    contains()        → Checks if element exists
    firstElement()    → Returns first element
    lastElement()     → Returns last element

    setElementAt()    → Updates element at given index

    ============================================
    🔹 DIFFERENCE (Vector vs ArrayList)
    ============================================

    Vector        → Synchronized (Thread-safe), slower
    ArrayList     → Not synchronized, faster

    ============================================
    🔹 REAL-LIFE USAGE
    ============================================

    - Used in multi-threaded applications
    - When thread safety is required

*/

public class VectorClassExample {

    public static void main(String[] args) {
        
        // Creating Vector of String type
        Vector<String> vc = new Vector<String>();
        
        // Initially empty
        System.out.println(vc);
        
        // Adding elements
        vc.addElement("Ankit");    // Add at end
        vc.addElement("Omkar");
        vc.addElement("Kaushal");
        vc.addElement("Saurabh");
        
        vc.addLast("Vinit");       // Add at end
        vc.addElement("Vijay");    // Add at end
        
        vc.addFirst("Sahil");      // Add at beginning
        vc.add("Vikas");           // Add at end
        
        // Printing Vector (insertion order maintained)
        System.out.println(vc);
        
        // Removing elements
        vc.removeElement("Vikas");   // Remove specific element
        vc.removeElementAt(3);       // Remove element at index 3
        
        System.out.println(vc);
        
        // Accessing elements
        System.out.println(vc.elementAt(0));   // Get element at index 0
        System.out.println(vc.contains("Saurabh")); // true/false
        
        // First and last elements
        System.out.println(vc.firstElement());
        System.out.println(vc.lastElement());
        
        // Updating element at index 4
        vc.setElementAt("vikas", 4);
        
        System.out.println(vc);
    }
}