package JavaLogicBuilding.logic;

public class ReverseLinkedListRecursive {
    public static void main(String[] args) {
        // Creating LinkedList: 1 → 2 → 3 → 4 → 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original List: ");
        printList(head);

        head = reverseRecursive(head);

        System.out.print("Reversed List (Recursive): ");
        printList(head);
    }

    public static Node reverseRecursive(Node head) {
        // Base case: empty list or last node
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next); // Recurse
        head.next.next = head; // Reverse pointer
        head.next = null;      // Break original link
        return newHead;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " → ");
            head = head.next;
        }
        System.out.println("null");
    }
}