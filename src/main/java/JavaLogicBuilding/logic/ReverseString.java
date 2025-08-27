package JavaLogicBuilding.logic;

public class ReverseString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);  // concatenating in reverse order
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}