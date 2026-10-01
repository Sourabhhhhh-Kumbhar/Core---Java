public class NonPrimitiveData
{
    public static void main(String[] args)
    {
        //String
        String name = "John";

        //Array
        int[] marks = {85,23,44,21};

        //Object
        Student student = new Student("John", 20);

        System.out.println("String: " + name);

        System.out.println("Array: ");
        for(int mark : marks)
        {
            System.out.println(mark + "");
        }
        System.out.println("\nObject:");
        student.display();
    }
}

class Student
{
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
