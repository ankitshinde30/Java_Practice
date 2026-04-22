package Oops.Polymorphism;

/*
 * Definition:
 * Method Overloading is a concept in Java where multiple methods in the same class
 * have the same name but different parameters (different number, type, or order).
 * It is a type of Compile-Time Polymorphism.
 */

// Calculator class demonstrating method overloading
class Calculator {

    // Method to add two integers
    public void add(int x, int y) {
        int result = x + y;
        System.out.println("The Sum is : " + result);
    }

    // Method to add three integers
    public void add(int x, int y, int z) {
        int result = x + y + z;
        System.out.println("The Sum is : " + result);
    }

    // Method to add five integers
    public void add(int x, int y, int z, int p, int q) {
        int result = x + y + z + p + q;
        System.out.println("The Sum is : " + result);
    }

    // Method to add two float values
    public void add(float x, float y) {
        float result = x + y;
        System.out.println("The Sum is : " + result);
    }

    // Method to add one double and one float
    public void add(double x, float y) {
        double result = x + y;
        System.out.println("The Sum is : " + result);
    }
}

public class MethodOverLoading {

    public static void main(String[] args) {

        // Creating object of Calculator class
        Calculator c1 = new Calculator();

        // Calling different overloaded methods

        // Calls add(int, int)
        c1.add(2, 3);

        // Calls add(int, int, int)
        c1.add(1, 2, 3);

        // Calls add(int, int, int, int, int)
        c1.add(1, 2, 3, 4, 5);

        // Calls add(float, float)
        c1.add(2.5f, 3.5f);

        // Calls add(double, float)
        c1.add(3.0, 5.0f);
    }
}