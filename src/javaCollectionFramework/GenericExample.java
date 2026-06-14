package javaCollectionFramework;

import java.util.*;

/*
    ============================================
    🔹 DEFINITION OF GENERICS
    ============================================

    Generics in Java allow us to specify the type
    of data that a class, interface, or collection
    can store.

    Generics provide:
       ✔ Type Safety
       ✔ Compile-Time Error Checking
       ✔ No Explicit Type Casting
       ✔ Better Readability

    Example:
       List<Integer> list = new ArrayList<>();

       Here:
       Integer is the Generic Type.

       Only Integer values can be stored.

    ============================================
    🔹 WHAT IS LIST?
    ============================================

    List is an interface in Java Collection
    Framework.

    Features:
       ✔ Maintains insertion order
       ✔ Allows duplicate elements
       ✔ Allows null values
       ✔ Supports index-based access

    ============================================
    🔹 WHAT IS ARRAYLIST?
    ============================================

    ArrayList is a class that implements
    the List interface.

    Features:
       ✔ Dynamic array
       ✔ Fast random access
       ✔ Maintains insertion order
       ✔ Allows duplicates

    ============================================
    🔹 METHODS USED
    ============================================

    add()
       → Adds element to ArrayList

    iterator()
       → Returns Iterator object

    hasNext()
       → Checks if next element exists

    next()
       → Returns next element

    ============================================
    🔹 WHAT IS ITERATOR?
    ============================================

    Iterator is an interface used to traverse
    collection elements one by one.

    Advantages:
       ✔ Easy traversal
       ✔ Works with all Collection classes
       ✔ No need to use indexes

    ============================================
    🔹 ITERATOR METHODS
    ============================================

    hasNext()
       → Returns true if next element exists

    next()
       → Returns next element and moves
         iterator to next position

    ============================================
    🔹 WORKING FLOW
    ============================================

    Step 1:
       Create Generic ArrayList

    Step 2:
       Add Integer values

    Step 3:
       Print complete list

    Step 4:
       Create Iterator object

    Step 5:
       Traverse elements using while loop

    ============================================
    🔹 OUTPUT
    ============================================

    [100, 300, 700, 400]

    Iterator
    100
    300
    700
    400

    ============================================
    🔹 TIME COMPLEXITY
    ============================================

    add()          → O(1) Average

    Iterator Loop  → O(n)

    ============================================
    🔹 REAL-LIFE USAGE
    ============================================

    - Student marks management
    - Employee ID storage
    - Banking applications
    - Product inventory systems
    - Collection data processing

*/

public class GenericExample {

    public static void main(String[] args) {

        // Creating Generic ArrayList
        // Only Integer values are allowed
        List<Integer> al = new ArrayList<>();


        // =====================================
        // 🔹 ADDING ELEMENTS
        // =====================================

        al.add(100);

        al.add(300);

        al.add(700);

        al.add(400);


        // Printing complete ArrayList
        System.out.println(al);

        System.out.println("Iterator");


        // =====================================
        // 🔹 CREATING ITERATOR
        // =====================================

        Iterator<Integer> itr = al.iterator();


        // =====================================
        // 🔹 TRAVERSING USING ITERATOR
        // =====================================

        while (itr.hasNext()) {

            // Printing next element
            System.out.println(itr.next());
        }
    }
}