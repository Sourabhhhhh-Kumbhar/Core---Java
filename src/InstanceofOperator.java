
class Human
{
    void drink()
    {
        System.out.println("Human is eating"); // Displays the human's action
    }
}

class Male extends Human
{
    void bark()
    {
        System.out.println("Dog is barking"); // Displays the male's action
    }
}

public class InstanceofOperator
{
    public static void main(String[] args)
    {
        Human animal = new Male(); // Stores a Male object in an Human reference

        System.out.println(animal instanceof Male); // Checks whether the object is a Male
        System.out.println(animal instanceof Human); // Checks whether the object is an Human

        if (animal instanceof Male)
        { // Checks the object's type before casting
            Male dog = (Male) animal; // Casts the Human reference to Male
            dog.bark(); // Calls the Male-specific method
        }
    }
}
