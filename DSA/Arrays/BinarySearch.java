package Arrays;

// Binary Search Program
class BinarySearch {

    // Method to perform binary search
    public static int binarySearch(int arr[], int key) {

        // Starting index
        int start = 0;

        // Ending index
        int end = arr.length - 1;

        // Loop continues until start becomes greater than end
        while (start <= end) {

            // Find middle index
            int mid = start + (end - start) / 2;

            // Check if key is present at mid
            if (arr[mid] == key) {
                return mid; // Key found
            }

            // If key is greater, search in right half
            if (arr[mid] < key) {
                start = mid + 1;
            }

            // Otherwise, search in left half
            else {
                end = mid - 1;
            }
        }

        // Key not found
        return -1;
    }

    public static void main(String[] args) {

        // Sorted array
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};

        // Element to search
        int key = 10;

        // Call binary search method
        int result = binarySearch(arr, key);

        // Print result
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found");
        }
    }
}