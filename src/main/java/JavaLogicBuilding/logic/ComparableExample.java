package JavaLogicBuilding.logic;
import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // Natural order sorting (ascending by marks)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amit", 85));
        students.add(new Student("Ravi", 92));
        students.add(new Student("Sneha", 76));

        // Sort using Comparable (by marks ascending)
        Collections.sort(students);

        System.out.println("Sorted by marks (Comparable):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amit", 85));
        students.add(new Student("Ravi", 92));
        students.add(new Student("Sneha", 76));

        // Sort by name using Comparator
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        System.out.println("\nSorted by name (Comparator):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
