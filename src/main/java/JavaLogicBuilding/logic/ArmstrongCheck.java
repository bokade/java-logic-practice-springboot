package JavaLogicBuilding.logic;

public class ArmstrongCheck {
    public static void main(String[] args) {
        int number = 9474;
        int digits = String.valueOf(number).length(); // Count digits
        int temp = number;
        int result = 0;

        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits); // Raise to power of digits
            temp /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }
}
