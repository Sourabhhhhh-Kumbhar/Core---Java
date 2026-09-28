public class Bitwise
{
    // A normal (non-static) method, so it needs an object of this class
    // to be called. It shows all the basic bitwise operators.
    // (Method name has a typo: "bitwsie". It works, but "bitwise" is the correct spelling.)
    void bitwsie()
    {
        // Bitwise operators work on the BINARY form of numbers, bit by bit.
        // a = 5 -> 0101
        // b = 3 -> 0011
        // (only the last 4 bits are shown; an int actually has 32 bits)
        int a = 5;
        int b = 3;

        // AND (&): result bit is 1 only if BOTH bits are 1
        //   0101
        //   0011
        //   ----
        //   0001 = 1
        System.out.println("a & b = " + (a & b));    // 1

        // OR (|): result bit is 1 if AT LEAST ONE bit is 1
        //   0101
        //   0011
        //   ----
        //   0111 = 7
        System.out.println("a | b = " + (a | b));    // 7

        // XOR (^): result bit is 1 if the bits are DIFFERENT
        //   0101
        //   0011
        //   ----
        //   0110 = 6
        System.out.println("a ^ b = " + (a ^ b));    // 6

        // NOT (~): flips EVERY bit (0 becomes 1, 1 becomes 0).
        // Works on all 32 bits, so 5 becomes 111...1010.
        // In two's complement, that equals -(a + 1) = -6.
        // Shortcut to remember: ~n = -(n + 1)
        System.out.println("~a = " + (~a));          // -6

        // LEFT SHIFT (<<): moves all bits to the left by 1 position,
        // filling the right side with 0.
        //   0101 -> 1010 = 10
        // Shifting left by 1 = multiplying by 2 (5 * 2 = 10)
        System.out.println("a << 1 = " + (a << 1));  // 10

        // RIGHT SHIFT (>>): moves all bits to the right by 1 position.
        // The rightmost bit is dropped.
        //   0101 -> 0010 = 2
        // Shifting right by 1 = integer division by 2 (5 / 2 = 2)
        System.out.println("a >> 1 = " + (a >> 1));  // 2
    }

    // Entry point: the JVM starts running the program from here
    public static void main(String[] args)
    {
        // bitwsie() is not static, so we must create an object first
        Bitwise obj = new Bitwise();

        // Call the method, this prints all the results
        obj.bitwsie();
    }
}