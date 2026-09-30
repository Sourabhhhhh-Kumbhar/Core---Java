class StringOperations {

    void display() {

        String name = "Hello Java";

        System.out.println("String = " + name);
        System.out.println("Length = " + name.length());
        System.out.println("Uppercase = " + name.toUpperCase());
        System.out.println("Lowercase = " + name.toLowerCase());
    }
}

public class StringDemo {
    public static void main(String[] args) {

        StringOperations obj = new StringOperations();
        obj.display();
    }
}
