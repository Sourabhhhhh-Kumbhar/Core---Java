import java.util.TreeSet;

public class DemoTreeSet
{
    public static void main(String[] args)
    {

        // TreeSet = no duplicates + always keeps elements SORTED (ascending)
        TreeSet<Integer> ts = new TreeSet<>();

        // Add elements (order of insertion doesn't matter)
        ts.add(40);
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(30);   // duplicate, ignored

        System.out.println("TreeSet: " + ts);               // [10, 20, 30, 40]

        // First and last
        System.out.println("First: " + ts.first());         // 10
        System.out.println("Last: " + ts.last());           // 40

        // Closest values
        System.out.println("Lower than 30: " + ts.lower(30));     // 20 (strictly smaller)
        System.out.println("Higher than 30: " + ts.higher(30));   // 40 (strictly bigger)
        System.out.println("Floor of 25: " + ts.floor(25));       // 20 (<= 25)
        System.out.println("Ceiling of 25: " + ts.ceiling(25));   // 30 (>= 25)

        // Sub sets
        System.out.println("Head set (<30): " + ts.headSet(30));  // [10, 20]
        System.out.println("Tail set (>=30): " + ts.tailSet(30)); // [30, 40]

        // Remove
        ts.remove(20);
        System.out.println("After remove: " + ts);          // [10, 30, 40]

        // Remove first / last
        System.out.println("Poll first: " + ts.pollFirst()); // 10
        System.out.println("Poll last: " + ts.pollLast());   // 40
        System.out.println("TreeSet: " + ts);               // [30]

        System.out.println("Size: " + ts.size());           // 1
        System.out.println("Contains 30? " + ts.contains(30)); // true

        // Descending order
        TreeSet<String> names = new TreeSet<>();
        names.add("Sourabh");
        names.add("Amit");
        names.add("Rahul");
        System.out.println("Sorted: " + names);                    // [Amit, Rahul, Sourabh]
        System.out.println("Descending: " + names.descendingSet()); // [Sourabh, Rahul, Amit]
    }
}