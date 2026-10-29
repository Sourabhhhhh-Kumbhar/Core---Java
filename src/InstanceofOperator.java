
class Human
{
    void drink()
    {
        System.out.println("Human is eating"); // Displays the animal's action
    }
}

class Male extends Human
{
    void bark()
    {
        System.out.println("Dog is barking"); // Displays the dog's action
    }
}

public class InstanceofOperator
{
    public static void main(String[] args)
    {
        Human animal = new Male(); // Stores a Dog object in an Animal reference

        System.out.println(animal instanceof Male); // Checks whether the object is a Dog
        System.out.println(animal instanceof Human); // Checks whether the object is an Animal

        if (animal instanceof Male)
        { // Checks the object's type before casting
            Male dog = (Male) animal; // Casts the Animal reference to Dog
            dog.bark(); // Calls the Dog-specific method
        }
    }
}
