public class Arithmetic
{
    // A normal (non-static) method, so it needs an object of this class
    // to be called. It performs all the basic arithmetic operations.
    void calculate()
    {
        // Two local variables, they exist only inside this method
        int a = 20;
        int b = 10;

        // "Addition = " is a String, and (a + b) is calculated FIRST
        // because of the brackets. Then the result gets joined to the text.
        // Without brackets, "Addition = " + a + b would print 2010, not 30.
        System.out.println("Addition = " + (a + b));        // 20 + 10 = 30

        // Subtraction: 20 - 10 = 10
        System.out.println("Subtraction = " + (a - b));

        // Multiplication: 20 * 10 = 200
        System.out.println("Multiplication = " + (a * b));

        // Division: both a and b are int, so this is INTEGER division.
        // The decimal part is thrown away: 20 / 10 = 2
        // (e.g. 7 / 2 would give 3, not 3.5)
        System.out.println("Division = " + (a / b));

        // Modulus (%): gives the REMAINDER after division.
        // 20 % 10 = 0, because 10 divides 20 exactly.
        // (e.g. 7 % 3 = 1)
        System.out.println("Remainder = " + (a % b));
    }

    // Entry point: the JVM starts running the program from here
    public static void main(String[] args)
    {
        // calculate() is not static, so we must create an object first.
        // (The variable name "a" here is separate from the "a" inside calculate().)
        Arithmetic a = new Arithmetic();

        // Call the method on the object, this prints all 5 results
        a.calculate();
    }
}