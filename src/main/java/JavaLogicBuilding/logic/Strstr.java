package JavaLogicBuilding.logic;

public class Strstr {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0;

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));  // Output: 2
        System.out.println(strStr("abcdef", "def")); // Output: 3
        System.out.println(strStr("aaaaa", "bba"));  // Output: -1
        System.out.println(strStr("a", ""));         // Output: 0
    }
}
