package JavaLogicBuilding.logic;

public class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public StackUsingArray(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; // stack is empty
    }

    // Push operation
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + data);
            return;
        }
        stack[++top] = data;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        return stack[top--];
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // isEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    // isFull
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Print stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack(); // Output: 10 20 30

        System.out.println("Top element is: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop()); // 30
        stack.printStack(); // Output: 10 20

        System.out.println("Is Empty? " + stack.isEmpty()); // false
    }
}

