package JavaLogicBuilding.logic;
import JavaLogicBuilding.logic.Node;

/*
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/

public class LinkedListLoopDetection {

    Node head;

    public boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Loop found
            }
        }
        return false; // No loop
    }

    public static void main(String[] args) {
        LinkedListLoopDetection list = new LinkedListLoopDetection();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = list.head.next; // Loop here

        if (list.detectLoop()) {
            System.out.println("Loop detected in LinkedList");
        } else {
            System.out.println("No Loop in LinkedList");
        }
    }
}
