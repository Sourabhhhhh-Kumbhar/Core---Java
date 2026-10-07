// Parent class (base class)
class Animal
{
    // This method will be overridden by child classes
    void speak()
    {
        System.out.println("Some generic animal sound");
    }
}

// Child class 1: inherits from Animal
class Dog extends Animal
{
    @Override  // tells Java we are replacing the parent's method
    void speak()
    {
        System.out.println("Woof!");
    }
}

// Child class 2
class Catt extends Animal
{
    @Override
    void speak()
    {
        System.out.println("Meow!");
    }
}

// Child class 3
class Cow extends Animal
{
    @Override
    void speak()
    {
        System.out.println("Moo!");
    }
}

// Main class where the program starts
public class Polymorphism
{
    public static void main(String[] args)
    {

        // Parent reference holding child objects (this is the key to polymorphism)
        Animal a1 = new Dog();
        Animal a2 = new Catt();
        Animal a3 = new Cow();

        // Same method call, but different output depending on the actual object
        a1.speak();  // Woof!
        a2.speak();  // Meow!
        a3.speak();  // Moo!

        // Array of Animal type holding different animals
        Animal[] animals = { new Dog(), new Catt(), new Cow() };

        // Loop doesn't care which animal it is, it just calls speak()
        for (Animal a : animals)
        {
            a.speak();
        }
    }
}