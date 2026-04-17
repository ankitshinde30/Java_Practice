package functionMethods;

// FINAL CLASS
// This class cannot be extended (no subclass allowed)
final class FinalShape {
	
	// Final variable (constant)
	// Value cannot be changed once assigned
	final int r = 6;
	
	// Normal method
	public void display() {
		System.out.println("Radius is: " + r);
	}
}

// BASE CLASS
class Shape {
	
	// Final method
	// Cannot be overridden in subclass
	final void show() {
		System.out.println("This is a final method");
	}
}

// CHILD CLASS
class Circle extends Shape {
	
	float pi = 3.14f;
	
	// Method to calculate area
	void area() {
		int r = 6; // local variable (allowed)
		float area = pi * r * r;
		System.out.println("Area of Circle: " + area);
	}
	
	// ❌ This would give error if uncommented
	/*
	@Override
	void show() {
		System.out.println("Trying to override final method"); // NOT ALLOWED
	}
	*/
}

// MAIN CLASS
public class FinalDemo {

	public static void main(String[] args) {
		
		// Using child class
		Circle c1 = new Circle();
		c1.area();   // calls area method
		c1.show();   // calls final method from parent
		
		// Using final class
		FinalShape fs = new FinalShape();
		fs.display();
		
		// ❌ Not allowed: cannot extend final class
		// class Test extends FinalShape {}
	}
}