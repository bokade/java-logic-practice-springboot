package JavaLogicBuilding.logic;

import java.util.*;

public class DuplicateWithSet {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 4, 1, 3};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
