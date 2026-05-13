/*
    ============================================
    🔹 PROGRAM: Print All Subarrays
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
    🔹 LOGIC USED
    ============================================

    This program uses 3 nested loops.

    1) Outer Loop:
       - Selects starting index

    2) Middle Loop:
       - Selects ending index

    3) Inner Loop:
       - Prints elements from start to end

    ============================================
    🔹 WORKING FLOW
    ============================================

    Array = [1, 2, 3]

    i = 0
        j = 0 → [1]
        j = 1 → [1 2]
        j = 2 → [1 2 3]

    i = 1
        j = 1 → [2]
        j = 2 → [2 3]

    i = 2
        j = 2 → [3]

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

    - Maximum subarray sum problems
    - Sliding window algorithms
    - Competitive programming
    - Data analysis problems

*/

public class PrintSubArrays {
    
    // Method to print all subarrays
    public static void printSubArrays(int arr[]) {

        // Variable to count total subarrays
        int ts = 0;

        // Outer loop selects starting index
        for (int i = 0; i < arr.length; i++) {

            int start = i;

            // Middle loop selects ending index
            for (int j = i; j < arr.length; j++) {

                int end = j;

                // Inner loop prints subarray
                for (int k = start; k <= end; k++) {

                    System.out.print(arr[k] + " ");
                }

                // Move to next line after printing one subarray
                System.out.println();

                // Increasing subarray count
                ts++;
            }

            // Empty line for better formatting
            System.out.println();
        }

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