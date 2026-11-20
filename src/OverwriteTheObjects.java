public class OverwriteTheObjects
{
    static int a = 10;

    public static void main(String[] args)
    {
        OverwriteTheObjects obj1 = new OverwriteTheObjects();
        OverwriteTheObjects obj2 = new OverwriteTheObjects();

        obj1.a = 50;
        obj2.a = 0;

        System.out.println("a: " + obj1.a);
        System.out.println("a: " + obj2.a);

        System.out.println(OverwriteTheObjects.a);
    }
}
