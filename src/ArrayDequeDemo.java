import java.util.ArrayDeque;

public class ArrayDequeDemo
{
    public static void main(String[] args)
    {
        //ArrayDeque = double-ended queue(add/remove from Both front and back)
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        //Add at the back
        dq.addLast(20);
        dq.addLast(30);

        //Add at the front
        dq.addFirst(10);
        dq.addFirst(5);

        System.out.println("Deque: " + dq);     //[5,10,20,30]

        //Look Without removing
        System.out.println("First: " + dq.peekFirst());     //First = 5
        System.out.println("Last: " + dq.peekLast());       //Last  = 30

        //Remove from front and back
        System.out.println("Removed First: " + dq.pollFirst());     //5
        System.out.println(("Removed Last: " + dq.pollLast()));     //30
        System.out.println("Deque: " + dq);                          //[10,20]

        System.out.println("Size: " + dq.size());                  //2
        System.out.println("Is Empty: " + dq.isEmpty());            //false
        System.out.println("Has 20? " + dq.contains(20));           //true

        //Use it as Queue (FIFO)
        ArrayDeque<String> queue = new ArrayDeque<>();

        queue.add("A");
        queue.add("B");
        System.out.println("Queue poll: " + queue.poll());      //A

        //Use it as a Stack (LIFO)
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("X");
        stack.push("Y");
        System.out.println("Stack pop: " + stack.pop());        //Y
    }
}