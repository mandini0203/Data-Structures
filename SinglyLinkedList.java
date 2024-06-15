class Node {
    int data; 
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head; 

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); 
        newNode.next = head; 
        head = newNode; 
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data); 
        if (head == null) { 
            head = newNode; 
            return;
        }
        Node last = head; 
        while (last.next != null) { 
            last = last.next;
        }
        last.next = newNode; 
    }

    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) { 
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(data); 
        newNode.next = prevNode.next; 
        prevNode.next = newNode; 
    }

    public void deleteNode(int key) {
        Node temp = head, prev = null; 

        if (temp != null && temp.data == key) {
            head = temp.next; 
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public void traverse() {
        Node current = head; 
        while (current != null) { 
            System.out.print(current.data + " ");
            current = current.next; 
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(14);
        list.insertAtEnd(24);
        list.insertAtEnd(34);
        list.traverse();

        list.insertAtBeginning(0);
        list.traverse();

        list.insertAfter(list.head.next, 1);
        list.traverse();

        list.deleteNode(1);
        list.traverse();
    }
}

    
        
     
