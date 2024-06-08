import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeQueue {
    private Queue<Integer> queue;

    public ArrayDequeQueue() {
        queue = new ArrayDeque<>();
    }

    public void enqueue(int item) {
        queue.add(item);
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Queue underflow");
        }
        return queue.remove();
    }

    public int peek() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        ArrayDequeQueue queue = new ArrayDequeQueue();
        queue.enqueue(50);
        queue.enqueue(15);
        queue.enqueue(70);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());
    }
}



       
