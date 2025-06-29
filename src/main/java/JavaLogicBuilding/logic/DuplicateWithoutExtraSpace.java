package JavaLogicBuilding.logic;

import java.util.Arrays;

public class DuplicateWithoutExtraSpace {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 4, 1, 3};

        Arrays.sort(arr); // O(n log n)

        System.out.print("Duplicate elements: ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
