package JavaLogicBuilding.logic;


// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class with insert, delete, reverse
public class LinkedListImplementation {

    Node head;

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete by value
    public void delete(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Reverse the LinkedList
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Driver code
    public static void main(String[] args) {
        LinkedListImplementation list = new LinkedListImplementation();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        System.out.print("Original List: ");
        list.display();

        list.delete(20);
        System.out.print("After Deletion (20): ");
        list.display();

        list.reverse();
        System.out.print("After Reversing: ");
        list.display();
    }
}
