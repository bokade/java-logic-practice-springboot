package JavaLogicBuilding.logic;

import java.util.Arrays;


public class BinarySearch {

    //  Iterative Binary Search
    public static int binarySearch(int[] arr, int target) {
        // Edge case: null or empty array
        if (arr == null || arr.length == 0) return -1;

        // Optional: If array is not sorted, sort it (uncomment if needed)
        // Arrays.sort(arr);

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            // Prevent integer overflow
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;  // Found
            else if (arr[mid] < target)
                low = mid + 1;  // Search in right half
            else
                high = mid - 1;  // Search in left half
        }

        return -1;  // Not found
    }

    //  Recursive Binary Search
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        // Base case
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            return binarySearchRecursive(arr, target, mid + 1, high);
        else
            return binarySearchRecursive(arr, target, low, mid - 1);
    }

    //  Main Method to Test
    public static void main(String[] args) {
        int[] arr = {23, 2, 16, 5, 8, 12};
        int target = 16;

        // Ensure array is sorted before binary search
        Arrays.sort(arr); // [2, 5, 8, 12, 16, 23]
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Test Iterative Version
        int iterativeResult = binarySearch(arr, target);
        if (iterativeResult != -1)
            System.out.println("Iterative: Element found at index: " + iterativeResult);
        else
            System.out.println("Iterative: Element not found");

        // Test Recursive Version
        int recursiveResult = binarySearchRecursive(arr, target, 0, arr.length - 1);
        if (recursiveResult != -1)
            System.out.println("Recursive: Element found at index: " + recursiveResult);
        else
            System.out.println("Recursive: Element not found");
    }
}
