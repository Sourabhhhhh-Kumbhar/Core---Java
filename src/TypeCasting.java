class ImplicitCasting
{
    void show()
    {
        int number = 50;
        double result = number;

        System.out.println("=== Implicit Type Casting ===");
        System.out.println("Integer: " + number);
        System.out.println("Double: " + result);
    }
}

class ExplicitCasting extends ImplicitCasting
{
    void show()
    {
        double number = 99.99;
        int result = (int)number;

        System.out.println("=== Explicit Type Casting ===");
        System.out.println("Double: " + result);
        System.out.println("Integer: " + number);
    }
}

public class TypeCasting
{
    public static void main(String[] args)
    {
        ImplicitCasting obj1 = new ImplicitCasting();
        ExplicitCasting obj2 = new ExplicitCasting();

        obj1.show();
        obj2.show();
    }
}