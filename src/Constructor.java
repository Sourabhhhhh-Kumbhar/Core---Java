public class Constructor
{
    String name;
    int age;

    Constructor(String n, int a)
    {
        name = n;
        age = a;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args)
    {
        Constructor c1 = new Constructor("Sourabh", 23);
        Constructor c2 = new Constructor("Anikaaaaaaaaaa", 20);

        c1.display();
        c2.display();
    }
}
