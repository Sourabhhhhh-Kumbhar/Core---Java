import java.util.*;

public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);

        System.out.println(pq.peek());      //5 (Smallest, Not Removed)
        System.out.println(pq.poll());      //5 (Removed)
        System.out.println(pq.poll());      //10
        System.out.println(pq.size());      //2

    }
}
