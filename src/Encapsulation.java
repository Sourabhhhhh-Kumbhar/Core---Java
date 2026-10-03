class EncapsulationOperations
{

    // Private variables
    private String name;
    private int age;

    // Setter methods
    void setName(String name)
    {
        this.name = name;
    }

    void setAge(int age)
    {
        this.age = age;
    }

    // Getter methods
    String getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }
}

public class Encapsulation
{
    public static void main(String[] args)
    {

        EncapsulationOperations obj = new EncapsulationOperations();

        obj.setName("John");
        obj.setAge(20);

        System.out.println("Name = " + obj.getName());
        System.out.println("Age = " + obj.getAge());
    }
}
