public class Arrays
{
    // A normal (non-static) method, so it needs an object of this class
    // to be called. It creates an array and prints every element.
    void display()
    {
        // ARRAY: a fixed-size collection of elements of the SAME type.
        // {10,20,30,40,50} is an array initializer: Java creates an int array
        // of size 5 and fills it with these values.
        // Indexes start at 0, so: numbers[0] = 10, numbers[1] = 20, ... numbers[4] = 50
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Arrays Elements:");

        // Loop from index 0 up to the last valid index.
        // numbers.length = 5 (it's a field, not a method, so no brackets).
        // Condition is i < 5 (NOT i <= 5), because the last index is 4.
        // Using i <= 5 would cause ArrayIndexOutOfBoundsException.
        for (int i = 0; i < numbers.length; i++)
        {
            // Access the element at position i and print it
            System.out.println(numbers[i]);
        }
    }

    // Entry point: the JVM starts running the program from here
    public static void main(String[] args)
    {
        // display() is not static, so we must create an object first
        Arrays obj = new Arrays();

        // Call the method, this prints all the array elements
        obj.display();
    }
}
