class ConstructorOperations {

    // Default Constructor
    ConstructorOperations() {
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    ConstructorOperations(String name, int age) {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        ConstructorOperations obj1 = new ConstructorOperations();

        ConstructorOperations obj2 = new ConstructorOperations("John", 20);
    }
}
