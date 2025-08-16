package JavaLogicBuilding.logic;

import java.util.*;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id, name);  // Java 7+ utility method
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Swapnil");
        Employee e2 = new Employee(101, "Swapnil");
        Employee e3 = new Employee(102, "Amit");

        // Check equality
        System.out.println("e1.equals(e2): " + e1.equals(e2)); // true
        System.out.println("e1.hashCode() == e2.hashCode(): " +
                (e1.hashCode() == e2.hashCode())); // true

        // HashSet Example
        Set<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2); // Duplicate, won't be added
        employees.add(e3);

        System.out.println("Employees in HashSet: " + employees);
    }
}
