package Oops.Abstraction;

/*
 * Abstraction:
 * It hides implementation details and shows only essential functionality.
 * Achieved using abstract classes and methods in Java.
 */

// Abstract class RBI
abstract class RBI {

    // Abstract method (no body) - must be implemented by child classes
    abstract int getRateofInterst();

    // Concrete method (has body)
    void show() {
        System.out.println("Hello Abstract");
    }
}

// SBI class inheriting RBI
class SBI extends RBI {

    // Providing implementation of abstract method
    @Override
    int getRateofInterst() {
        return 12;
    }
}

// ICICI class inheriting RBI
class ICICI extends RBI {

    // Providing implementation of abstract method
    @Override
    int getRateofInterst() {
        return 15;
    }
}

// Main class
public class AbstractionEx {

    public static void main(String[] args) {

        // Creating object of SBI
        SBI sb = new SBI();
        System.out.println("The rate of Interest Of SBI: " + sb.getRateofInterst());
        sb.show(); // calling concrete method

        // Creating object of ICICI
        ICICI cb = new ICICI();
        System.out.println("The rate of Interest Of ICICI: " + cb.getRateofInterst());
    }
}