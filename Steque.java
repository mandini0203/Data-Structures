import java.util.LinkedList;

public class Steque {
    private LinkedList<Integer> list;

    public Steque() {
        list = new LinkedList<>();
    }

    public void enqueue(int item) {
        list.addLast(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Steque underflow");
        }
        return list.removeFirst();
    }

    public void push(int item) {
        list.addFirst(item);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Steque underflow");
        }
        return list.removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Steque is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        Steque steque = new Steque();
        steque.enqueue(30);
        steque.push(40);
        steque.enqueue(50);

        System.out.println("Top element: " + steque.peek());
        System.out.println();
        System.out.println("Popped element: " + steque.pop());
        System.out.println();
        System.out.println("Top element after pop: " + steque.peek());
    }
}

