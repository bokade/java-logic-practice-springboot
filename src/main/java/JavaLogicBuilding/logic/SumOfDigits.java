package JavaLogicBuilding.logic;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits in " + number + " = " + sum);
    }
}
