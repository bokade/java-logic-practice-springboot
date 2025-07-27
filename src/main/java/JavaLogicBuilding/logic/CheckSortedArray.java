package JavaLogicBuilding.logic;

public class CheckSortedArray {

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }
    public static boolean isSortedDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Is array sorted? " + isSorted(arr));
        System.out.println("Is array sorted descending? " + isSortedDescending(arr));
    }

}

