package JavaLogicBuilding.logic;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equals(rev))
            System.out.println(str + " is a Palindrome string.");
        else
            System.out.println(str + " is NOT a Palindrome string.");
    }
}

