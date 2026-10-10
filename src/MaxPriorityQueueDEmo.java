import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueueDEmo
{
    public static void main(String[] args)
    {
        //Option 1: reverseOrder
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

        //Option 2: comparator (Same result)
        //PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        maxPQ.add(10);
        maxPQ.add(50);
        maxPQ.add(20);

        System.out.println(maxPQ.peek());       //50
        System.out.println(maxPQ.poll());       //50
        System.out.println(maxPQ.poll());       //20
    }
}
