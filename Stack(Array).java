public class StackArray {
    private int[] stack;
    private int top;
    private int capacity;

    public StackArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(25);
        stack.push(35);
        stack.push(45);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + (stack.top + 1));

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Stack is empty: " + stack.isEmpty());
    }
}
