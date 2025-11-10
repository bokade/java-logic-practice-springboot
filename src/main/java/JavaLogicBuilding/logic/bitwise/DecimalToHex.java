package JavaLogicBuilding.logic.bitwise;

class DecimalToHex {
    public static void main(String[] args) {
        int num = 26;
        if (num == 0) {
            System.out.println("0");
            return;
        }

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            int hexDigit = num & 0xf; // last 4 bits
            sb.append(hex[hexDigit]);
            num >>>= 4;
        }

        System.out.println("Hexadecimal: " + sb.reverse());
    }
}

