package JavaLogicBuilding.logic;

public class Factorial {
    public static void main(String[] args) {
        int num = 5; // Change as needed
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

