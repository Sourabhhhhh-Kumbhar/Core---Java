import java.util.LinkedList;
import java.util.Queue;

public class Demooooo
{
    public static void main(String[] args)
    {
        //Create a queue (FIFO: first in first out)
        Queue<Integer> q = new LinkedList<>();

        //Add elements at back
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue: " + q);       //[10, 20,30]
        System.out.println("Front: " + q.peek());  //10 just looks doesnt remove
        System.out.println("Removed: " + q.poll());  //10 removes from front
        System.out.println("Queue: " + q);        //[20,30]
        System.out.println("Size: " + q.size());  //2
        System.out.println("Is Empty: " + q.isEmpty());  //false
    }
}
