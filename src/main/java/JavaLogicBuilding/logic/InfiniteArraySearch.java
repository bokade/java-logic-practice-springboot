package JavaLogicBuilding.logic;

public class InfiniteArraySearch {

    public static void main(String[] args) {
        int[] arr = new int[10000]; // simulate infinite array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; // sorted even numbers: 0, 2, 4, ...
        }

        int target = 1224;
        int resultIndex = findInInfiniteArray(arr, target);

        if (resultIndex != -1)
            System.out.println("Element found at index: " + resultIndex);
        else
            System.out.println("Element not found");
    }

    // Simulates infinite array search
    public static int findInInfiniteArray(int[] arr, int target) {
        int low = 0;
        int high = 1;

        // 1️⃣ Expand the range until arr[high] >= target
        while (high < arr.length && arr[high] < target) {
            low = high;
            high *= 2;
            if (high >= arr.length) {
                high = arr.length - 1; // prevent ArrayIndexOutOfBounds
                break;
            }
        }

        // 2️⃣ Do binary search in the found range
        return binarySearch(arr, low, high, target);
    }

    // Standard Binary Search
    public static int binarySearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}

