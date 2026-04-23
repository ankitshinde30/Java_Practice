package Strings;

public class StringDemo {

    public static void main(String[] args) {
        String str = "Hello World Java";

        System.out.println("Length: " + str.length());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Character at index 6: " + str.charAt(6));
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Index of 'a': " + str.indexOf("a"));
        System.out.println("Last index of 'o': " + str.lastIndexOf("o"));
        System.out.println("Substring (0,5): " + str.substring(0, 5));
        System.out.println("Substring from index 8: " + str.substring(8));
        System.out.println("Replace Java with Python: " + str.replace("Java", "Python"));
        System.out.println("Replace 'a' with 't': " + str.replace('a', 't'));
        System.out.println("Trim: '" + str.trim() + "'");
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'Java': " + str.endsWith("Java"));

        // Split and print array
        String fruits = "apple,mango,banana,orange";
        String[] arr = fruits.split(",");

        System.out.println("Fruits after split:");
        for (String fruit : arr) {
            System.out.println(fruit);
        }

        // Join
        String joined = String.join("-", arr);
        System.out.println("Joined string: " + joined);

        // Number to String
        int num = 10;
        String s1 = String.valueOf(num);
        String s2 = Integer.toString(num);
        System.out.println("String.valueOf: " + s1);
        System.out.println("Integer.toString: " + s2);

        // Empty vs Blank
        String empty = "";
        String blank = " ";

        System.out.println("empty.isEmpty(): " + empty.isEmpty());
        System.out.println("blank.isEmpty(): " + blank.isEmpty());
        System.out.println("blank.isBlank(): " + blank.isBlank());

        // Concatenation
        String a = "Ankit";
        String b = "Shinde";

        String c = a + " " + b;
        String d = a.concat(" Vijay Shinde");

        System.out.println("Using + operator: " + c);
        System.out.println("Using concat(): " + d);
    }
}