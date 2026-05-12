/*
    ============================================
    🔹 PROGRAM: Reverse an Array
    ============================================

    🔹 DEFINITION:
       Array reversal means changing the order
       of elements from beginning to end.

       Example:
       Original Array  →  [2, 4, 6, 8]
       Reversed Array →  [8, 6, 4, 2]

    ============================================
    🔹 LOGIC USED
    ============================================

    - Use two pointers:
        first → starts from beginning
        last  → starts from end

    - Swap elements:
        arr[first] ↔ arr[last]

    - Move:
        first++
        last--

    - Continue until:
        first < last

    ============================================
    🔹 TIME & SPACE COMPLEXITY
    ============================================

    Time Complexity  → O(n)
    Space Complexity → O(1)

    ============================================
    🔹 REAL-LIFE USAGE
    ============================================

    - Reversing list/data
    - String reversal logic
    - Data processing
    - Interview coding problems

*/

class ArrayReverse {

    // Method to reverse array
    public static void reverse(int arr[]) {
        
        // first pointer starts from beginning
        int first = 0;
        
        // last pointer starts from end
        int last = arr.length - 1;

        // Loop runs until both pointers meet
        while (first < last) {
            
            // Swapping elements
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            // Move first pointer forward
            first++;

            // Move last pointer backward
            last--;
        }
    }

    public static void main(String[] args) {

        // Array declaration and initialization
        int arr[] = {2, 4, 6, 8, 10, 12, 14};

        // Calling reverse method
        reverse(arr);

        // Printing reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}