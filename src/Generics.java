class Box<T>        //T is a type Parameter
{
    private T value;        //Stores a value of type T

    public void set(T value)        //Accepts value of T
    {
        this.value = value;         //Saves the Value
    }

    public T get()          //Returns a value of type T
    {
        return value;
    }
}

public class Generics
{
    public static void main(String[] args)
    {
        Box<Integer> numberBox = new Box<>();       //Creates a box for Integers
        numberBox.set(100);         //Stores an integers


        Box<String> textBox = new Box<>(); // Creates a box for strings
        textBox.set("BROOO!"); // Stores a string

        System.out.println(numberBox.get()); // Prints the integer
        System.out.println(textBox.get()); // Prints the string
    }
}