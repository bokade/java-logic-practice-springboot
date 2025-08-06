package JavaLogicBuilding.logic;

import java.util.*;

public class FloorCeilInSortedArray {

    // Function to find floor
    public static int findFloor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int floor = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return arr[mid]; // exact match
            } else if (arr[mid] < target) {
                floor = arr[mid]; // potential floor
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return floor;
    }

    // Function to find ceil
    public static int findCeil(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ceil = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return arr[mid]; // exact match
            } else if (arr[mid] > target) {
                ceil = arr[mid]; // potential ceil
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ceil;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 9;

        int floor = findFloor(arr, target);
        int ceil = findCeil(arr, target);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);
        System.out.println("Floor: " + (floor != -1 ? floor : "Not found"));
        System.out.println("Ceil: " + (ceil != -1 ? ceil : "Not found"));
    }
}
