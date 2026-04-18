import java.util.Scanner;

public class Armstrong {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        
        int originalNumber = num;
        int sum = 0;
        int digits = 0;
        
        // Count number of digits
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }
        
        // Reset num to original for calculation
        temp = num;
        
        // Calculate sum of digits raised to power of number of digits
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp = temp / 10;
        }
        
        // Check and display result
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong Number");
        }
        
        sc.close();
    }
}