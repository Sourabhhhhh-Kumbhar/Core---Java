public class FixingDeadlock {
    static final Object accountA = new Object();
    static final Object accountB = new Object();

    static void transfer(String name)
    {
        synchronized(accountA)          //Always lock A first
        {
            System.out.println(name + "locked A");

            synchronized(accountB)          //Then lock B
            {
                System.out.println(name + "locked B");
                System.out.println(name + "Completed Transfer");
            }
        }
    }

    public static void main(String[]args)
    {
        Thread t1 = new Thread(() -> transfer("Thread 1"));
        Thread t2 = new Thread(() -> transfer("Thread 2"));

        t1.start();
        t2.start();
    }
}
