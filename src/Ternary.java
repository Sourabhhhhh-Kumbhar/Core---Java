public class Ternary
{
    void check()
    {
        int a = 20;
        int b = 10;

        String result = (a > b) ? "A is Greater" : "B is Greater";
        System.out.println("Result: " + result);
    }

    public static  void main(String[] args)
    {
        Ternary obj = new Ternary();
        obj.check();
    }
}
