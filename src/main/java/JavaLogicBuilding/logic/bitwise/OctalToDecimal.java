package JavaLogicBuilding.logic.bitwise;

class OctalToDecimal {
    public static void main(String[] args) {
        String octal = "32";
        int result = 0;


        for (int i = 0; i < octal.length(); i++) {
            char c = octal.charAt(octal.length() - 1 - i);
            int digit = c - '0';
            result += digit * Math.pow(8, i);
        }

        System.out.println("Decimal: " + result);
    }
}

