import java.util.ArrayList;

public class StackArrayList {
    private ArrayList<Integer> stack;

    public StackArrayList() {
        stack = new ArrayList<>();
    }

    public void push(int item) {
        stack.add(item);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackArrayList stack = new StackArrayList();
        stack.push(15);
        stack.push(25);
        stack.push(35);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.stack.size());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Stack is empty: " + stack.isEmpty());
    }
}
