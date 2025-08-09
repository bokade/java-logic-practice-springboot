package JavaLogicBuilding.logic;

import java.util.*;

public class AllSubsetsBitmask {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;

        System.out.println("All Subsets:");
        for (int mask = 0; mask < (1 << n); mask++) { // 2^n combinations
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) != 0) { // if jth bit is set
                    subset.add(arr[j]);
                }
            }
            System.out.println(subset);
        }
    }
}
