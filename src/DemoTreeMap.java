import java.util.TreeMap;

public class DemoTreeMap
{
    public static void main(String[] args)
    {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(30, "Carol");
        map.put(10, "Alice");
        map.put(20, "Bob");
        map.put(40, "Dave");

        System.out.println(map);              // {10=Alice, 20=Bob, 30=Carol, 40=Dave}

        // First / last
        System.out.println(map.firstKey());   // 10
        System.out.println(map.lastKey());    // 40
        System.out.println(map.firstEntry()); // 10=Alice

        // Closest keys (what makes TreeMap special)
        System.out.println(map.floorKey(25));   // 20   (largest key <= 25)
        System.out.println(map.ceilingKey(25)); // 30   (smallest key >= 25)
        System.out.println(map.lowerKey(20));   // 10   (strictly less)
        System.out.println(map.higherKey(20));  // 30   (strictly greater)

        // Sub-maps (ranges)
        System.out.println(map.headMap(30));          // {10=Alice, 20=Bob}   (keys < 30)
        System.out.println(map.tailMap(30));          // {30=Carol, 40=Dave}  (keys >= 30)
        System.out.println(map.subMap(10, 30));       // {10=Alice, 20=Bob}   (10 <= key < 30)

        // Reverse order
        System.out.println(map.descendingMap());      // {40=Dave, 30=Carol, 20=Bob, 10=Alice}

        // Remove and return the smallest / largest
        System.out.println(map.pollFirstEntry());     // 10=Alice (removed)
    }
}