package JavaLogicBuilding.logic;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

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
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity(50): " + sb.capacity());

        // 8. charAt()
        System.out.println("charAt(1): " + sb.charAt(1));

        // 9. setCharAt()
        sb.setCharAt(1, 'a');
        System.out.println("setCharAt(1, 'a'): " + sb);

        // 10. length()
        System.out.println("length(): " + sb.length());

        // 11. substring()
        System.out.println("substring(2): " + sb.substring(2));
        System.out.println("substring(2, 6): " + sb.substring(2, 6));

        // 12. deleteCharAt()
        sb.deleteCharAt(0);
        System.out.println("deleteCharAt(0): " + sb);
    }
}

