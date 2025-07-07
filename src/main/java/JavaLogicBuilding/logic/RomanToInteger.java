package JavaLogicBuilding.logic;

import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;

        // Step 1: Create a map of Roman numerals
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Step 2: Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = map.get(s.charAt(i));

            // Subtraction case
            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue;
            }

            // Update previous value
            prevValue = currValue;
        }

        return total;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = { "III", "IV", "IX", "LVIII", "MCMXCIV" };

        for (String roman : testCases) {
            int result = romanToInt(roman);
            System.out.println("Roman: " + roman + " => Integer: " + result);
        }
    }
}

