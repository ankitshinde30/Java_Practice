/*
    ============================================
    🔹 PROGRAM: Print All Pairs in Array
    ============================================

    🔹 DEFINITION:
       A pair means combining one element
       with another element in the array.

    Example:
       Array = [1, 2, 3]

       Pairs:
       (1,2)
       (1,3)
       (2,3)

    ============================================
    🔹 LOGIC USED
    ============================================

    - Use Nested Loops

    Outer Loop:
        Selects current element

    Inner Loop:
        Forms pair with remaining elements

    Formula for total pairs:
        n(n - 1) / 2

    where:
        n = number of elements

    ============================================
    🔹 DRY RUN
    ============================================

    Array = [1, 2, 3, 4]

    i = 0 → curr = 1
        (1,2) (1,3) (1,4)

    i = 1 → curr = 2
        (2,3) (2,4)

    i = 2 → curr = 3
        (3,4)

    ============================================
    🔹 TIME & SPACE COMPLEXITY
    ============================================

    Time Complexity  → O(n²)
    Space Complexity → O(1)

    ============================================
    🔹 REAL-LIFE USAGE
    ============================================

    - Pair matching problems
    - Team combinations
    - Graph problems
    - Interview coding questions

*/

public class PrintPairs {

    // Method to print all possible pairs
    public static void printPairs(int arr[]) {

        // Variable to count total pairs
        int tp = 0;

        // Outer loop selects current element
        for (int i = 0; i < arr.length; i++) {

            // Current element
            int curr = arr[i];

            // Inner loop forms pair with next elements
            for (int j = i + 1; j < arr.length; j++) {

                // Printing pair
                System.out.print("(" + curr + "," + arr[j] + ")");

                // Increasing pair count
                tp++;
            }

            // Move to next line after each row
            System.out.println();
        }

        // Printing total number of pairs
        System.out.println("Total numbers of pairs printed " + tp);
    }

    public static void main(String[] args) {

        // Array declaration and initialization
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        // Calling method
        printPairs(arr);
    }
}