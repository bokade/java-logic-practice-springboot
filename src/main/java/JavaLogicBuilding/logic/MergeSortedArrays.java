package JavaLogicBuilding.logic;

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;

        // Step 1: Compare and merge
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Step 2: Copy remaining elements of arr1
        while (i < n) {
            merged[k++] = arr1[i++];
        }

        // Step 3: Copy remaining elements of arr2
        while (j < m) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9};

        int[] result = mergeArrays(arr1, arr2);

        System.out.print("Merged Array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}

