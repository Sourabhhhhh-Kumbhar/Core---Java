// Demonstrates the relational (comparison) operators in Java
class Relational
{
    // Method that compares two numbers and prints each result
    void compare() {
        // Two numbers to compare
        int a = 20;
        int b = 10;

        // Equal to (==): true if both values are the same
        // 20 == 10 is false
        System.out.println("a == b : " + (a == b));

        // Not equal to (!=): true if the values are different
        // 20 != 10 is true
        System.out.println("a != b : " + (a != b));

        // Greater than (>): true if the left value is bigger
        // 20 > 10 is true
        System.out.println("a > b  : " + (a > b));

        // Less than (<): true if the left value is smaller
        // 20 < 10 is false
        System.out.println("a < b  : " + (a < b));

        // Greater than or equal to (>=): true if left is bigger or the same
        // 20 >= 10 is true
        System.out.println("a >= b : " + (a >= b));

        // Less than or equal to (<=): true if left is smaller or the same
        // 20 <= 10 is false
        System.out.println("a <= b : " + (a <= b));
    }

    // Entry point of the program
    public static void main(String[] args) {

        // Create an object of the Relational class
        Relational obj = new Relational();

        // Call compare() to print all the comparison results
        obj.compare();
    }
}