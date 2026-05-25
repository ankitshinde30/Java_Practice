package javaCollectionFramework;

import java.util.*;


/*
    ============================================
    🔹 DEFINITION & CONCEPTS
    ============================================

    1) Vector:
       - Part of Java Collection Framework.
       - Implements List interface.
       - Dynamic array implementation.
       - Maintains insertion order.
       - Allows duplicate elements.
       - Allows null values.
       - Synchronized (Thread-safe).

    ============================================
    🔹 IMPORTANT FEATURES OF VECTOR
    ============================================

    ✔ Dynamic resizing
    ✔ Thread-safe
    ✔ Maintains insertion order
    ✔ Supports legacy methods
    ✔ Allows duplicate elements

    ============================================
    🔹 VECTOR vs ARRAYLIST
    ============================================

    Vector:
       - Synchronized
       - Slower
       - Thread-safe

    ArrayList:
       - Non-synchronized
       - Faster
       - Not thread-safe

    ============================================
    🔹 METHODS USED
    ============================================

    isEmpty()         → Checks if Vector is empty

    addElement()      → Adds element at end
    add()             → Adds element
    addFirst()        → Adds at beginning
    addLast()         → Adds at end
    add(index,data)   → Inserts at specific index

    size()            → Returns number of elements
    capacity()        → Returns current capacity

    firstElement()    → Returns first element
    lastElement()     → Returns last element
    elementAt()       → Returns element at index
    get()             → Fetches element

    contains()        → Checks if element exists
    indexOf()         → First occurrence index
    lastIndexOf()     → Last occurrence index

    set()             → Updates element
    setElementAt()    → Updates element at index

    removeElement()   → Removes specific element
    remove()          → Removes by index
    removeElementAt() → Removes at index

    clone()           → Creates duplicate copy

    ensureCapacity()  → Increases capacity
    trimToSize()      → Reduces capacity to current size

    elements()        → Returns Enumeration object

    clear()           → Removes all elements

    ============================================
    🔹 CAPACITY CONCEPT
    ============================================

    Size:
       - Number of elements present

    Capacity:
       - Total storage allocated internally

    Default Vector capacity = 10

    ============================================
    🔹 ENUMERATION
    ============================================

    Enumeration is used to traverse legacy collections.

    Methods:
       hasMoreElements() → Checks next element
       nextElement()     → Returns next element

    ============================================
    🔹 REAL-LIFE USAGE
    ============================================

    - Multi-threaded applications
    - Legacy systems
    - Dynamic data handling
    - Inventory management systems

*/

public class VectorClassExample {

    public static void main(String[] args) {

        // Creating Generic Vector of String type
        Vector<String> vc = new Vector<String>();


        // =====================================
        // 🔹 isEmpty()
        // =====================================

        // Checks if Vector is empty
        System.out.println("Is Vector Empty? : " + vc.isEmpty());


        // =====================================
        // 🔹 ADD METHODS
        // =====================================

        // Adding elements at end
        vc.addElement("Ankit");
        vc.addElement("Omkar");
        vc.addElement("Kaushal");

        // add() method
        vc.add("Saurabh");

        // Adding at beginning
        vc.addFirst("Sahil");

        // Adding at end
        vc.addLast("Vinit");

        // Adding at specific index
        vc.add(2, "Vijay");

        System.out.println("\nAfter Adding Elements:");
        System.out.println(vc);


        // =====================================
        // 🔹 size() & capacity()
        // =====================================

        // Returns number of elements
        System.out.println("\nSize : " + vc.size());

        // Returns total allocated capacity
        System.out.println("Capacity : " + vc.capacity());


        // =====================================
        // 🔹 ACCESS METHODS
        // =====================================

        // Returns first element
        System.out.println("\nFirst Element : "
                + vc.firstElement());

        // Returns last element
        System.out.println("Last Element : "
                + vc.lastElement());

        // Returns element at index
        System.out.println("Element at index 3 : "
                + vc.elementAt(3));

        // Fetches element
        System.out.println("Get index 2 : "
                + vc.get(2));


        // =====================================
        // 🔹 SEARCH METHODS
        // =====================================

        // Checks if element exists
        System.out.println("\nContains 'Omkar'? : "
                + vc.contains("Omkar"));

        // Returns first occurrence index
        System.out.println("Index of Omkar : "
                + vc.indexOf("Omkar"));

        // Adding duplicate element
        vc.add("Omkar");

        // Returns last occurrence index
        System.out.println("Last Index of Omkar : "
                + vc.lastIndexOf("Omkar"));

        System.out.println("\nVector : " + vc);


        // =====================================
        // 🔹 UPDATE METHODS
        // =====================================

        // Updating element at index
        vc.set(1, "Rahul");

        // Updating element using setElementAt()
        vc.setElementAt("Vikas", 2);

        System.out.println("\nAfter Updating:");
        System.out.println(vc);


        // =====================================
        // 🔹 REMOVE METHODS
        // =====================================

        // Removes specific element
        vc.removeElement("Omkar");

        // Removes element at index
        vc.remove(3);

        // Removes element at index
        vc.removeElementAt(0);

        System.out.println("\nAfter Removing:");
        System.out.println(vc);


        // =====================================
        // 🔹 clone()
        // =====================================

        // Creating duplicate copy
        Vector<String> copy =
                (Vector<String>) vc.clone();

        System.out.println("\nCloned Vector:");
        System.out.println(copy);


        // =====================================
        // 🔹 CAPACITY METHODS
        // =====================================

        // Ensures minimum capacity
        vc.ensureCapacity(20);

        System.out.println("\nCapacity after ensureCapacity(20): "
                + vc.capacity());

        // Reduces capacity to current size
        vc.trimToSize();

        System.out.println("Capacity after trimToSize(): "
                + vc.capacity());


        // =====================================
        // 🔹 ENUMERATION
        // =====================================

        System.out.println("\nUsing Enumeration:");

        // Creating Enumeration object
        Enumeration<String> en = vc.elements();

        // Traversing Vector
        while (en.hasMoreElements()) {

            System.out.println(en.nextElement());
        }


        // =====================================
        // 🔹 clear()
        // =====================================

        // Removes all elements
        vc.clear();


        // =====================================
        // 🔹 isEmpty()
        // =====================================

        System.out.println("\nAfter clear():");

        // Checks again if Vector is empty
        System.out.println("Is Vector Empty? : "
                + vc.isEmpty());

        // Printing empty Vector
        System.out.println(vc);
    }
}