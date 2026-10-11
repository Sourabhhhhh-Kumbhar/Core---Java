class CopyConstructorOperations
{
    String name;
    int age;

    //Parameterized Constructor
    CopyConstructorOperations(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    //Copy Constructor
    CopyConstructorOperations(CopyConstructorOperations obj)
    {
        this.name = obj.name;
        this.age = obj.age;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class CopyConstructor
{
    public static void main(String[] args)
    {
        CopyConstructorOperations obj1 = new CopyConstructorOperations("John", 20);
        CopyConstructorOperations obj2 = new CopyConstructorOperations(obj1);

        System.out.println("Original Object: ");
        obj1.display();

        System.out.println("\n Copied Object: ");
        obj2.display();
    }
}
