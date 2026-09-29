// Demonstrates the if statement in Java
public class If
{
    // Method that checks the age and prints a message if the condition is true
    void check()
    {
        // Stores the person's age
        int age = 18;

        // Checks if age is greater than or equal to 18
        // The block below runs only when this condition is true
        if (age >= 18)
        {
            // Runs because 18 >= 18 is true
            System.out.println("You are eligible to vote.");
        }
    }

    // Entry point of the program
    public static void main(String[]args)
    {
        // Create an object of the If class
        If obj = new If();

        // Call check() to run the age check
        obj.check();
    }
}