class NodeStack {
    int data;
    NodeStack next;
    NodeStack(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLinkedList {
    private NodeStack top;

    void push(int x) {
        NodeStack node = new NodeStack(x);
        node.next = top;
        top = node;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    void display() {
        System.out.print("Stack (Linked List): ");
        NodeStack temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackLLDemo {
    public static void main(String[] args) {
        StackLinkedList sll = new StackLinkedList();
        sll.push(5);
        sll.push(10);
        sll.push(15);
        sll.display();
        System.out.println("Popped: " + sll.pop());
        sll.display();
    }
}
