class FinalVariableOperations
{
    final int number;

    FinalVariableOperations()
    {
        number = 100;
    }

    void display()
    {
        System.out.println("Final Variable = " + number);
    }
}

public class FinalVariableInConstructor
{
    public static void main(String[] args)
    {
        FinalVariableOperations obj = new FinalVariableOperations();
        obj.display();
    }
}