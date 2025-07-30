package JavaLogicBuilding.logic;

public class QuickSort {

    // Main quickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort left and right subarrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function using Lomuto partition scheme
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int i = low - 1; // Pointer for smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }

        // Swap pivot to correct position
        swap(arr, i + 1, high);
        return i + 1; // Return pivot index
    }

    // Utility function to swap elements
    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };

        System.out.println("Original Array: ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array using Quick Sort:");
        printArray(arr);
    }

    // Utility function to print array
    private static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}

