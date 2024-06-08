public class StackLinkedList {
    private Node top;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public StackLinkedList() {
        top = null;
    }

    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        int item = top.data;
        top = top.next;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(60);
        stack.push(40);
        stack.push(90);

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Stack is empty: " + stack.isEmpty());
    }
}
