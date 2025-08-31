package JavaLogicBuilding.logic;

public class ReverseStringStream {

    public static void main(String[] args) {
        String str = "HelloWorld";
        String reversed = str.chars().mapToObj(c -> (char) c).reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }

}
