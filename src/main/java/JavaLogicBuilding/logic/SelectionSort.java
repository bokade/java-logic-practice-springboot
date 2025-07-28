package JavaLogicBuilding.logic;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted array (Ascending): " + Arrays.toString(arr));
    }

    // Selection sort logic
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Move the boundary of unsorted subarray one by one
        for (int i = 0; i < n - 1; i++) {
            // Find the index of minimum element in unsorted array
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}

