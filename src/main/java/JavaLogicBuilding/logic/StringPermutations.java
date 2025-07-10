package JavaLogicBuilding.logic;

import java.util.*;

public class StringPermutations {

    public static void main(String[] args) {
        String input = "abc";
        List<String> result = new ArrayList<>();

        generatePermutations("", input, result);

        System.out.println("Total Permutations: " + result.size());
        System.out.println("Permutations: " + result);
    }

    // Recursive method
    public static void generatePermutations(String prefix, String remaining, List<String> result) {
        if (remaining.length() == 0) {
            result.add(prefix); // one complete permutation
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char ch = remaining.charAt(i);
            String before = remaining.substring(0, i);
            String after = remaining.substring(i + 1);
            generatePermutations(prefix + ch, before + after, result);
        }
    }
}
