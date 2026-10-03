class EncapsulationValidationOperations {

    private String name;
    private int age;

    void setName(String name)
    {
        this.name = name;
    }

    void setAge(int age)
    {
        if (age >= 18)
        {
            this.age = age;
        }
        else
        {
            System.out.println("Invalid Age");
        }
    }

    String getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }
}

public class EncapsulationWithValidation
{
    public static void main(String[] args)
    {

        EncapsulationValidationOperations obj = new EncapsulationValidationOperations();

        obj.setName("Sourabh");
        obj.setAge(23);

        System.out.println("Name = " + obj.getName());
        System.out.println("Age = " + obj.getAge());
    }
}