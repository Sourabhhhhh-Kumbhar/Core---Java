import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        //Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        //Add Elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Blueberry");
        fruits.add(1 , "Avocado");

        //Access elements
        System.out.println("First: " + fruits.get(0));
        System.out.println("Size: " + fruits.size());

        //Update an Element
        fruits.set(2, "Grapes");

        //Remove Element
        fruits.remove("Apple");   //BY Value
        fruits.remove(0);     //By Index

        //Check if Element Exist
        System.out.println("Has Grapes? " + fruits.contains("Grapes"));

        //Sort the List
        Collections.sort(fruits);

        //Loop Through The List
        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }

        //Print The Whole List
        System.out.println(fruits);

        //Clear All Elements
        fruits.clear();
        System.out.println("Empty? " + fruits.isEmpty());
    }
}
