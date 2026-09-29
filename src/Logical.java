// Demonstrates the logical operators (&&, ||, !) in Java
public class Logical
{
    // Method that applies each logical operator and prints the result
    void check()
    {
        // Two boolean variables used for the operations
        boolean a = true;
        boolean b = false;

        // AND (&&): true only if BOTH sides are true
        // true && false = false
        System.out.println("a && b: " + (a && b));

        // OR (||): true if AT LEAST ONE side is true
        // true || false = true
        System.out.println("a || b: " + (a || b));

        // NOT (!): reverses the value
        // !true = false
        System.out.println("!a: " + (!a));

        // !false = true
        System.out.println("!b: " + (!b));
    }

    // Entry point of the program
    public static void main(String[] args)
    {
        // Create an object of the Logical class
        Logical L = new Logical();

        // Call check() to print the results of all logical operations
        L.check();
    }
}