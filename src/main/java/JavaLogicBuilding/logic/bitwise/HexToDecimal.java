package JavaLogicBuilding.logic.bitwise;

class HexToDecimal {
    public static void main(String[] args) {
        String hex = "1a";
        int result = 0;

        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int value = 0;

            if (c >= '0' && c <= '9') value = c - '0';
            else value = 10 + (c - 'a');

            result = result * 16 + value;
        }

        System.out.println("Decimal: " + result);
    }
}
