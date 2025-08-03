package JavaLogicBuilding.logic;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";


        if (isAnagram(str1, str2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }


    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}

