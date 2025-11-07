package JavaLogicBuilding.logic.bitwise;

class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "11010";
        int result = 0;

        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(binary.length() - 1 - i);
            if (bit == '1') {
                result += Math.pow(2, i);
            }
        }

        System.out.println("Decimal: " + result);
    }
}

