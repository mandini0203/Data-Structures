import java.util.LinkedList;
import java.util.Queue;

public class DequeUsingTwoQueues {
    private Queue<Integer> frontQueue;
    private Queue<Integer> rearQueue;

    public DequeUsingTwoQueues() {
        frontQueue = new LinkedList<>();
        rearQueue = new LinkedList<>();
    }


    public void addFirst(int item) {
        frontQueue.add(item);
        balanceQueues();
    }
    public void addLast(int item) {
        rearQueue.add(item);
        balanceQueues();
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Deque underflow");
        }
        if (frontQueue.isEmpty()) {
            moveHalfToFrontQueue();
        }
        return frontQueue.remove();
    }

    public int removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Deque underflow");
        }
        if (rearQueue.isEmpty()) {
            moveHalfToRearQueue();
        }
        return rearQueue.remove();
    }

    public int peekFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        if (frontQueue.isEmpty()) {
            moveHalfToFrontQueue();
        }
        return frontQueue.peek();
    }

    public int peekLast() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        if (rearQueue.isEmpty()) {
            moveHalfToRearQueue();
        }
        return rearQueue.peek();
    }

    public boolean isEmpty() {
        return frontQueue.isEmpty() && rearQueue.isEmpty();
    }

    private void balanceQueues() {
        while (frontQueue.size() > rearQueue.size() + 1) {
            rearQueue.add(frontQueue.remove());
        }
        while (rearQueue.size() > frontQueue.size()) {
            frontQueue.add(rearQueue.remove());
        }
    }

    private void moveHalfToFrontQueue() {
        int size = rearQueue.size() / 2;
        for (int i = 0; i < size; i++) {
            frontQueue.add(rearQueue.remove());
        }
    }

    private void moveHalfToRearQueue() {
        int size = frontQueue.size() / 2;
        for (int i = 0; i < size; i++) {
            rearQueue.add(frontQueue.remove());
        }
    }

    public static void main(String[] args) {
        DequeUsingTwoQueues deque = new DequeUsingTwoQueues();
        deque.addFirst(15);
        deque.addLast(30);
        deque.addFirst(7);
        deque.addLast(55);

        System.out.println("Front element: " + deque.peekFirst());  // Should print 15
        System.out.println("Rear element: " + deque.peekLast());    // Should print 30
        System.out.println();

        System.out.println("Removed from front: " + deque.removeFirst());  // Should print 15
        System.out.println("Removed from rear: " + deque.removeLast());    // Should print 30
        System.out.println();

        System.out.println("Front element: " + deque.peekFirst());  // Should print 7
        System.out.println("Rear element: " + deque.peekLast());    // Should print 55
        System.out.println();

        System.out.println("Is deque empty? " + deque.isEmpty());   // Should print false
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Is deque empty? " + deque.isEmpty());   // Should print true
    }
}
