package Oops.Polymorphism;

/*
 * Definition:
 * Method Overloading is a feature of polymorphism in Java where multiple methods
 * have the same name but differ in parameters (type, number, or order).
 * It allows a class to perform different tasks with the same method name.
 */

public class OverLoadingEx {
    
    // Method to add two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method to add two float values
    public static float sum(float a, float b) {
        return a + b;
    }

    // Method to add one float and one integer
    public static float sum(float a, int b) {
        return a + b;
    }

    // Method to concatenate a String and an integer
    // Here '+' acts as a concatenation operator
    public static String sum(String a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        // Calls sum(int, int)
        System.out.println(sum(2, 6));
        
        // Calls sum(float, float)
        System.out.println(sum(1.8f, 6.2f));
        
        // Calls sum(float, int)
        System.out.println(sum(1.8f, 6));
        
        // Calls sum(String, int)
        System.out.println(sum("Ankit", 6));
    }
}