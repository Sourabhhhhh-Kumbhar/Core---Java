class RecursionOperations
{

    int factorial(int n)
    {

        if (n == 1)
        {
            return 1;
        }

        return n * factorial(n - 1);
    }
}

public class Recursion
{
    public static void main(String[] args) {

        RecursionOperations obj = new RecursionOperations();

        int result = obj.factorial(5);

        System.out.println("Factorial = " + result);
    }
}