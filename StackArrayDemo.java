class StackArray {
    private int[] stack;
    private int top, size;

    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    void display() {
        System.out.print("Stack (Array): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class StackArrayDemo {
    public static void main(String[] args) {
        StackArray s = new StackArray(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        System.out.println("Popped: " + s.pop());
        s.display();
    }
}
