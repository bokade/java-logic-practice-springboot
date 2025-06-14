package JavaLogicBuilding.logic;

public class ArmstrongCheck {
    public static void main(String[] args) {
        int number = 153;
        int temp = number;
        int result = 0;

        while (temp != 0) {
            int digit = temp % 10;
            result += digit * digit * digit;
            temp /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }
}
