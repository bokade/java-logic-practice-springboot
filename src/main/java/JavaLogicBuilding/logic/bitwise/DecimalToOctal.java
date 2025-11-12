package JavaLogicBuilding.logic.bitwise;

class DecimalToOctal {
    public static void main(String[] args) {
        int num = 26;
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(num % 8);
            num /= 8;
        }

        System.out.println("Octal: " + sb.reverse());
    }
}

