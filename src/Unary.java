public class Unary
{
    void unary()
    {
        int a = 10;

        System.out.println("Initial value = " + a);

        System.out.println("Post Increment (a++) = " + (a++));
        System.out.println("Value after Post Increment = " + a);

        System.out.println("Pre Incremnet (++a) = " + (++a));

        System.out.println("Post Decrement (a--) = " + (a--));
        System.out.println("Value after Post Decrement = " + a);

        System.out.println("Pre Decrement (--a) = " + (--a));
    }

    public static void main(String[] args)
    {
        Unary obj = new Unary();

        obj.unary();
    }
}
