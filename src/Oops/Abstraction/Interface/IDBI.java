package Oops.Abstraction.Interface;

public class IDBI implements BankInfo {
    // IDBI class implementing BankInfo interface

    @Override
    public int getRateOfInterest() {
        // Providing implementation of abstract method
        return 12;
    }
}