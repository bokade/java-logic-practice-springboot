package JavaLogicBuilding.logic;

public class StringCompression {

    public static String compressString(String input) {
        if (input == null || input.length() == 0) return "";

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            // Compare current and previous character
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                // Append previous character and count
                compressed.append(input.charAt(i - 1));
                compressed.append(count);
                count = 1; // reset count for new character
            }
        }

        // Append the last character and its count
        compressed.append(input.charAt(input.length() - 1));
        compressed.append(count);

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String result = compressString(input);
        System.out.println("Compressed String: " + result);  // Output: a2b1c5a3
    }
}

