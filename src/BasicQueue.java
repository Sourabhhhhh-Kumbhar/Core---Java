public class BasicQueue
{
    int[] queue;
    int front;
    int rear;
    int size;

    BasicQueue(int size)
    {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    //EnQueue
    void enqueue(int value)
    {
        if(rear == size - 1)
        {
            System.out.println("Queue is full");
        }
        else {
            rear++;
            queue[rear] = value;
            System.out.println(value + "Inserted");
        }
    }

    //Dequeue
    void dequeue(int value)
    {
        if(front > rear)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println(queue[front] + "removed");
            front++;
        }
    }

    //Display
    void display()
    {
        if(front > rear)
        {
            System.out.println("Queue is empty");
        }
        else {
            for(int i = front; i <= rear; i++)
            {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args)
    {
        BasicQueue obj = new BasicQueue(5);

        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);

        obj.display();

        obj.display();

        obj.display();
    }
}
