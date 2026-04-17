package functionMethods;

// Class to demonstrate static method and static variable
public class StaticMethodEx {
	
	// Static variable (shared across all method calls)
	static int count = 0;
	
	// Static method (can be called without creating object)
	static void display() {
		
		// Increment count each time method is called
		count++;
		
		// Print updated count value
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		// Calling static method multiple times
		// No object creation required
		display(); // Output: 1
		display(); // Output: 2
		display(); // Output: 3
		display(); // Output: 4
		display(); // Output: 5
		display(); // Output: 6
	}
}