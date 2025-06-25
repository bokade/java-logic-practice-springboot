package JavaLogicBuilding.logic;

import java.util.Arrays;

public class ArrayRotation {

    // Left Rotate an array by k positions
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k > n
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Right Rotate an array by k positions
    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    // Reverse elements in the array between start and end
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main method to test rotation
    public static void main(String[] args) {
        int[] arrayLeft = {1, 2, 3, 4, 5};
        int[] arrayRight = {1, 2, 3, 4, 5};
        int k = 2;

        leftRotate(arrayLeft, k);
        System.out.println("Left Rotation by " + k + ": " + Arrays.toString(arrayLeft));

        rightRotate(arrayRight, k);
        System.out.println("Right Rotation by " + k + ": " + Arrays.toString(arrayRight));
    }
}
