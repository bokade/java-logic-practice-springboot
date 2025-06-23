package JavaLogicBuilding.logic;

public class MoveZeros {

    // Function to move all zeros to the end without using extra space
    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0; // This will track the position to place the next non-zero element

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap only if needed (optimization)
                if (i != nonZeroIndex) {
                    int temp = arr[i];
                    arr[i] = arr[nonZeroIndex];
                    arr[nonZeroIndex] = temp;
                }
                nonZeroIndex++;
            }
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        System.out.println("Before Moving Zeros:");
        printArray(arr);

        moveZerosToEnd(arr);

        System.out.println("After Moving Zeros:");
        printArray(arr);
    }
}

