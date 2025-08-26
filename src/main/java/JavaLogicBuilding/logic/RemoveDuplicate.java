package JavaLogicBuilding.logic;

import java.util.*;

public class RemoveDuplicate {
    public static void removeDuplicate(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : arr) {
            set.add(n);  // Automatically skips duplicates
        }
        System.out.println("List: " + set);
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 2, 3, 5, 4, 1};
        removeDuplicate(arr);
    }
}

