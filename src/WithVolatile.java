class SharedDataa
{
    volatile boolean running = true;        //Makes updates visible
}

public class WithVolatile
{
    public static void main(String[] args) throws InterruptedException {
        SharedDataa data = new SharedDataa();

        Thread t1 = new Thread(() -> {
            while(data.running)         //Reads the shared flag
            {
                //Waiting
            }
            System.out.println("Thread Stopped!!");
        });

        t1.start();

        Thread.sleep(1000);         //Gives the worker time to start
        data.running = false;               //Updates the volatile variable
    }
}