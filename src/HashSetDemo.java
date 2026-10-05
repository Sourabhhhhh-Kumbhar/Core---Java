import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
    public static void main(String[] args)
    {
        //Create An Hashsets of Strings
        HashSet<String> fruits = new HashSet<String>();

        //Add Elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Watermelon");
        fruits.add("Pear");
        boolean added = fruits.add("Apple");
        System.out.println("Duplicate added? " + added);

        //Size
        System.out.println("Fruits: " + fruits.size());

        //Check if Elements Exist
        System.out.println("Has Mango ? " + fruits.contains("Mango"));

        //Remove an Element
        fruits.remove("Banana");

        //Loop Through The set
        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }

        //Iterator (Useful for safe removal while looping)
        Iterator<String> it = fruits.iterator();
        while(it.hasNext())
        {
            if (it.next().equals("Mango"))
            {
                it.remove();
            }
        }

        //Set operations with another set
        HashSet<Integer> a = new HashSet<>();
        a.add(1); a.add(2); a.add(3);

        HashSet<Integer> b = new HashSet<>();
        b.add(2); b.add(3); b.add(4);

        HashSet<Integer> union = new HashSet<>(a);
        union.addAll(b);         //{1, 2, 3, 4}

        HashSet<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        HashSet<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);


        System.out.println("Union: " +  union);
        System.out.println("Intersection: " +  intersection);
        System.out.println("Difference: " +  difference);

        //Clear all Elements
        fruits.clear();
        System.out.println("Empty? " + fruits.isEmpty());
    }
}
