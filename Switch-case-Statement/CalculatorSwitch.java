import java.util.Scanner;

public class CalculatorSwitch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Simple Calculator ===\n");
        
        System.out.print("Enter first number  : ");
        double a = sc.nextDouble();
        
        System.out.print("Enter second number : ");
        double b = sc.nextDouble();
        
        System.out.println("\nChoose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = sc.nextInt();
        
        System.out.println("-------------------------");
        
        switch (choice) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
                
            case 2:
                System.out.println("Result: " + (a - b));
                break;
                
            case 3:
                System.out.println("Result: " + (a * b));
                break;
                
            case 4:
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
                
            default:
                System.out.println("Invalid choice! Please enter number between 1 to 4.");
        }
        
        sc.close();
    }
}