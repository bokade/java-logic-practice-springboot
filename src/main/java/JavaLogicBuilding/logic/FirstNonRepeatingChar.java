package JavaLogicBuilding.logic;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static Character findFirstNonRepeatingChar(String input) {
        if (input == null || input.isEmpty()) {
            return null;  // Or throw IllegalArgumentException if needed
        }

        // Step 1: Create LinkedHashMap to store char and their frequency
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Step 2: Fill the map with character counts
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Step 3: Find the first character with frequency 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // No non-repeating character found
    }

    // Driver Code
    public static void main(String[] args) {
        String str = "swiss";

        Character result = findFirstNonRepeatingChar(str);

        if (result != null) {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

