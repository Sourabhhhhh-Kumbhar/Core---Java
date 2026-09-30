// Demonstrates the ternary operator (?:) in Java
public class Ternary
{
    // Method that compares two numbers using the ternary operator
    void check()
    {
        // Two numbers to compare
        int a = 20;
        int b = 10;

        // Ternary operator syntax: condition ? valueIfTrue : valueIfFalse
        // It is a shorter way of writing a simple if-else
        // Here: if a > b, result = "A is Greater", otherwise "B is Greater"
        // Since 20 > 10 is true, the first value is chosen
        String result = (a > b) ? "A is Greater" : "B is Greater";

        // Prints the chosen message
        System.out.println("Result: " + result);
    }

    // Entry point of the program
    public static  void main(String[] args)
    {
        // Create an object of the Ternary class
        Ternary obj = new Ternary();

        // Call check() to run the comparison
        obj.check();
    }
}