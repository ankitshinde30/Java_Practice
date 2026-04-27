package ExceptionHandling;

/*
 Definition:
 The 'throw' keyword in Java is used to explicitly throw an exception
 when a specific condition is violated. Here, IllegalArgumentException
 is used to indicate that an invalid argument (age) is passed.

 Key Features:
 1. 'throw' is used to manually generate exceptions.
 2. IllegalArgumentException is used for invalid method arguments.
 3. Helps enforce input validation in programs.
 4. Transfers control to the nearest matching catch block.
 5. Improves code readability and correctness.
*/

public class ThrowDemoEx {
	
	public static void checkAge(int age){
		// Validation logic
		if(age < 0) {
			// Throwing exception for invalid input
			throw new IllegalArgumentException("Age Cannot Be Negative Number");
		} else {
			System.out.println("Valid Age !!");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(-5);   // Passing invalid age
			
		} catch(IllegalArgumentException e) {
			// Handling the exception
			System.out.println(e.getMessage());
		}
	}
}