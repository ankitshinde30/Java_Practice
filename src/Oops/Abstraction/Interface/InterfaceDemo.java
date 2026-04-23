package Oops.Abstraction.Interface;

public class InterfaceDemo {

    public static void main(String[] args) {
        // Entry point of the program

        IDBI db = new IDBI();
        // Creating object of IDBI class

        System.out.println("Rate of Interest IDBI: " + db.getRateOfInterest());
        // Calling implemented method

        db.show();
        // Calling default method from interface

        BankInfo.display();
        // Calling static method from interface

        BOB bb = new BOB();
        // Creating object of BOB class

        System.out.println("Rate of Interest BOB: " + bb.getRateOfInterest());
        // Calling implemented method
    }
}