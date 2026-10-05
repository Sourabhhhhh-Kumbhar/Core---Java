
// Class representing a student
public class Constructor
{
    String name;
    int age;

    // Constructor: initializes the object's variables
    // It has the same name as the class and no return type
    Constructor(String n, int a)
    {
        name = n;
        age = a;
    }

    // Method to display student details
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args)
    {
        // Creating objects calls the constructor automatically
        Student s1 = new Student("Rahul", 21);
        Student s2 = new Student("Amit", 22);

        // Displaying object details
        s1.display();
        s2.display();
    }
}
