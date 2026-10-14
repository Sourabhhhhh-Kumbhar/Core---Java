class FinalMethodConstructorOperations
{
    //Constructor calls the display() method when object is created
    FinalMethodConstructorOperations()
    {
        display();
    }

    //Final Method cannot be overridden by subclasses
    final void display()
    {
        System.out.println("Final Method Called from Constructor");
    }
}

public class FinalMethod
{
    public static void main(String[] args)
    {
        //Creates an object and automatically invokes the constructor
        FinalMethodConstructorOperations obj = new FinalMethodConstructorOperations();
        obj.display();
    }
}
