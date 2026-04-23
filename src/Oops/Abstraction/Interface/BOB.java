package Oops.Abstraction.Interface;

public class BOB implements BankInfo {
    // BOB class implementing BankInfo interface

    @Override
    public int getRateOfInterest() {
        // Providing implementation of abstract method
        return 10;
    }
}