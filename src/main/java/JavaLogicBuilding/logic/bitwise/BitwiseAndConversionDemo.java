package JavaLogicBuilding.logic.bitwise;

import java.util.Scanner;

public class BitwiseAndConversionDemo {

    static String toBinary(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num & 1);
            num >>>= 1;
        }
        return sb.reverse().toString();
    }

    static String toOctal(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num & 7);
            num >>>= 3;
        }
        return sb.reverse().toString();
    }

    static String toHex(int num) {
        if (num == 0) return "0";
        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(hex[num & 0xf]);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }

    static String twosComplement(int num) {
        String binary = String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');
        return binary;
    }

    static void showBitwiseOperations(int a, int b) {
        System.out.println("\n=== Bitwise Operations ===");
        System.out.println("a = " + a + " (" + toBinary(a) + ")");
        System.out.println("b = " + b + " (" + toBinary(b) + ")");

        System.out.println("a & b  = " + (a & b) + " (" + toBinary(a & b) + ")");
        System.out.println("a | b  = " + (a | b) + " (" + toBinary(a | b) + ")");
        System.out.println("a ^ b  = " + (a ^ b) + " (" + toBinary(a ^ b) + ")");
        System.out.println("~a     = " + (~a) + " (" + toBinary(~a) + ")");
        System.out.println("a << 2 = " + (a << 2) + " (" + toBinary(a << 2) + ")");
        System.out.println("a >> 2 = " + (a >> 2) + " (" + toBinary(a >> 2) + ")");
        System.out.println("a >>> 2= " + (a >>> 2) + " (" + toBinary(a >>> 2) + ")");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Bitwise & Number System Conversion Demo =====");
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        System.out.println("\nDecimal: " + num);
        System.out.println("Binary : " + toBinary(num));
        System.out.println("Octal  : " + toOctal(num));
        System.out.println("Hex    : " + toHex(num));

        System.out.println("\n32-bit Binary (Two's Complement):");
        System.out.println(twosComplement(num));

        System.out.print("\nEnter another integer for bitwise comparison: ");
        int num2 = sc.nextInt();

        showBitwiseOperations(num, num2);
    }
}

