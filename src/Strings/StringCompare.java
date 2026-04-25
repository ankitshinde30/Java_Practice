package Strings;

public class StringCompare {

    public static void main(String[] args) {

        // ----------- BASIC STRING COMPARISON -----------
        String s1 = "Hello";
        String s2 = "Hello";

        // equals() compares VALUES (content of strings)
        if (s1.equals(s2)) {
            System.out.println("equals(): Both are Same");
        } else {
            System.out.println("equals(): Both are Not Same");
        }

        // == compares MEMORY LOCATION (reference)
        if (s1 == s2) {
            System.out.println("== : Both are Same (same reference)");
        } else {
            System.out.println("== : Both are Not Same");
        }

        // compareTo() compares lexicographically (dictionary order)
        // returns 0 if equal
        System.out.println("compareTo s1 vs s2: " + s1.compareTo(s2));
        System.out.println("compareTo s2 vs s1: " + s2.compareTo(s1));


        // ----------- CASE SENSITIVITY -----------
        String s3 = "Hello";
        String s4 = "HELLO";

        // Case-sensitive comparison
        if (s3.equals(s4)) {
            System.out.println("Case-sensitive equals: Same");
        } else {
            System.out.println("Case-sensitive equals: Not Same");
        }

        // Still comparing references
        if (s3 == s4) {
            System.out.println("== : Same reference");
        } else {
            System.out.println("== : Different reference");
        }

        // Case-insensitive comparison
        if (s3.equalsIgnoreCase(s4)) {
            System.out.println("equalsIgnoreCase(): Same");
        } else {
            System.out.println("equalsIgnoreCase(): Not Same");
        }

        // Lexicographical difference (based on ASCII values)
        System.out.println("compareTo s3 vs s4: " + s3.compareTo(s4));
        System.out.println("compareTo s4 vs s3: " + s4.compareTo(s3));


        // ----------- NEW KEY EXAMPLE (IMPORTANT) -----------
        // Creating strings using 'new' keyword
        String s5 = new String("Hello");
        String s6 = new String("Hello");

        // equals() still compares content
        System.out.println("\nUsing new keyword:");
        System.out.println("equals(): " + s5.equals(s6)); // true

        // == will be false because different objects in memory
        System.out.println("== : " + (s5 == s6)); // false


        // ----------- STRING INTERNING -----------
        // intern() forces string into String Pool
        String s7 = s5.intern();

        // Now s1 and s7 point to same pool object
        System.out.println("\nUsing intern():");
        System.out.println("s1 == s7 : " + (s1 == s7)); // true


        // ----------- DIFFERENT CONTENT -----------
        String a = "Apple";
        String b = "Banana";

        // compareTo gives negative if first < second
        System.out.println("\nDifferent Strings:");
        System.out.println("a.compareTo(b): " + a.compareTo(b)); // negative
        System.out.println("b.compareTo(a): " + b.compareTo(a)); // positive


        // ----------- EMPTY STRING -----------
        String empty1 = "";
        String empty2 = "";

        System.out.println("\nEmpty Strings:");
        System.out.println("equals(): " + empty1.equals(empty2)); // true
        System.out.println("== : " + (empty1 == empty2)); // true (same pool)


        // ----------- NULL SAFETY -----------
        String str = null;

        // Avoid NullPointerException by calling equals on known string
        if ("Hello".equals(str)) {
            System.out.println("Safe comparison");
        } else {
            System.out.println("Avoided NullPointerException");
        }
    }
}