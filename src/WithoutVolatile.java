class SharedData
{
    boolean running = true;         //Not volatile
}

public class WithoutVolatile
{
    public static void main(String[] args) throws InterruptedException {
        SharedData data = new SharedData();

        Thread t1 = new Thread(() -> {
            while(data.running)         //Keeps checking the flag
            {
                //Waiting
            }

            System.out.println("Thread Stopped!!!!");
        });

        t1.start();

        Thread.sleep(1000);         //Gives the worker time to start
        data.running = false;           //Request the worker to stop
    }
}
