package javaCollectionFramework;

import java.util.*;

/*
    ================================
    🔹 DEFINITION & CONCEPTS
    ================================

    1) Non-Generic Collection:
       - A collection without specifying a data type.
       - Can store heterogeneous (different types) data like String, Integer, Boolean, etc.
       - No type safety → may cause runtime errors.
       - Example: Set s1 = new HashSet();

    2) HashSet (Java Collection Framework):
       - Stores unique elements (no duplicates allowed).
       - Does not maintain insertion order.
       - Allows only one null value.
       - Uses hashing mechanism internally.

    ================================
    🔹 METHODS USED
    ================================

    add()        → Adds element to set
    remove()     → Removes element
    contains()   → Checks if element exists
    size()       → Returns number of elements
    isEmpty()    → Checks if set is empty
    retainAll()  → Keeps only common elements
    addAll()     → Adds all elements from another set
    hashCode()   → Returns hash value of set
    equals()     → Compares two sets

    ================================
    🔹 REAL-LIFE USAGE
    ================================

    - Used when storing mixed-type data temporarily
    - Example: Debugging, logging, prototype applications

    ⚠️ NOTE:
    In real-world applications, Generic Collections are preferred:
    Example: Set<String> s = new HashSet<>();

*/

public class NonGenericExample {

    public static void main(String[] args) {

        // Creating a non-generic Set (can store multiple data types)
        Set s1 = new HashSet();

        // Adding heterogeneous elements (different data types)
        s1.add("Apple");   // String
        s1.add(100);       // Integer
        s1.add(true);      // Boolean
        s1.add(5.4);       // Double
        s1.add(null);      // null (allowed only once)
        s1.add("Omkar");
        s1.add("Kaushal");

        // Printing set (unordered output)
        System.out.println(s1);

        // Removing null element
        s1.remove(null);
        System.out.println(s1);

        // Checking if "Apple" exists
        System.out.println(s1.contains("Apple")); // true/false

        // Getting size of set
        System.out.println(s1.size());

        // Checking if set is empty
        System.out.println(s1.isEmpty()); // false

        // Creating second HashSet
        HashSet s2 = new HashSet();

        // Adding elements to second set
        s2.add("Omkar");
        s2.add("Naresh");
        s2.add(200);
        s2.add(4.5);

        // retainAll(): keeps only common elements between s1 and s2
        s1.retainAll(s2);
        System.out.println(s1);

        // addAll(): adds all elements of s2 into s1
        s1.addAll(s2);
        System.out.println(s1);

        // hashCode(): returns hash value of set
        System.out.println(s1.hashCode());

        // Creating a copy of s1 into s3
        HashSet s3 = new HashSet(s1);

        // equals(): checks if both sets have same elements
        System.out.println(s1.equals(s3)); // true
    }
}