package Strings;

public class StringBuilderEx {

    public static void main(String[] args) {

        /*
         * Definition:
         * StringBuilder is a mutable (changeable) sequence of characters.
         * It is similar to StringBuffer but NOT thread-safe.
         *
         * Key Features:
         * - Mutable (can modify content)
         * - Faster than StringBuffer
         * - Not synchronized (not safe for multithreading)
         *
         * Default capacity:
         * - 16 characters initially
         * - If exceeded → (oldCapacity * 2) + 2
         */


        // Creating StringBuilder object
        StringBuilder sb = new StringBuilder();

        // append() → adds text at the end
        sb.append("Ankit");
        System.out.println("After append: " + sb);

        // capacity() → total allocated memory
        System.out.println("Capacity: " + sb.capacity()); // default = 16


        // Adding more text
        sb.append(" Welcome to String Builder");

        // Capacity increases automatically
        System.out.println("New Capacity: " + sb.capacity());

        // Printing full string
        System.out.println("Full String: " + sb);

        // length() → number of actual characters
        System.out.println("Length: " + sb.length());


        /*
         * replace(start, end, string)
         * Replaces characters from start to end-1
         */
        System.out.println("After replace: " + sb.replace(5, 7, "Hi"));


        /*
         * delete(start, end)
         * Removes characters from start to end-1
         */
        System.out.println("After delete: " + sb.delete(5, 7));


        /*
         * substring(start, end)
         * Returns a new String (not StringBuilder)
         */
        System.out.println("Substring (2,8): " + sb.substring(2, 8));


        /*
         * insert(index, string)
         * Inserts text at specific position
         */
        System.out.println("After insert: " + sb.insert(2, "Python"));


        /*
         * ----------- EXTRA METHODS -----------
         */

        // reverse() → reverses the string
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println("Reverse: " + sb2.reverse());


        // charAt() → get character at index
        System.out.println("Character at index 2: " + sb.charAt(2));


        // setCharAt() → modify character
        sb.setCharAt(0, 'A');
        System.out.println("After setCharAt: " + sb);


        /*
         * ----------- REAL-LIFE USAGE -----------
         *
         * 1. Building dynamic strings efficiently:
         *    StringBuilder msg = new StringBuilder();
         *    msg.append("Hello ");
         *    msg.append("World");
         *
         * 2. Loop operations (important use case):
         */
        StringBuilder loopExample = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            loopExample.append(i).append(" ");
        }
        System.out.println("Loop Output: " + loopExample);


        /*
         * ----------- IMPORTANT DIFFERENCE -----------
         *
         * String → Immutable (slow for frequent changes)
         * StringBuffer → Mutable + Thread-safe (slower)
         * StringBuilder → Mutable + NOT Thread-safe (fastest)
         *
         * Use StringBuilder when:
         * - You don't need thread safety
         * - You want better performance
         */


    }
}