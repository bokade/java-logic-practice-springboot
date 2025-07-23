package JavaLogicBuilding.logic;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing 3
        int n = arr.length + 1; // Full range is 1 to 6

        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        int missing = total - sum;
        System.out.println("Missing number is: " + missing);
    }
}

