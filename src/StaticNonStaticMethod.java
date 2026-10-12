class StaticNonStaticMethod
{
    //Static Method
    static void staticMethod()
    {
        System.out.println("This is a static method");
    }

    //Non-Static Method
    void nonStaticMethod()
    {
        System.out.println("This is a non-static method");
    }

    public static void main(String[]args)
    {
        //Calling a Static method
        StaticNonStaticMethod.staticMethod();

        //Calling Non-Static Method
        StaticNonStaticMethod obj = new StaticNonStaticMethod();
        obj.nonStaticMethod();
    }
}