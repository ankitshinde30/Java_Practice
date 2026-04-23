package Oops.Abstraction.Interface;
// Package: organizes related files

public interface BankInfo {
    // Interface: defines rules (methods) that classes must implement

    int getRateOfInterest();
    // Abstract method: must be implemented by all classes

    default void show() {
        // Default method: already has implementation
        // Can be used directly by implementing classes
        System.out.println("Hello");
    }

    static void display() {
        // Static method: belongs to interface, called using interface name
        System.out.println("Hi");
    }
}