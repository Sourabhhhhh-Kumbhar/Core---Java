// Demonstrates the if-else statement in Java
public class IfElse
{
    // Method that checks the age and prints a message based on the result
    void check()
    {
        // Stores the person's age
        int age = 13;

        // Checks if age is greater than 18
        // Note: this uses > (not >=), so exactly 18 would NOT pass
        if (age > 18)
        {
            // Runs only when the condition above is true
            System.out.println("You are eligible");
        }
        // Runs when the if condition is false
        else
        {
            // Runs because 13 > 18 is false
            System.out.println("You are not eligible");
        }
    }

    // Entry point of the program
    public static void main(String[] args)
    {
        // Create an object of the IfElse class
        IfElse obj = new IfElse();

        // Call check() to run the age check
        obj.check();
    }
}