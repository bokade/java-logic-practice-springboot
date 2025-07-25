package JavaLogicBuilding.logic;

public class ReverseLinkedListIterative {
    public static void main(String[] args) {
        // Creating LinkedList: 1 → 2 → 3 → 4 → 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original List: ");
        printList(head);

        head = reverseIterative(head);

        System.out.print("Reversed List (Iterative): ");
        printList(head);
    }

    public static Node reverseIterative(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next; // Save next
            current.next = prev;          // Reverse pointer
            prev = current;               // Move prev ahead
            current = nextNode;           // Move current ahead
        }

        return prev; // New head
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " → ");
            head = head.next;
        }
        System.out.println("null");
    }
}