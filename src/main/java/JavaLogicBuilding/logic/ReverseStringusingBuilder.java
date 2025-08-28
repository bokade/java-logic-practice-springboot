package JavaLogicBuilding.logic;

public class ReverseStringusingBuilder {
    public static void main(String[] args) {
        String str = "HelloWorld";

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}

