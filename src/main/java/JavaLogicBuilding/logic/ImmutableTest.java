package JavaLogicBuilding.logic;

// Immutable Class Example
final class Students {
    private final int id;
    private final String name;
    private final Address address;  // Custom mutable object

    // Constructor
    public Students(int id, String name, Address address) {
        this.id = id;
        this.name = name;

        // Defensive copy for mutable object
        this.address = new Address(address.getCity(), address.getState());
    }

    // Getters (no setters)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Return new copy instead of original reference
    public Address getAddress() {
        return new Address(address.getCity(), address.getState());
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
    }
}

// Mutable class
class Address {
    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return city + ", " + state;
    }
}

// Test Class
public class ImmutableTest {
    public static void main(String[] args) {
        Address addr = new Address("Pune", "Maharashtra");
        Students s1 = new Students(1, "Swapnil", addr);

        System.out.println("Original: " + s1);

        // Trying to modify address reference
        addr.setCity("Mumbai");
        System.out.println("After modifying original address object: " + s1);

        // Even after modification, student object will not change
        Address studentAddress = s1.getAddress();
        studentAddress.setCity("Nagpur");
        System.out.println("After modifying getter return address: " + s1);
    }
}

