class Calculator
{
    //Adds two integers
    public int add(int a, int b)
    {
        return a + b;
    }

    //Same name three integers(Different number of parameters)
    public int add(int a, int b, int c)
    {
        return a + b + c;
    }

    //Same name, doubles(Differrent parameter types)
    public double add(double a, double b)
    {
        return a + b;
    }
}

public class MethodOverloading
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        //Java picks the matching method based on the arguments passed
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
        System.out.println(calc.add(10, 20, 30));
        System.out.println(calc.add(4.5 , 8.5));
    }
}
