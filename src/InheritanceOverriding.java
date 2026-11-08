class Vehicle
{
    public void start()
    {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("Car starts with a key");
    }
}

public class InheritanceOverriding
{
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle();
        v.start();

        Car c = new Car();
        c.start();
    }
}