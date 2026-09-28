public class Assignment
{
    // A normal (non-static) method, so it needs an object of this class
    // to be called. It shows all the compound assignment operators.
    void assign()
    {
        // Starting value. We will keep modifying "a" step by step,
        // so each line below works on the result of the previous line.
        int a = 10;

        System.out.println("Initial value: " + a);   // 10

        // ADD AND ASSIGN: a += 5 is shorthand for a = a + 5
        // 10 + 5 = 15
        a += 5;
        System.out.println("After += 5: " + a);      // 15

        // SUBTRACT AND ASSIGN: a -= 5 is shorthand for a = a - 5
        // 15 - 5 = 10
        a -= 5;
        System.out.println("After -= 5: " + a);      // 10

        // MULTIPLY AND ASSIGN: a *= 5 is shorthand for a = a * 5
        // 10 * 5 = 50
        a *= 5;
        System.out.println("After *= 5: " + a);      // 50

        // DIVIDE AND ASSIGN: a /= 5 is shorthand for a = a / 5
        // 50 / 5 = 10 (integer division, decimal part would be dropped)
        a /= 5;
        System.out.println("After /= 5: " + a);      // 10

        // MODULUS AND ASSIGN: a %= 5 is shorthand for a = a % 5
        // 10 % 5 = 0, because 5 divides 10 exactly, so the remainder is 0
        a %= 5;
        System.out.println("After %= 5: " + a);      // 0
    }

    // Entry point: the JVM starts running the program from here
    public static void main(String[] args)
    {
        // assign() is not static, so we must create an object first
        Assignment obj = new Assignment();

        // Call the method, this prints all the results
        obj.assign();
    }
}

//Operator	Meaning
//&=	a = a & b (bitwise AND)
//|=	a = a | b (bitwise OR)
//^=	a = a ^ b (bitwise XOR)
//<<=	a = a << b (left shift)
//>>=	a = a >> b (right shift)