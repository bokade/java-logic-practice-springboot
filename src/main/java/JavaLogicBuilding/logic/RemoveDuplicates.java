package JavaLogicBuilding.logic;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }

        System.out.println("Without duplicates: " + result);
    }
}

