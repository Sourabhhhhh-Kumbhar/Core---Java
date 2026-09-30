// Demonstrates basic String methods in Java
class StringOperations {

    // Method that applies common String methods and prints the results
    void display() {

        // Creates a String object holding the text "Hello Java"
        String name = "Hello Java";

        // Prints the original string
        System.out.println("String = " + name);

        // length() returns the number of characters, including the space
        // "Hello Java" has 10 characters (5 + 1 space + 4)
        System.out.println("Length = " + name.length());

        // toUpperCase() returns a NEW string with all letters in capitals
        // The original string is not changed (Strings are immutable in Java)
        System.out.println("Uppercase = " + name.toUpperCase());

        // toLowerCase() returns a NEW string with all letters in small letters
        System.out.println("Lowercase = " + name.toLowerCase());
    }
}

// Main class: this one holds the main method, so the file should be named StringDemo.java
public class StringDemo {
    // Entry point of the program
    public static void main(String[] args) {

        // Create an object of the StringOperations class
        StringOperations obj = new StringOperations();

        // Call display() to run all the string operations
        obj.display();
    }
}