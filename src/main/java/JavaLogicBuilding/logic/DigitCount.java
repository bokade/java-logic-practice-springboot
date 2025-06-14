package JavaLogicBuilding.logic;

public class DigitCount {
    public static void main(String[] args) {
        int number = 123456;
        int count = 0;
        int temp = number;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Total digits in " + number + " = " + count);
    }
}
