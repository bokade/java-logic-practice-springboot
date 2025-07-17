package JavaLogicBuilding.logic;

import java.util.Stack;

public class BalancedParenthesesChecker {

    // Method to check balanced parentheses
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Process closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (!isMatching(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // At end, stack should be empty
    }

    // Helper method to check if pair is matching
    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    // Driver code
    public static void main(String[] args) {
        String input = "{[()]}";
        if (isBalanced(input)) {
            System.out.println(input + " → Balanced");
        } else {
            System.out.println(input + " → Not Balanced");
        }

        input = "{[(])}";
        if (isBalanced(input)) {
            System.out.println(input + " → Balanced");
        } else {
            System.out.println(input + " → Not Balanced");
        }
    }
}

