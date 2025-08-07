package JavaLogicBuilding.logic;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoized {

    // Recursive Fibonacci with memoization
    public static int fibonacci(int n, Map<Integer, Integer> memo) {
        // Base cases
        if (n <= 1) return n;

        // If result already computed, return from memo
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Recursive call with memoization
        int result = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        memo.put(n, result); // Store in memo

        return result;
    }

    public static void main(String[] args) {
        int n = 10; // Change n to test other values
        Map<Integer, Integer> memo = new HashMap<>();

        int fib = fibonacci(n, memo);
        System.out.println("Fibonacci of " + n + " is: " + fib);
    }
}

