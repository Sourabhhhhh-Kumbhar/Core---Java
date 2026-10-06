class Queue {
    int[] queue;
    int front;
    int rear;
    int size;

    Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    // Enqueue
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            rear++;
            queue[rear] = value;
            System.out.println(value + " inserted");
        }
    }

    // Dequeue
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(queue[front] + " removed");
            front++;
        }
    }

    // Display
    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();
    }
}