package functionMethods;

public class BinnaryToDecimal {

    // Method to convert Binary → Decimal
    public static void bintodeci(int binnum) {

        // Edge case: if input is 0
        if (binnum == 0) {
            System.out.println("The Decimal form of 0: 0");
            return;
        }

        int originalNum = binnum;
        int pow = 0;
        int decimal = 0;

        while (binnum > 0) {
            int lastDigit = binnum % 10;

            // Edge case: invalid binary digit
            if (lastDigit != 0 && lastDigit != 1) {
                System.out.println("Invalid binary number: " + originalNum);
                return;
            }

            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binnum = binnum / 10;
        }

        System.out.println("The Decimal form of " + originalNum + ": " + decimal);
    }


    // Method to convert Decimal → Binary
    public static void decitobin(int decinum) {

        // Edge case: if input is 0
        if (decinum == 0) {
            System.out.println("The Binary form of 0: 0");
            return;
        }

        // Edge case: negative number
        if (decinum < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }

        int originalNum = decinum;
        int pow = 0;
        int binnum = 0;

        while (decinum > 0) {
            int lastDigit = decinum % 2;

            binnum = binnum + (lastDigit * (int) Math.pow(10, pow));

            pow++;
            decinum = decinum / 2;
        }

        System.out.println("The Binary form of " + originalNum + ": " + binnum);
    }


    public static void main(String[] args) {

        // Test cases
        bintodeci(101);   // Valid → 5
        bintodeci(0);     // Edge case
        bintodeci(123);   // Invalid binary

        decitobin(8);     // Valid → 1000
        decitobin(0);     // Edge case
        decitobin(-5);    // Negative case
    }
}