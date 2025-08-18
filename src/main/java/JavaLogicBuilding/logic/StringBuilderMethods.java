package JavaLogicBuilding.logic;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append()
        sb.append(" World");
        System.out.println("append(): " + sb);

        // 2. insert()
        sb.insert(5, " Java");
        System.out.println("insert(): " + sb);

        // 3. replace()
        sb.replace(6, 10, "C++");
        System.out.println("replace(): " + sb);

        // 4. delete()
        sb.delete(6, 9);
        System.out.println("delete(): " + sb);

        // 5. reverse()
        sb.reverse();
        System.out.println("reverse(): " + sb);
        sb.reverse(); // reverse back

        // 6. capacity()
        System.out.println("capacity(): " + sb.capacity());

        // 7. ensureCapacity()
        sb.ensureCapacity(40);
        System.out.println("ensureCapacity(40): " + sb.capacity());

        // 8. charAt()
        System.out.println("charAt(2): " + sb.charAt(2));

        // 9. setCharAt()
        sb.setCharAt(2, 'x');
        System.out.println("setCharAt(2, 'x'): " + sb);

        // 10. length()
        System.out.println("length(): " + sb.length());

        // 11. substring()
        System.out.println("substring(1): " + sb.substring(1));
        System.out.println("substring(1, 5): " + sb.substring(1, 5));

        // 12. deleteCharAt()
        sb.deleteCharAt(0);
        System.out.println("deleteCharAt(0): " + sb);
    }
}

