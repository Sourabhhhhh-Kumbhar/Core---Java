
class FinalKeywordOperations {

    // Final variable cannot be reassigned after initialization.
    final int number = 100;

    // Final method cannot be overridden by subclasses.
    final void display()
    {
        System.out.println("Final Variable = " + number);
    }
}

public class FinalKeyword
{
    public static void main(String[] args)
    {

        // Creates an object of the FinalKeywordOperations class.
        FinalKeywordOperations obj = new FinalKeywordOperations();

        // Calls the display() method to print the final variable.
        obj.display();
    }
}
