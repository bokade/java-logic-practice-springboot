package JavaLogicBuilding.logic;

public class ReverseStringRecursion {

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;  // base case
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverse(str));

    }

}
