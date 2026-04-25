package Strings;

public class StringBufferEx {

    public static void main(String[] args) {

        /*
         * Definition:
         * StringBuffer is a mutable (changeable) sequence of characters.
         * Unlike String, its content can be modified without creating new objects.
         *
         * Key Features:
         * - Mutable (modifiable)
         * - Thread-safe (synchronized)
         * - Better performance than String when modifying frequently
         *
         * Default capacity:
         * - 16 characters initially
         * - When exceeded → (oldCapacity * 2) + 2
         */

        // Creating empty StringBuffer
        StringBuffer sb = new StringBuffer();

        // append() → adds text at the end
        sb.append("Ankit");
        System.out.println("After append: " + sb);

        // capacity() → total storage allocated
        System.out.println("Capacity: " + sb.capacity()); // default = 16

        // Adding more text
        sb.append(" Welcome to String Buffer");

        // Capacity increases automatically when exceeded
        System.out.println("New Capacity: " + sb.capacity());

        // Printing full string
        System.out.println("Full String: " + sb);

        // length() → actual number of characters
        System.out.println("Length: " + sb.length());


        /*
         * replace(start, end, string)
         * Replaces characters from start index to end-1
         */
        System.out.println("After replace: " + sb.replace(5, 7, "Hi"));


        /*
         * delete(start, end)
         * Removes characters from start index to end-1
         */
        System.out.println("After delete: " + sb.delete(5, 7));


        /*
         * substring(start, end)
         * Returns a new String (not StringBuffer)
         */
        System.out.println("Substring (2,8): " + sb.substring(2, 8));


        /*
         * insert(index, string)
         * Inserts text at specific position
         */
        System.out.println("After insert: " + sb.insert(2, "Python"));


        /*
         * ----------- EXTRA EXAMPLES -----------
         */

        // reverse() → reverses the string
        StringBuffer sb2 = new StringBuffer("Java");
        System.out.println("Reverse: " + sb2.reverse());


        // charAt() → get character at index
        System.out.println("Character at index 2: " + sb.charAt(2));


        // setCharAt() → change character at index
        sb.setCharAt(0, 'A');
        System.out.println("After setCharAt: " + sb);


        /*
         * ----------- REAL-LIFE USAGE -----------
         *
         * 1. Building large strings efficiently:
         *    StringBuffer log = new StringBuffer();
         *    log.append("Start...");
         *    log.append("Processing...");
         *
         * 2. Dynamic string modification:
         *    Editing text without creating new objects
         *
         * 3. Multithreaded environments:
         *    StringBuffer is thread-safe (unlike StringBuilder)
         */


        /*
         * IMPORTANT NOTES:
         * - String → Immutable (slow for modifications)
         * - StringBuffer → Mutable + Thread-safe
         * - StringBuilder → Mutable but NOT thread-safe (faster)
         */

    }
}