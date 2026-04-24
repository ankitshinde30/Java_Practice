package Strings;

public class StringFormat {

    public static void main(String[] args) {

        /*
         * Definition:
         * String.format() is a method used to create formatted strings.
         * It works similar to printf() in C.
         * It allows you to insert values into a string using format specifiers.
         *
         * Syntax:
         * String.format("format_string", values);
         *
         * Why use it?
         * - To control output format
         * - To make strings readable and structured
         * - Useful in reports, logs, UI display, etc.
         */


        // %d → used for integer (decimal number)
        String str1 = String.format("%d", 101);
        // Example use: printing ID, age, count, etc.


        // %s → used for String (text)
        String str2 = String.format("%s", "Ankit Shinde");
        // Example use: names, messages, labels


        // %f → used for floating point (decimal numbers)
        String str3 = String.format("%f", 101.00);
        // Default prints 6 decimal places
        // Example: 101.000000


        // %x → used for hexadecimal representation
        String str4 = String.format("%x", 101);
        // Example: 101 → 65 (in hex)


        // %c → used for single character
        String str5 = String.format("%c", 'c');
        // Example use: grade, symbol, character processing


        // Printing all formatted strings
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);


        /*
         * ----------- EXTRA EXAMPLES FOR BETTER UNDERSTANDING -----------
         */


        // Multiple values in one string
        String info = String.format("Name: %s, Age: %d", "Ankit", 22);
        System.out.println(info);
        // Output: Name: Ankit, Age: 22


        // Controlling decimal precision
        String price = String.format("Price: %.2f", 99.999);
        System.out.println(price);
        // Output: Price: 100.00


        // Padding numbers (useful in formatting IDs)
        String padded = String.format("ID: %05d", 23);
        System.out.println(padded);
        // Output: ID: 00023


        // Uppercase hexadecimal
        String hexUpper = String.format("%X", 1011);
        System.out.println(hexUpper);
        // Output: 3F3 (uppercase)


        /*
         * Real-life usage examples:
         *
         * 1. Generating reports:
         *    String report = String.format("Total Sales: %.2f", total);
         *
         * 2. Logging:
         *    String log = String.format("User %s logged in at %d", username, time);
         *
         * 3. UI Display:
         *    String message = String.format("Welcome, %s!", user);
         *
         * 4. Formatting currency:
         *    String money = String.format("₹%.2f", 250.5);
         */


    }
}