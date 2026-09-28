public class Demo3 {

    // Entry point: the JVM starts running the program from here.
    // Everything is inside main(), so no object creation is needed
    // (unlike your Arithmetic class, where calculate() was non-static).
    public static void main(String[] args) {

        // Two local variables, they exist only inside main()
        int a = 20;
        int b = 10;

        // ADDITION (+): brackets make (a + b) calculate FIRST,
        // then the result gets joined to the text.
        // Without brackets, "Addition: " + a + b would print 2010, not 30.
        System.out.println("Addition: " + (a + b));            // 20 + 10 = 30

        // SUBTRACTION (-): 20 - 10 = 10
        System.out.println("Subtraction: " + (a - b));

        // MULTIPLICATION (*): 20 * 10 = 200
        System.out.println("Multiplication: " + (a * b));

        // DIVISION (/): both a and b are int, so this is INTEGER division.
        // The decimal part is dropped: 20 / 10 = 2
        // (e.g. 7 / 2 would give 3, not 3.5)
        System.out.println("Division: " + (a / b));

        // MODULUS (%): gives the REMAINDER after division.
        // 20 % 10 = 0, because 10 divides 20 exactly.
        // (e.g. 7 % 3 = 1)
        System.out.println("Modulus: " + (a % b));
    }
}