package JavaLogicBuilding.logic;

import java.util.HashSet;

public class ZeroSumSubarray {
    // Function to check if subarray with 0 sum exists
    public static boolean hasZeroSumSubarray(int[] arr) {
        HashSet<Integer> prefixSums = new HashSet<>();
        int sum = 0;

        for (int num : arr) {
            sum += num;

            // Check 3 cases:
            if (sum == 0 || prefixSums.contains(sum) || num == 0) {
                return true;
            }

            // Store the current prefix sum
            prefixSums.add(sum);
        }

        return false;
    }

    // Driver code to test the function
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};

        if (hasZeroSumSubarray(arr)) {
            System.out.println("Yes, subarray with 0 sum exists");
        } else {
            System.out.println("No, subarray with 0 sum does not exist");
        }
    }
}

