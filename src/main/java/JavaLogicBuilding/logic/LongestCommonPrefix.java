package JavaLogicBuilding.logic;

public class LongestCommonPrefix {

    // Function to find LCP
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        // Take first string as reference
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Reduce prefix until it matches the beginning of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If no common prefix, return empty string
                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }

    // Test the method
    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(input));
    }
}

