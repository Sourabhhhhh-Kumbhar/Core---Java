class ConstructorChainingOperations
{
    ConstructorChainingOperations()
    {
        this("John");

        System.out.println("Default Constructor Called");
    }

    ConstructorChainingOperations(String name)
    {
        this(name, 24);
        System.out.println("Name = " + name);
    }

    ConstructorChainingOperations(String name, int age)
    {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}

public class ConstructorChainingUsingThis
{
    public static void main(String[] args)
    {
        ConstructorChainingOperations obj = new ConstructorChainingOperations();
    }
}