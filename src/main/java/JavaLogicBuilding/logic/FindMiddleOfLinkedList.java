package JavaLogicBuilding.logic;


public class FindMiddleOfLinkedList {
    public static void main(String[] args) {
        // Create sample LinkedList: 1 → 2 → 3 → 4 → 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        Node middle = findMiddle(head);
        System.out.println("Middle Element is: " + middle.data);
    }

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        // Fast moves 2 steps, Slow moves 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // When fast reaches end, slow is in middle
        return slow;
    }
}
