package JavaLogicBuilding.logic;

import java.util.Scanner;

public class ReverseStringStream {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Scanner object banaya
        System.out.print("Enter a string: ");
        String str = sc.nextLine();            // User se pura line input liya

        String reversed = str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);

        sc.close();  // Scanner ko band karna best practice hai
    }
}

