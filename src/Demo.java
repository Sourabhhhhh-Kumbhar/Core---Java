import java.util.Scanner; // needed to read input from the user (keyboard)

class Yoo
{
    // A normal (non-static) method, so it needs an object of this class
    // to be called. It reads a number and tells if it is negative, positive or zero.
    void display()
    {
        // Create a Scanner to read input from standard input (System.in)
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");

        // Read an integer typed by the user and store it in N.
        // If the user types text like "abc", this throws InputMismatchException.
        int N = sc.nextInt();

        // IF-ELSE IF-ELSE ladder: Java checks conditions from top to bottom
        // and runs ONLY the first block whose condition is true.
        // The remaining blocks are skipped.

        // Condition 1: is the number less than 0?
        if (N < 0)
        {
            // String + int: N gets converted to text and joined.
            // e.g. N = -5 prints "-5 is negative"
            System.out.println(N + " is negative");
        }
        // Condition 2: only checked if condition 1 was false
        else if (N > 0)
        {
            // BUG: "N" is inside quotes, so it is treated as plain text.
            // This always prints the letter N, not the actual number.
            // Fix: System.out.println(N + " is positive");
            System.out.println("N is positive");
        }
        // Reached only when N is neither < 0 nor > 0, so N must be 0
        else
        {
            // Same issue here: prints the letter N, not the value.
            // Since N is always 0 here, better: System.out.println(N + " is zero");
            System.out.println("N is zero");
        }

        // Note: sc is never closed. Add sc.close(); at the end to release the resource.
    }
}

public class Demo
{
    // Entry point: the JVM starts running the program from here
    public static void main(String[] args)
    {
        // display() is not static, so we must create an object first
        Yoo obj = new Yoo();

        // Call the method, this runs the whole input + check logic
        obj.display();
    }
}