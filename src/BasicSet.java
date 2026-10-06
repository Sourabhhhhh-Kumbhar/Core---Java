import java.util.HashSet;
import java.util.Set;

public class BasicSet
{
    public static void main(String[] args)
    {
        //Creating Set of String Values
        //Set does not allow duplicate elements
        //HashSet is one of the implementations of the set
        Set<String> names = new HashSet<>();

        //add() is used to insert the elements into the set
        names.add("Sourabh");
        names.add("Sunset");
        names.add("Sunrise");
        names.add("MoonLight");
        names.add("MoonRain");
        names.add("Sunset");
        names.add("Sunrise");

        //Adding a duplicate value
        //Hashset will ignore it because Set does not allow duplicates
        names.add("Sunrise");

        //contains() check wheather the element exist in the Set
        if(names.contains("Sunset"))
        {
            System.out.println("Sunset is present in the list");
        }

        //remove() is used to remove an element
        names.remove("Sunrise");

        //size() returns the total number of elements
        System.out.println("Size of the list is: " + names.size());

        //Enhanced for loop is used to access each element
        for(String name : names)
        {
            System.out.println(name);
        }
    }
}
