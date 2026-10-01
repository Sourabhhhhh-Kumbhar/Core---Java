class StringFunctionsOperations {

    void display() {

        String str = "Hello Java";

        System.out.println("Original String = " + str);
        System.out.println("Length = " + str.length());
        System.out.println("Uppercase = " + str.toUpperCase());
        System.out.println("Lowercase = " + str.toLowerCase());
        System.out.println("Character at Index 1 = " + str.charAt(1));
        System.out.println("Substring = " + str.substring(6));
        System.out.println("Contains 'Java' = " + str.contains("Java"));
        System.out.println("Starts With 'Hello' = " + str.startsWith("Hello"));
        System.out.println("Ends With 'Java' = " + str.endsWith("Java"));
        System.out.println("Index of 'J' = " + str.indexOf('J'));
        System.out.println("Last Index of 'a' = " + str.lastIndexOf('a'));
        System.out.println("Replace = " + str.replace("Java", "World"));
        System.out.println("Equals 'Hello Java' = " + str.equals("Hello Java"));
        System.out.println("Equals Ignore Case = " + str.equalsIgnoreCase("hello java"));
        System.out.println("Is Empty = " + str.isEmpty());
        System.out.println("Trim = " + "  Hello Java  ".trim());
    }
}

public class StringFunctions {
    public static void main(String[] args) {

        StringFunctionsOperations obj = new StringFunctionsOperations();
        obj.display();
    }
}