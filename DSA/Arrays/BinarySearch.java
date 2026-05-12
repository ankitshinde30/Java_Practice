package Arrays;

/*
    ============================================
    🔹 PROGRAM: Binary Search
    ============================================

    🔹 DEFINITION:
       Binary Search is a searching algorithm used
       to find an element in a SORTED array.

    🔹 CONDITION:
       Array must be sorted before using Binary Search.

    ============================================
    🔹 WORKING PRINCIPLE
    ============================================

    Binary Search follows:
        Divide and Conquer technique

    Steps:
    1) Find middle element
    2) Compare key with middle element
    3) If key is greater:
            search in right half
    4) If key is smaller:
            search in left half
    5) Repeat until element is found

    ============================================
    🔹 EXAMPLE
    ============================================

    Array:
    [2, 4, 6, 8, 10, 12, 14, 16]

    Key = 10

    Step 1:
        mid = 8
        10 > 8 → search right side

    Step 2:
        mid = 12
        10 < 12 → search left side

    Step 3:
        mid = 10
        Key found

    ============================================
    🔹 TIME & SPACE COMPLEXITY
    ============================================

    Best Case   → O(1)
    Worst Case  → O(log n)
    Space       → O(1)

    ============================================
    🔹 REAL-LIFE USAGE
    ============================================

    - Searching in databases
    - Dictionary word search
    - Phonebook search
    - Searching in large sorted datasets

*/

class BinarySearch {

    // Method to perform binary search
    public static int binarySearch(int arr[], int key) {

        // Starting index of array
        int start = 0;

        // Ending index of array
        int end = arr.length - 1;

        // Loop continues until start <= end
        while (start <= end) {

            // Finding middle index
            int mid = start + (end - start) / 2;

            // Check if key is present at middle index
            if (arr[mid] == key) {
                return mid; // Key found
            }

            // If key is greater than middle element
            // search in right half
            if (arr[mid] < key) {
                start = mid + 1;
            }

            // Otherwise search in left half
            else {
                end = mid - 1;
            }
        }

        // If element not found
        return -1;
    }

    public static void main(String[] args) {

        // Sorted array
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};

        // Element to search
        int key = 10;

        // Calling binary search method
        int result = binarySearch(arr, key);

        // Printing result
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found");
        }
    }
}