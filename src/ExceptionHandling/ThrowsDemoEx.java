package ExceptionHandling;

import java.io.IOException;

/*
 Definition:
 The 'throws' keyword in Java is used in method declarations to specify
 that a method may throw one or more exceptions, and the caller must handle them.

 Key Features:
 1. Declares exceptions that a method can throw.
 2. Used for checked exceptions (like IOException).
 3. Transfers responsibility of handling exceptions to the caller.
 4. Can declare multiple exceptions separated by commas.
 5. Improves code clarity and exception handling design.
*/

public class ThrowsDemoEx {
	
	public static void leapyear(int year) throws ArithmeticException, IOException {
		if(year % 4 != 0) {
			throw new ArithmeticException("It is not a leap year");
		} else {
			System.out.println("It is Leap year");
		}
	}

	public static void main(String[] args) throws IOException {
		try {
			leapyear(2003); 
			
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}