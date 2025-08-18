package JavaLogicBuilding.logic;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = " Hello Java ";
        String str2 = "Java";
        String str3 = "JAVA";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Char at index 2: " + str.charAt(2));

        // 3. substring()
        System.out.println("Substring(1,6): " + str.substring(1, 6));

        // 4. contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 5. equals() and equalsIgnoreCase()
        System.out.println("Equals: " + str2.equals(str3));
        System.out.println("EqualsIgnoreCase: " + str2.equalsIgnoreCase(str3));

        // 6. compareTo() and compareToIgnoreCase()
        System.out.println("CompareTo: " + str2.compareTo(str3));
        System.out.println("CompareToIgnoreCase: " + str2.compareToIgnoreCase(str3));

        // 7. indexOf() and lastIndexOf()
        System.out.println("IndexOf J: " + str.indexOf("J"));
        System.out.println("LastIndexOf a: " + str.lastIndexOf("a"));

        // 8. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // 9. trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 10. replace()
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));

        // 11. startsWith() and endsWith()
        System.out.println("StartsWith Hello: " + str.trim().startsWith("Hello"));
        System.out.println("EndsWith ava: " + str.trim().endsWith("ava"));

        // 12. split()
        String[] parts = str.trim().split(" ");
        System.out.println("Split words:");
        for(String s : parts){
            System.out.println(s);
        }

        // 13. isEmpty() and isBlank()
        String empty = "";
        String blank = "   ";
        System.out.println("Is empty: " + empty.isEmpty());
        System.out.println("Is blank: " + blank.isBlank());

        // 14. concat()
        System.out.println("Concat: " + str2.concat(" Programming"));

        // 15. toCharArray()
        char[] arr = str2.toCharArray();
        System.out.println("Char array:");
        for(char c : arr){
            System.out.print(c + " ");
        }
        System.out.println();

        // 16. format()
        String formatted = String.format("My name is %s and my score is %d", "Swapnil", 95);
        System.out.println("Formatted: " + formatted);

        // 17. valueOf()
        int num = 123;
        System.out.println("ValueOf int: " + String.valueOf(num));

        // 18. join()
        String joined = String.join("-", "Java", "Spring", "Boot");
        System.out.println("Joined: " + joined);

        // 19. repeat()
        System.out.println("Repeat: " + str2.repeat(3));

        // 20. intern()
        String s1 = new String("Java").intern();
        String s2 = "Java";
        System.out.println("Intern check: " + (s1 == s2));
    }
}

