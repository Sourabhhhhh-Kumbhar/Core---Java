public class GetterMethod
{
    private String name;
    private int age;

    //Getter for name: returns the current value of the private field
    public String getName()
    {
        return name;
    }

    //Getter for age
    public int getAge()
    {
        return age;
    }

    public static void main(String[] args)
    {
        GetterMethod getter = new GetterMethod();


        System.out.println(getter.getName());
        System.out.println(getter.getAge());
    }
}
