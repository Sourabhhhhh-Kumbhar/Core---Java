public class UserDefinedConstructor
{
    String name;
    int age;

    UserDefinedConstructor(String n, int a)
    {
        name = n;
        age = a;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[]args)
    {
        UserDefinedConstructor obj = new UserDefinedConstructor("Sourabh", 24);
        obj.display();
    }
}
