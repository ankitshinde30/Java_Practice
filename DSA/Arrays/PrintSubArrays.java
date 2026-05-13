/*
    ============================================
    🔹 PROGRAM: Print All Subarrays with
       Maximum & Minimum Sum
    ============================================

    🔹 DEFINITION:
       A Subarray is a continuous sequence of
       elements inside an array.

    Example:
       Array = [1, 2, 3]

       Possible Subarrays:
       [1]
       [2]
       [3]
       [1,2]
       [2,3]
       [1,2,3]

    ============================================
    🔹 ADDITIONAL CONCEPTS USED
    ============================================

    1) Maximum Subarray Sum
       - Largest sum among all subarrays

    2) Minimum Subarray Sum
       - Smallest sum among all subarrays

    ============================================
    🔹 SPECIAL CONSTANTS USED
    ============================================

    Integer.MIN_VALUE
       - Smallest possible integer value
       - Used to initialize maximum sum

    Integer.MAX_VALUE
       - Largest possible integer value
       - Used to initialize minimum sum

    ============================================
    🔹 LOGIC USED
    ============================================

    This program uses 3 nested loops.

    1) Outer Loop
       - Selects starting index

    2) Middle Loop
       - Selects ending index

    3) Inner Loop
       - Prints subarray elements
       - Calculates subarray sum

    ============================================
    🔹 WORKING FLOW
    ============================================

    Example:
       Array = [1, 2, 3]

    Subarrays and Sum:
       [1]       = 1
       [1,2]     = 3
       [1,2,3]   = 6
       [2]       = 2
       [2,3]     = 5
       [3]       = 3

    Maximum Sum = 6
    Minimum Sum = 1

    ============================================
    🔹 FORMULA
    ============================================

    Total number of subarrays:
        n(n + 1) / 2

    where:
        n = number of elements

    For n = 8:
        8 × 9 / 2 = 36 subarrays

    ============================================
    🔹 TIME & SPACE COMPLEXITY
    ============================================

    Time Complexity  → O(n³)
    Space Complexity → O(1)

    ============================================
    🔹 REAL-LIFE USAGE
    ============================================

    - Stock market analysis
    - Maximum profit problems
    - Data analysis
    - Competitive programming
    - Sliding window concepts

*/

public class PrintSubArrays {
    
    // Method to print all subarrays
    public static void printSubArrays(int arr[]) {

        // Variable to count total subarrays
        int ts = 0;

        // Stores maximum subarray sum
        int maxsum = Integer.MIN_VALUE;

        // Stores minimum subarray sum
        int minsum = Integer.MAX_VALUE;

        // Outer loop selects starting index
        for (int i = 0; i < arr.length; i++) {

            int start = i;

            // Middle loop selects ending index
            for (int j = i; j < arr.length; j++) {

                int end = j;

                // Variable to store current subarray sum
                int sum = 0;

                // Inner loop prints subarray
                // and calculates sum
                for (int k = start; k <= end; k++) {

                    System.out.print(arr[k] + " ");

                    // Adding elements to sum
                    sum += arr[k];
                }

                // Printing subarray sum
                System.out.print("= " + sum);

                // Updating maximum sum
                if (sum > maxsum) {
                    maxsum = sum;
                }

                // Updating minimum sum
                if (sum < minsum) {
                    minsum = sum;
                }

                // Move to next line
                System.out.println();

                // Increasing subarray count
                ts++;
            }

            // Empty line for formatting
            System.out.println();
        }

        // Printing maximum subarray sum
        System.out.println("Maximum sum of SubArray is = " + maxsum);

        // Printing minimum subarray sum
        System.out.println("Minimum sum of SubArray is = " + minsum);

        // Printing total number of subarrays
        System.out.println("Total no of SubArrays Printed = " + ts);
    }

    public static void main(String[] args) {

        // Array declaration and initialization
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        // Calling method
        printSubArrays(arr);
    }
}