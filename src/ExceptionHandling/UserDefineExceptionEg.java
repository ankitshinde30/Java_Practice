package ExceptionHandling;

/*
------------------------------------------------------------
DEFINITION:
This program demonstrates a USER-DEFINED EXCEPTION in Java.

A user-defined (custom) exception is created by extending an
existing exception class like RuntimeException or Exception.

In this example:
- We create a custom exception called InvalidAgeException
- It is used to handle cases where age is negative
------------------------------------------------------------
*/

// Custom Exception Class
// Extending RuntimeException makes it an UNCHECKED exception
class InvalidAgeException extends RuntimeException {
    
    /*
    Constructor of custom exception
    - Accepts an error message
    - Passes it to parent class (RuntimeException)
    */
    public InvalidAgeException(String message) {
        super(message);
    }
}

/*
------------------------------------------------------------
USAGE OF CUSTOM EXCEPTION:

We use this exception to validate age.
If age is negative, we throw InvalidAgeException.

This helps in:
- Input validation
- Creating meaningful error messages
- Handling specific business logic errors
------------------------------------------------------------
*/

// Class to perform age validation
class Check {
    
    /*
    Method: check(int age)
    - Takes age as input
    - Throws InvalidAgeException if age is invalid
    */
    public void check(int age) throws InvalidAgeException {
        
        // Condition to check if age is negative
        if (age < 0) {
            
            /*
            Throwing custom exception
            - Object of InvalidAgeException is created
            - Message is passed to constructor
            */
            throw new InvalidAgeException("Age Cannot be Negative");
        
        } else {
            // If age is valid
            System.out.println("Valid Age");
        }
    }
}

/*
------------------------------------------------------------
MAIN CLASS:
Execution starts from here
------------------------------------------------------------
*/
public class UserDefineExceptionEg {

    public static void main(String[] args) {
        
        /*
        Creating object of Check class
        */
        Check ch = new Check();
        
        /*
        try-catch block is used to handle exceptions
        */
        try {
            
            /*
            Calling method with INVALID input
            Example:
            age = -12 → this will trigger exception
            */
            ch.check(-12);
        
        } catch (InvalidAgeException e) {
            
            /*
            Catch block handles the exception
            - e.getMessage() returns the message passed
              during exception creation
            */
            System.out.println(e.getMessage());
        }
        
        /*
        ------------------------------------------------------------
        EXAMPLE OUTPUT:
        Age Cannot be Negative
        ------------------------------------------------------------
        */
    }
}

/*
------------------------------------------------------------
SUMMARY:

1. Custom exception created using "extends RuntimeException"
2. Exception thrown using "throw"
3. Exception handled using "try-catch"
4. Used for custom validation logic (like invalid age)

REAL-WORLD USAGE:
- Age validation in forms
- Bank account validation
- Login systems
- Input validation systems
------------------------------------------------------------
*/