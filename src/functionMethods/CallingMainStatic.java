package functionMethods;

// Class to store student information
class StudInfo1 {
	
	// Instance variables (each object will have its own copy)
	int id;
	String name;
	
	// Static variable (shared among all objects of the class)
	static String college = "ABC College";
	
	// Static block
	// Executes only once when the class is loaded into memory
	static {
		System.out.println("This Is Static Block");
	}
	
	// Instance block
	// Executes every time an object is created (before constructor)
	{
		System.out.println("This Is Instance Block");
	}
	
	// No-argument constructor
	// Called when object is created without parameters
	StudInfo1() {
		System.out.println("This Is No-Arg Constructor");
	}
	
	// Parameterized constructor
	// Initializes object with given id and name
	StudInfo1(int id, String name) {
		this.id = id;      // Assign parameter to instance variable
		this.name = name;  // Assign parameter to instance variable
		System.out.println("This Is Parameterized Constructor");
	}
	
	// Method to display student details
	void display() {
		// Prints id, name, and shared college value
		System.out.println(id + " " + name + " " + college);
	}
}

// Main class (entry point of the program)
public class CallingMainStatic {

	public static void main(String[] args) {
		
		// Main method starts execution
		System.out.println("This Is Main method");
		
		// Creating object using no-argument constructor
		StudInfo1 s3 = new StudInfo1();
		
		// Creating first student object using parameterized constructor
		StudInfo1 s1 = new StudInfo1(1, "Ankit");
		
		System.out.println("After Main method");
		
		// Creating second student object
		StudInfo1 s2 = new StudInfo1(2, "Omkar");
		
		// Modifying static variable using one object
		// This change will reflect for all objects
		s2.college = "SMTP";
		
		// Calling display method for all objects
		s1.display(); // reflects updated college
		s2.display();
		s3.display(); // id and name default (0, null)
		
		System.out.println("after method call");
	}
}