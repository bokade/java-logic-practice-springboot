package JavaLogicBuilding.logic;

public class MajorityElementFinder {

    // Function to find the majority element using Moore’s Voting Algorithm
    public static int findMajorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Step 1: Find a candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify if the candidate is actually the majority
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1; // No majority element
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};
        int result = findMajorityElement(arr);

        if (result != -1) {
            System.out.println("Majority Element is: " + result);
        } else {
            System.out.println("No Majority Element found.");
        }
    }
}

