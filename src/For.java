// Demonstrates the for loop in Java
public class For
{
    // Method that runs the for loop and prints numbers
    void display()
    {
        // A for loop has three parts inside the parentheses:
        // 1) int i = 1  -> initialization: runs once at the start
        // 2) i <= 5     -> condition: checked before every iteration
        // 3) i++        -> update: runs after every iteration
        for (int i = 1; i <= 5; i++)
        {
            // Prints the label and the current value of i
            System.out.println("Number: " + i);
        }
        // Note: i only exists inside the loop, so it can't be used out here
    }

    // Entry point of the program
    public static void main(String[] args)
    {
        // Create an object of the For class
        For obj = new For();

        // Call display() to run the loop
        obj.display();
    }
}