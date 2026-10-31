class Queuepractice {
    int arr[];
    int front;
    int rear;
    int size;

    Queuepractice(int s) {
        size = s;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int x) {
        // Fixed: changed "size 1" to "size - 1"
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            arr[++rear] = x;
        }
    }

    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            int x = arr[front++];

            if (front > rear) {
                front = rear = -1;
            }

            return x;
        }
    }

    int peek() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Queue {
    public static void main(String[] args) {
        // Fixed: Instantiating Queuepractice instead of Queue
        Queuepractice q = new Queuepractice(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Front: " + q.peek());
    }
}
