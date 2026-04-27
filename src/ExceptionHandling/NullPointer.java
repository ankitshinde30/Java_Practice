package ExceptionHandling;

/*
 Definition:
 NullPointerException occurs in Java when a program tries to use an object
 reference that has not been initialized (i.e., it is null).

 Key Features:
 1. Thrown at runtime when accessing methods or properties of a null object.
 2. Common causes include uninitialized variables and missing object creation.
 3. Can be handled using try-catch blocks.
 4. Helps prevent program crash by catching and handling the error.
 5. getMessage() may return null for NullPointerException.
*/

public class NullPointer {

	public static void main(String[] args) {
		String str = null;
		
		try {
			// This will throw NullPointerException
			System.out.println(str.length());
			
		} catch (NullPointerException e) {
			// Handling null reference error
			System.out.println("Caught NullPointerException: " + e.getMessage());
		}
	}
}