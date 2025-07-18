package JavaLogicBuilding.logic;

public class KadaneAlgorithm {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];      // Overall maximum
        int currentSum = nums[0];    // Current subarray sum

        for (int i = 1; i < nums.length; i++) {
            // Either start new subarray from current element
            // or continue with previous sum
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update overall max if currentSum is bigger
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(arr));
    }
}
