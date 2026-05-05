package javaCollectionFramework;

import java.util.*;

/*
    ============================================
    🔹 DEFINITION & CONCEPTS
    ============================================

    1) Stack:
       - Part of Java Collection Framework.
       - Follows LIFO principle (Last In First Out).
       - The element added last is removed first.
       - Extends Vector class (inherits its properties).
       - Synchronized (thread-safe).

    2) Real-Life Example:
       - Stack of plates 🍽️
       - Undo/Redo operations in applications
       - Browser history (back button)

    ============================================
    🔹 METHODS USED
    ============================================

    push()     → Adds element to top of stack
    pop()      → Removes top element
    peek()     → Returns top element without removing
    isEmpty()  → Checks if stack is empty

    ============================================
    🔹 WORKING (LIFO)
    ============================================

    Example:
        push("Apple")
        push("Orange")
        push("Banana")

        Stack looks like:
        Top → Banana
               Orange
               Apple

        pop() → removes Banana

*/

public class StackExample {

    public static void main(String[] args) {
        
        // Creating Stack of String type
        Stack<String> st = new Stack<String>();
        
        // Adding elements (push operation)
        st.push("Apple");
        st.push("Orange");
        st.push("Banana");
        st.push("Grapes");
        st.push("Mango");
        
        // Printing stack
        System.out.println(st);
        
        // Removing top element
        st.pop(); // removes "Mango"
        System.out.println(st);
        
        // Viewing top element without removing
        System.out.println(st.peek()); // "Grapes"
        
        // Checking if stack is empty
        System.out.println(st.isEmpty()); // false
        
    }
}