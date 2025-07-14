package JavaLogicBuilding.logic;

import java.util.Stack;

public class QueueUsingTwoStacks {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue operation
    public void enqueue(int data) {
        s1.push(data);
    }

    // Dequeue operation
    public int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    // Print queue
    public void printQueue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Stack<Integer> temp = new Stack<>();
        while (!s2.isEmpty()) {
            temp.push(s2.pop());
        }
        for (int val : temp) {
            System.out.print(val + " ");
        }
        for (int i = 0; i < s1.size(); i++) {
            System.out.print(s1.get(i) + " ");
        }
        System.out.println();

        while (!temp.isEmpty()) {
            s2.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks q = new QueueUsingTwoStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.printQueue(); // Output: 10 20 30

        System.out.println("Dequeued: " + q.dequeue()); // Output: 10
        q.printQueue(); // Output: 20 30

        q.enqueue(40);
        q.printQueue(); // Output: 20 30 40
    }
}

