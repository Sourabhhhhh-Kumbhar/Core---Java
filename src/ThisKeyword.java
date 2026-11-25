class Studentt
{
    int id;
    String name;
    int marks;

    //Constructor
    Studentt(int id, String name, int marks)
    {
        //this refers to current object's variables
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    //Display student details
    void displayDetails()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    //Update marks
    void updateMarks(int marks)
    {
        this.marks = marks;

        System.out.println("MArks updated Successfully");
    }
}

public class ThisKeyword
{
    public static void main(String[] args)
    {
        //Creating first student
        Studentt s1 = new Studentt(1, "Sourabh", 99);

        //Creating second student
        Studentt s2 = new Studentt(2, "Anikaaa", 89);

        s1.displayDetails();

        System.out.println("------------------");

        s2.displayDetails();

        System.out.println("------------------");

        s2.updateMarks(93);

        s2.displayDetails();
    }
}