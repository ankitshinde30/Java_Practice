package functionMethods;

public class IsPrimeRange {

    // Basic method to check if a number is prime
    public static boolean prime(int n) {

        // 2 is the smallest prime number
        if(n == 2) {
            return true;
        }

        // Loop from 2 to n-2 (checking all possible divisors)
        for(int i = 2; i < n - 1; i++) {

            // If n is divisible by any number, it's NOT prime
            if(n % i == 0) {
                return false;
            }
        }

        // If no divisors found, number is prime
        return true;
    }

    // Optimized version of prime check
    public static boolean isprime(int n) {

        // Handle smallest prime
        if(n == 2) {
            return true;
        }

        // Loop only till square root of n (optimization)
        for(int i = 2; i < Math.sqrt(n); i++) {

            // If divisible, not prime
            if(n % i == 0) {
                return false;
            }
        }

        // If no divisor found, number is prime
        return true;
    }

    // Prints all prime numbers from 2 to n
    public static void isPrimeRange(int n) {

        // Loop through all numbers from 2 to n
        for(int i = 2; i <= n; i++) {

            // Check if each number is prime
            if(isprime(i)) {

                // Print prime number
                System.out.print(i + " ");
            }
        }

        // Move to next line after printing
        System.out.println();
    }

    public static void main(String[] args) {

        // Test: check if 6 is prime
        System.out.println(isprime(6));

        // Print all primes up to 20
        isPrimeRange(20);
    }
}