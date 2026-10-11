class ConstructorOverloadingOperations
{
    //Default Constructor
    ConstructorOverloadingOperations()
    {
        System.out.println("Default Constructor Called");
    }

    //Parameterized Constructor(One Parameter)
    ConstructorOverloadingOperations(String name)
    {
        System.out.println("Name : " + name);
    }

    //Parameterized Constructor(Two Parameter)
    ConstructorOverloadingOperations(String name, int age)
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class ConstructorOverloading
{
    public static void main(String[] args)
    {
        ConstructorOverloadingOperations obj = new ConstructorOverloadingOperations();

        ConstructorOverloadingOperations obj2 = new ConstructorOverloadingOperations("Sourabh");

        ConstructorOverloadingOperations obj3 = new ConstructorOverloadingOperations("Sourabh", 24);
    }
}