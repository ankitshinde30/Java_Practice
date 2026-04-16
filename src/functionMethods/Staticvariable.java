package functionMethods;

public class Staticvariable {
    
    // Static variable: shared among all objects of the class
    static int count = 0; 
    
    // If this were an instance variable, each object would have its own copy
    // int count = 0; 
    
    // Constructor: runs every time an object is created
    public Staticvariable() {
        count++; // increment shared count whenever a new object is created
    }

    // Method to display the value of count
    void display() {
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        
        // Creating first object
        Staticvariable s1 = new Staticvariable();
        s1.display(); // Output: 1
        
        // Creating second object
        Staticvariable s2 = new Staticvariable();
        s2.display(); // Output: 2
        
        // Creating third object
        Staticvariable s3 = new Staticvariable();
        s3.display(); // Output: 3
    }
}