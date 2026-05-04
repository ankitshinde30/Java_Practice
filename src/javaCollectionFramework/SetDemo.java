package javaCollectionFramework;

import java.util.*;

/*
    ============================================
    🔹 DEFINITION & CONCEPTS
    ============================================

    1) Set Interface:
       - Part of Java Collection Framework.
       - Does NOT allow duplicate elements.
       - Stores unique values only.

    2) HashSet:
       - Does NOT maintain insertion order.
       - Allows one null value.
       - Faster performance (uses hashing).

    3) LinkedHashSet:
       - Maintains insertion order.
       - Allows one null value.
       - Slightly slower than HashSet.

    4) TreeSet:
       - Stores elements in sorted order (ascending by default).
       - Does NOT allow null values.
       - Uses Tree structure (Red-Black Tree).

    ============================================
    🔹 DIFFERENCE SUMMARY
    ============================================

    HashSet        → Unordered, allows null
    LinkedHashSet  → Ordered (insertion), allows null
    TreeSet        → Sorted, does NOT allow null

*/

public class SetDemo {

    public static void main(String[] args) {
        
        // =========================
        // 🔹 HashSet Example
        // =========================
        
        HashSet<String> hs = new HashSet<String>();
        
        // Adding elements (no order guarantee)
        hs.add("Apple");
        hs.add("100");
        hs.add("Kiwi");
        hs.add(null); // Allowed
        hs.add("Jack Fruit");
        
        // Printing HashSet (unordered output)
        System.out.println(hs);
        
        
        // =========================
        // 🔹 LinkedHashSet Example
        // =========================
        
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        
        // Adding elements (insertion order maintained)
        lhs.add("Apple");
        lhs.add("100");
        lhs.add("Kiwi");
        lhs.add(null); // Allowed
        lhs.add("Jack Fruit");
        
        // Printing LinkedHashSet (ordered output)
        System.out.println(lhs);
        
        
        // =========================
        // 🔹 TreeSet Example
        // =========================
        
        TreeSet<String> ts = new TreeSet<String>();
        
        // Adding elements (sorted automatically)
        ts.add("Apple");
        ts.add("100");
        ts.add("Kiwi");
        ts.add("Jack Fruit");
        // ts.add(null); ❌ Not allowed → throws NullPointerException
        
        // Printing TreeSet (sorted order)
        System.out.println(ts);
        
    }
}