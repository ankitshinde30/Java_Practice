package Strings;

public class EscapeSequences {

    public static void main(String[] args) {

        /*
         * Definition:
         * Escape sequences are special characters in Java strings
         * that start with a backslash (\).
         * They are used to represent characters that are difficult
         * or impossible to type directly.
         */

        // \t → Tab (adds space like pressing TAB key)
        System.out.println("Hello\tWorld");
        // Output: Hello    World


        // \n → New Line (moves text to next line)
        System.out.println("Hello\nWorld");
        // Output:
        // Hello
        // World


        // \b → Backspace (removes one character before it)
        System.out.println("Hello\bWorld");
        // Output: HellWorld  (o is removed)


        // \r → Carriage Return (moves cursor to beginning of line)
        System.out.println("Hello\rWorld");
        // Output: World  (overwrites Hello)


        // \f → Form Feed (rarely used, creates page break in some systems)
        System.out.println("Hello\fWorld");
        // Output may vary depending on environment


        // \' → Single quote
        System.out.println("it\'s Java");
        // Output: it's Java


        // \" → Double quote
        System.out.println("He said \"Hi\"");
        // Output: He said "Hi"


        // \\ → Backslash
        System.out.println("Path: C:\\Java");
        // Output: Path: C:\Java


        /*
         * ----------- REAL-LIFE USAGE EXAMPLES -----------
         */


        // Multi-line message
        String message = "Welcome\nTo\nJava";
        System.out.println(message);


        // Formatting table-like output
        System.out.println("Name\tAge\tCity");
        System.out.println("Ankit\t22\tMumbai");


        // File path handling (very common in Java)
        String path = "C:\\Users\\Ankit\\Documents";
        System.out.println(path);


        /*
         * IMPORTANT NOTES:
         * - Escape sequences improve readability of output
         * - Widely used in file paths, formatted text, and printing
         * - Some like \f are rarely used in modern applications
         */

    }
}