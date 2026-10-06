
import java.util.HashMap;
import java.util.Map;

public class BasicMap
{
    public static void main(String[] args)
    {
        // Creating a Map
        // Map stores data in KEY-VALUE pairs.
        // Example: Roll Number -> Student Name
        Map<Integer, String> students = new HashMap<>();

        // put() is used to add a key-value pair
        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Sneha");
        students.put(104, "Priya");

        // Print the complete Map
        System.out.println("Students: " + students);

        // get() is used to retrieve a value using its key
        System.out.println("Student with Roll No 102: " + students.get(102));

        // containsKey() checks whether a particular key exists
        if (students.containsKey(103))
        {
            System.out.println("Roll No 103 is present");
        }

        // containsValue() checks whether a particular value exists
        if (students.containsValue("Rahul"))
        {
            System.out.println("Rahul is present");
        }

        // put() with an existing key updates its value
        students.put(102, "Rohit");

        // remove() removes a key-value pair using the key
        students.remove(104);

        // size() returns the number of key-value pairs
        System.out.println("Size of Map: " + students.size());

        // entrySet() gives us all key-value pairs
        // We use Map.Entry to access both key and value
        for (Map.Entry<Integer, String> entry : students.entrySet())
        {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

