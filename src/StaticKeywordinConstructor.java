class StaticOperations {
    //Static Variable
    static int count = 0;

    //Static Block (Acts like a static constructor)
    static {
        System.out.println("Static Block Executed");
    }

    //Constructor
    StaticOperations() {
        count++;
        System.out.println("Object Created: " + count);
    }

    //Static Method
    static void displayCount()
    {
        System.out.println("Total Objects: " + count);
    }
}

public class StaticKeywordinConstructor
{
    public static void main(String[] args)
    {
        StaticOperations obj1 = new StaticOperations();
        StaticOperations obj2 = new StaticOperations();

        StaticOperations.displayCount();
    }
}
