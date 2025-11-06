package JavaLogicBuilding.logic.bitwise;

class DecimalToBinary {
    public static void main(String[] args) {
        int num = 26;
        StringBuilder sb = new StringBuilder();

        if (num == 0) {
            System.out.println("0");
            return;
        }

        while (num > 0) {
            sb.append(num % 2); // remainder (0 or 1)
            num /= 2;
        }

        System.out.println("Binary: " + sb.reverse());
    }
}

