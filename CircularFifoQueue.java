public class CircularFifoQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularFifoQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new RuntimeException("Queue overflow");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow");
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CircularFifoQueue queue = new CircularFifoQueue(5);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);

        System.out.println("Front element: " + queue.peek());
        System.out.println();
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println();
        System.out.println("Front element after dequeue: " + queue.peek());
    }
}
