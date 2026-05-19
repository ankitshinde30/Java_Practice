/*
    ============================================
    🔹 PROGRAM: Maximum Subarray Sum
    ============================================

    🔹 DEFINITION:
       A Subarray is a continuous sequence of
       elements inside an array.

       Maximum Subarray Sum means:
       Finding the largest sum among all possible
       subarrays.

    ============================================
    🔹 EXAMPLE
    ============================================

    Array = [1, 5, 6, 4]

    Possible Subarray Sums:
       [1]         = 1
       [1,5]       = 6
       [1,5,6]     = 12
       [5,6]       = 11
       [6,4]       = 10
       [1,5,6,4]   = 16

    Maximum Sum = 16

    ============================================
    🔹 LOGIC USED
    ============================================

    This program uses 3 nested loops.

    1) Outer Loop
       - Selects starting index

    2) Middle Loop
       - Selects ending index

    3) Inner Loop
       - Calculates sum of subarray

    ============================================
    🔹 WORKING FLOW
    ============================================

    Step 1:
       Generate all possible subarrays

    Step 2:
       Calculate sum of each subarray

    Step 3:
       Compare current sum with maximum sum

    Step 4:
       Update maximum sum if current sum is larger

    ============================================
    🔹 SPECIAL CONSTANT USED
    ============================================

    Integer.MIN_VALUE
       - Smallest integer value in Java
       - Used to initialize maxSum

    ============================================
    🔹 TIME & SPACE COMPLEXITY
    ============================================

    Time Complexity  → O(n³)
    Space Complexity → O(1)

    Because:
       - 3 nested loops are used

    ============================================
    🔹 REAL-LIFE USAGE
    ============================================

    - Stock market profit analysis
    - Sales growth analysis
    - Data analytics
    - Competitive programming
    - Financial applications

    ============================================
    🔹 IMPORTANT NOTE
    ============================================

    This is a Brute Force Approach.

    Better optimized approaches:
       ✔ Prefix Sum Method → O(n²)
       ✔ Kadane’s Algorithm → O(n)

*/

public class MaxSubArrays {

    // Method to find maximum subarray sum
    public static void maxSubarrays(int arr[]) {

        // Variable to store maximum sum
        int maxSum = Integer.MIN_VALUE;

        // Outer loop selects starting index
        for (int i = 0; i < arr.length; i++) {

            int start = i;

            // Middle loop selects ending index
            for (int j = i; j < arr.length; j++) {

                int end = j;

                // Variable to store current subarray sum
                int sum = 0;

                // Inner loop calculates subarray sum
                for (int k = start; k <= end; k++) {

                    sum += arr[k];
                }

                // Printing current subarray sum
                System.out.println(sum);

                // Updating maximum sum
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        // Printing maximum subarray sum
        System.out.println("Maximum Sum of SubArray Is = " + maxSum);
    }

    public static void main(String[] args) {

        // Array declaration and initialization
        int arr[] = {1, 5, 6, 4, 3, 7, 6};

        // Calling method
        maxSubarrays(arr);
    }
}