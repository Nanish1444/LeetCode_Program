// Node class to represent each element in the list
class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Singly Linked List class
class LinkedList {
    Node head;

    // Constructor to create an empty list
    public LinkedList() {
        this.head = null;
    }

    // Insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the list is empty, set the head to the new node
        if (head == null) {
            head = newNode;
        } else {
            // Traverse to the last node and link it to the new node
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Insert a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert a new node at a specific position in the list
    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
            if (temp == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete a node from the list by value
    public void delete(int data) {
        if (head == null) {
            return;
        }

        // If the head is the node to be deleted
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Get the size of the list
    public int size() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Inserting elements
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Displaying the list
        System.out.println("Linked List:");
        list.display();

        // Inserting at the beginning
        list.insertAtBeginning(5);
        System.out.println("After inserting at the beginning:");
        list.display();

        // Inserting at a specific position
        list.insertAt(2, 15);
        System.out.println("After inserting at index 2:");
        list.display();

        // Deleting a node
        list.delete(20);
        System.out.println("After deleting 20:");
        list.display();

        // Displaying size
        System.out.println("Size of the list: " + list.size());
    }
}
