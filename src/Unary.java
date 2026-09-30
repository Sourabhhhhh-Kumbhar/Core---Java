// Demonstrates the unary increment and decrement operators in Java
public class Unary
{
    // Method that applies each unary operator and prints the results
    void unary()
    {
        // Starting value
        int a = 10;

        // Prints the starting value: 10
        System.out.println("Initial value = " + a);

        // Post-increment (a++): uses the CURRENT value first, then increases it
        // Prints 10, then a becomes 11
        System.out.println("Post Increment (a++) = " + (a++));

        // a was increased after the previous line, so it is now 11
        System.out.println("Value after Post Increment = " + a);

        // Pre-increment (++a): increases the value FIRST, then uses it
        // a becomes 12, then 12 is printed
        System.out.println("Pre Incremnet (++a) = " + (++a));

        // Post-decrement (a--): uses the CURRENT value first, then decreases it
        // Prints 12, then a becomes 11
        System.out.println("Post Decrement (a--) = " + (a--));

        // a was decreased after the previous line, so it is now 11
        System.out.println("Value after Post Decrement = " + a);

        // Pre-decrement (--a): decreases the value FIRST, then uses it
        // a becomes 10, then 10 is printed
        System.out.println("Pre Decrement (--a) = " + (--a));
    }

    // Entry point of the program
    public static void main(String[] args)
    {
        // Create an object of the Unary class
        Unary obj = new Unary();

        // Call unary() to run all the operations
        obj.unary();
    }
}