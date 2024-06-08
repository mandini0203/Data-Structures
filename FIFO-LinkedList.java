import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    private Queue<Integer> queue;

    public LinkedListQueue() {
        queue = new LinkedList<>();
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
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());
    }
}
   
