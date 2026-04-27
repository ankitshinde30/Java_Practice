package ExceptionHandling;

/*
 Definition:
 NumberFormatException occurs when a program tries to convert a String
 into a numeric type (like int, double, etc.) but the String does not
 contain a valid number.

 Key Features:
 1. It is a runtime exception (unchecked exception).
 2. Commonly occurs during parsing (e.g., Integer.parseInt()).
 3. Happens when the string contains non-numeric characters.
 4. Can be handled using try-catch to prevent program crash.
 5. getMessage() shows the invalid input string.
*/

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		try {
			String str = "abc";
			
			// This will throw NumberFormatException
			int num = Integer.parseInt(str);
			
		} catch (NumberFormatException e) {
			// Handling invalid number format
			System.out.println("Invalid Number Format: " + e.getMessage());
		}
	}
}