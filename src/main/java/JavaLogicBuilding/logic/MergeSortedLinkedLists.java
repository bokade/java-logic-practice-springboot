package JavaLogicBuilding.logic;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeSortedLinkedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Dummy node to simplify logic
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Traverse both lists
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;  // pick from l1
                l1 = l1.next;
            } else {
                current.next = l2;  // pick from l2
                l2 = l2.next;
            }
            current = current.next;
        }

        // If any elements left in either list
        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First sorted list: 1 -> 3 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // Second sorted list: 2 -> 4 -> 6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        // Merging two lists
        ListNode merged = mergeTwoLists(l1, l2);

        System.out.print("Merged Sorted List: ");
        printList(merged);
    }
}