class Mammel {
    public void eat() {
        System.out.println("Mammel is eating");
    }
}

class Cat extends Mammel {
    public void bark() {
        System.out.println("Cat is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Cat c = new Cat();

        c.eat();   // Inherited method
        c.bark();  // Child class method
    }
}