// Demonstrates the while loop in Java
public class While
{
    // Method that runs the while loop and prints numbers
    void display()
    {
        // Loop counter, starting at 1
        int i = 1;

        // while checks the condition BEFORE running the body,
        // so if the condition is false at the start, the body never runs
        // Loop continues as long as i is less than or equal to 5
        while(i <= 5)
        {
            // Prints the current value of i
            System.out.println(i);

            // Increments i by 1 so the loop moves toward ending
            // (without this, the loop would run forever)
            i++;
        }
    }

    // Entry point of the program
    public static void main(String[]args)
    {
        // Create an object of the While class
        While obj = new While();

        // Call display() to run the loop
        obj.display();
    }
}