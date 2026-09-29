// Demonstrates the do-while loop in Java
public class DoWhile
{
    // Method that runs the do-while loop and prints numbers
    void display()
    {
        // Loop counter, starting at 1
        int i = 1;

        // do-while runs the body FIRST, then checks the condition,
        // so this block always executes at least once
        do
        {
            // Prints the current value of i, then increments it by 1 (post-increment)
            System.out.println(i++);

            // Increments i by 1 again, so i goes up by 2 per iteration in total
            i++;
        }
        // Condition is checked after each iteration; loop continues while i < 10
        while(i<10);
    }

    // Entry point of the program
    public static void main(String[] args)
    {
        // Create an object of the DoWhile class
        DoWhile obj = new DoWhile();

        // Call display() to run the loop
        obj.display();
    }
}