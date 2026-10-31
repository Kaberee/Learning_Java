class Stackpractice {
    int arr[];
    int top;
    int size;

    Stackpractice(int s) {
        size = s;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        // Fixed: changed "size 1" to "size - 1"
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = x;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

class Stack {
    public static void main(String[] args) {
        // Fixed: Instantiating Stackpractice instead of Stack
        Stackpractice s = new Stackpractice(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Removed: " + s.pop());
        System.out.println("Top: " + s.peek());
    }
}