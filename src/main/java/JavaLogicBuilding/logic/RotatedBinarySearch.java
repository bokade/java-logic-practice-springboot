package JavaLogicBuilding.logic;

public class RotatedBinarySearch {

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Found target
            if (nums[mid] == target) return mid;

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;  // search left
                } else {
                    left = mid + 1;   // search right
                }
            }
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;   // search right
                } else {
                    right = mid - 1;  // search left
                }
            }
        }

        return -1;  // Not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = search(arr, target);

        if (index != -1)
            System.out.println("Found at index: " + index);
        else
            System.out.println("Not found in array.");
    }
}

