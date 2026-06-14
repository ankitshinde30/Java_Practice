package javaCollectionFramework;

import java.util.*;

/*
    ============================================
    🔹 DEFINITION & CONCEPTS
    ============================================

    1) TreeMap:
       - Part of Java Collection Framework.
       - Stores data in:
            Key → Value pairs

       Example:
            1 → "Ankit"

    ============================================
    🔹 IMPORTANT FEATURES OF TREEMAP
    ============================================

    ✔ Stores key-value pairs
    ✔ Keys must be unique
    ✔ Values can be duplicate
    ✔ Automatically sorts keys
    ✔ Maintains ascending order
    ❌ Does NOT allow null keys
    ✔ Allows multiple null values

    ============================================
    🔹 SORTING IN TREEMAP
    ============================================

    TreeMap stores data in:
       Ascending order of keys

    Example:

       Inserted:
          12 → Omkar
           1 → Ankit
           4 → Soham

       Output:
           1 → Ankit
           4 → Soham
          12 → Omkar

    ============================================
    🔹 INTERNAL DATA STRUCTURE
    ============================================

    TreeMap internally uses:
       Red-Black Tree

    Because of this:
       ✔ Data remains sorted
       ✔ Searching is efficient

    ============================================
    🔹 GENERICS USED
    ============================================

    TreeMap<Integer, String>

       Integer → Key type
       String  → Value type

    ============================================
    🔹 METHODS USED
    ============================================

    put()
       → Inserts key-value pair

    entrySet()
       → Returns all entries as Set

    iterator()
       → Used to traverse collection

    hasNext()
       → Checks next element

    next()
       → Returns next entry

    getKey()
       → Returns key

    getValue()
       → Returns value

    ============================================
    🔹 MAP.ENTRY
    ============================================

    Map.Entry is used to access:
       ✔ Key
       ✔ Value

    from TreeMap.

    ============================================
    🔹 WORKING FLOW
    ============================================

    Step 1:
       Create TreeMap

    Step 2:
       Insert key-value pairs

    Step 3:
       TreeMap automatically sorts keys

    Step 4:
       Convert map into entrySet()

    Step 5:
       Traverse using Iterator

    ============================================
    🔹 DIFFERENCE:
       HashMap vs LinkedHashMap vs TreeMap
    ============================================

    HashMap:
       ❌ No ordering

    LinkedHashMap:
       ✔ Maintains insertion order

    TreeMap:
       ✔ Maintains sorted order

    ============================================
    🔹 REAL-LIFE USAGE
    ============================================

    - Ranking systems
    - Dictionary applications
    - Sorted employee records
    - Banking systems
    - Student result management

*/

public class TreeMapDemo {

    public static void main(String[] args) {

        // Creating Generic TreeMap
        // Integer = Key type
        // String  = Value type
        TreeMap<Integer, String> mp =
                new TreeMap<Integer, String>();


        // =====================================
        // 🔹 ADDING KEY-VALUE PAIRS
        // =====================================

        mp.put(1, "Ankit");

        mp.put(12, "Omkar");

        mp.put(4, "Soham");

        mp.put(10, "Kaushal");

        mp.put(6, "Raunak");

        mp.put(3, "HarshVardhan");

        mp.put(9, "Abhay");


        // Printing TreeMap
        // Output will be in sorted order of keys
        System.out.println(mp);


        // =====================================
        // 🔹 entrySet()
        // =====================================

        // Converts map into Set
        Set<Map.Entry<Integer, String>> s1 =
                mp.entrySet();


        // =====================================
        // 🔹 Iterator
        // =====================================

        // Creating Iterator object
        Iterator<Map.Entry<Integer, String>> it =
                s1.iterator();


        // Traversing TreeMap
        while (it.hasNext()) {

            // Getting current entry
            Map.Entry<Integer, String> data =
                    it.next();

            // Printing key and value
            System.out.println(
                    data.getKey() + " "
                    + data.getValue()
            );
        }
    }
}