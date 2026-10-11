class Parent
{
    Parent()
    {
        System.out.println("Parent Constructor Called");
    }
}

class Child extends Parent
{
    Child()
    {
        super();
        System.out.println("Child Constructor Called");
    }
}

public class SuperConstructor
{
    public static void main(String[] args)
    {
        Child obj = new Child();
    }
}