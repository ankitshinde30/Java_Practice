package functionMethods; // Package declaration (organizes related classes)

// Class to store student information
class StudInfo {
	
	// Instance variables (unique for each object)
	int id;
	String name;
	
	// Static variable (shared among all objects of the class)
	static String college = "ABC College";
	
	// Constructor to initialize id and name when object is created
	StudInfo(int id, String name) {
		this.id = id;        // Assign parameter id to instance variable
		this.name = name;    // Assign parameter name to instance variable
	}
	
	// Method to display student details
	void display() {
		// Prints id, name, and shared college name
		System.out.println(id + " " + name + " " + college);
	}
}

// Main class (entry point of the program)
public class MainStatic {

	public static void main(String[] args) {
		
		// Creating first student object
		StudInfo s1 = new StudInfo(1, "Ankit");
		
		// Creating second student object
		StudInfo s2 = new StudInfo(2, "Omkar");
		
		// Calling display method for first object
		s1.display();
		
		// Calling display method for second object
		s2.display();
	}
}