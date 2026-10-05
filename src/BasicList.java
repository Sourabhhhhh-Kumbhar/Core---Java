
import java.util.ArrayList;
import java.util.List;

public class BasicList
{
    public static void main(String[] args)
    {
        // Creating a List of String values
        // List is an interface, and ArrayList is one of its implementations.
        List<String> names = new ArrayList<>();

        // add() is used to insert elements into the List
        names.add("Nishaa");
        names.add("Anikaaa");
        names.add("Sourabh");
        names.add("Aryaaaa");

        // Printing the complete List
        System.out.println("Names: " + names);

        // get() is used to access an element using its index
        // Index starts from 0
        System.out.println("First Name: " + names.get(0));

        // set() is used to replace an existing element
        names.set(1, "Rohit");

        // remove() is used to remove an element
        names.remove("Sneha");

        // size() returns the total number of elements
        System.out.println("Size of List: " + names.size());

        // Enhanced for loop is used to visit each element
        for (String name : names)
        {
            System.out.println(name);
        }
    }
}

