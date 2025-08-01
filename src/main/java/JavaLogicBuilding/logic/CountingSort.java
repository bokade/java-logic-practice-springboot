package JavaLogicBuilding.logic;

public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void countingSort(int[] arr) {
        int n = arr.length;

        // Step 1: Find maximum value in arr[]
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create count array
        int[] count = new int[max + 1];

        // Step 3: Count frequency of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 4: Overwrite original array using count[]
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}

