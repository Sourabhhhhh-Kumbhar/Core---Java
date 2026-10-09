import java.util.HashMap;
import java.util.TreeMap;

public class DemoTreeHashmap
{
    public static void main(String[] args)
    {

        // ---------- HashMap ----------
        // key -> value pairs, NO order, fastest (O(1)), allows one null key
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(3, "Amit");
        hm.put(1, "Sourabh");
        hm.put(2, "Rahul");
        hm.put(2, "Rohan");   // same key, so the old value is replaced

        System.out.println("HashMap: " + hm);                 // {1=Sourabh, 2=Rohan, 3=Amit}
        System.out.println("Get 1: " + hm.get(1));            // Sourabh
        System.out.println("Has key 3? " + hm.containsKey(3));        // true
        System.out.println("Has value Amit? " + hm.containsValue("Amit")); // true
        hm.remove(3);
        System.out.println("After remove: " + hm);            // {1=Sourabh, 2=Rohan}

        // Loop through the map
        for (var e : hm.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // ---------- TreeMap ----------
        // key -> value pairs, always SORTED by key, O(log n)
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(30, "C");
        tm.put(10, "A");
        tm.put(20, "B");
        tm.put(40, "D");

        System.out.println("TreeMap: " + tm);                 // {10=A, 20=B, 30=C, 40=D}
        System.out.println("First key: " + tm.firstKey());     // 10
        System.out.println("Last key: " + tm.lastKey());       // 40
        System.out.println("Lower than 30: " + tm.lowerKey(30));     // 20
        System.out.println("Higher than 30: " + tm.higherKey(30));   // 40
        System.out.println("Floor of 25: " + tm.floorKey(25));       // 20
        System.out.println("Ceiling of 25: " + tm.ceilingKey(25));   // 30
        System.out.println("Head map (<30): " + tm.headMap(30));     // {10=A, 20=B}
        System.out.println("Tail map (>=30): " + tm.tailMap(30));    // {30=C, 40=D}
        System.out.println("Descending: " + tm.descendingMap());     // {40=D, 30=C, 20=B, 10=A}
        System.out.println("Poll first: " + tm.pollFirstEntry());    // 10=A
    }
}