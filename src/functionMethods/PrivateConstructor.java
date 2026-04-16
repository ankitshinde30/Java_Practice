package functionMethods;

// This class implements the Singleton Design Pattern
class SingleTon {
    
    // Static reference variable to hold the single instance of the class
    private static SingleTon instance; // initially null
    
    // Instance variable
    int num1 = 100;
    
    // Private constructor prevents creating objects using 'new' keyword
    private SingleTon() {
        // Constructor is intentionally empty
    }
    
    // Public method to provide global access to the single instance
    public static SingleTon getInstance() {
        
        // Check if instance is not yet created
        if (instance == null) {
            // Create the object only once
            instance = new SingleTon();
        }
        
        // Return the same instance every time
        return instance;
    }
}


// Main class
public class PrivateConstructor {

    public static void main(String[] args) {
        
        // Accessing the Singleton object using getInstance() method
        SingleTon s1 = SingleTon.getInstance();
        
        // Printing the value of num1
        System.out.println(s1.num1);
    }
}