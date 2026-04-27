package ExceptionHandling;

/*
 Definition:
 Exception handling in Java is a mechanism used to detect and handle runtime errors
 so that the program does not terminate abruptly and continues execution smoothly.

 Key Features:
 1. try block contains code that may cause an exception.
 2. Multiple catch blocks can be used to handle different types of exceptions.
 3. Each catch block handles a specific exception type.
 4. Prevents abnormal program termination.
 5. Provides error details using methods like getMessage().
 6. Only one exception is handled at a time (first matching catch block executes).
 7. finally block always executes whether an exception occurs or not.
*/

public class ExceptionDemo1 {

	public static void main(String[] args) {
		int num1, num2, result1, result2;
		int arr[] = {0, 0};
		
		num1 = 10;
		num2 = 0;
		
		try {
			// Risky operations
			result1 = num1 / num2;      // ArithmeticException (divide by zero)
			result2 = num1 / arr[0];    // ArithmeticException again (arr[0] = 0)
			
			System.out.println(result1);
			System.out.println(result2);
			
		} catch (ArithmeticException e) {
			// Handles divide by zero error
			System.out.println("Divide By Zero exception: " + e.getMessage());
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// Handles invalid array index access
			System.out.println("Array Index Error: " + e.getMessage());
			
		} finally {
			// This block always runs
			System.out.println("Always Execute !!");
		}
	}
}