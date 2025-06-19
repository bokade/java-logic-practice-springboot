package JavaLogicBuilding.logic;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23};
        int target = 16;

        int low = 0, high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found)
            System.out.println("Element not found");
    }
}

