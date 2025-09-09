// Linked List Implementation in Java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // 17. Display elements
    void display() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // 18. Insert operations
    void insertBeginning(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    void insertEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void insertPos(int data, int pos) {
        if (pos == 0) {
            insertBeginning(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        Node node = new Node(data);
        node.next = temp.next;
        temp.next = node;
    }

    // 19. Delete by value
    void deleteValue(int key) {
        if (head != null && head.data == key) {
            head = head.next;
            return;
        }
        Node temp = head, prev = null;
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found");
            return;
        }
        prev.next = temp.next;
    }

    // 20. Count nodes
    void countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Node count: " + count);
    }

    // 21. Search element
    void search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found: " + key);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found: " + key);
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertEnd(10);
        ll.insertEnd(20);
        ll.insertBeginning(5);
        ll.display();

        ll.insertPos(15, 2);
        ll.display();

        ll.deleteValue(10);
        ll.display();

        ll.countNodes();
        ll.search(20);
        ll.search(50);
    }
}
