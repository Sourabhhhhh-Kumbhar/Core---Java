import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> marks = new HashMap<>();

        // Add key-value pairs
        marks.put("Amit", 85);
        marks.put("Sara", 92);
        marks.put("John", 78);
        marks.put("Amit", 90);                 // same key, value gets replaced

        // Get a value by key
        System.out.println("Sara: " + marks.get("Sara"));
        System.out.println("Unknown: " + marks.get("Zoe"));            // null
        System.out.println("Default: " + marks.getOrDefault("Zoe", 0)); // 0

        // Size
        System.out.println("Size: " + marks.size());

        // Check for key / value
        System.out.println("Has key John? " + marks.containsKey("John"));
        System.out.println("Has value 92? " + marks.containsValue(92));

        // Add only if the key is absent
        marks.putIfAbsent("Riya", 88);

        // Remove by key
        marks.remove("John");

        // Loop through entries (most common way)
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Loop through keys only
        for (String name : marks.keySet()) {
            System.out.println("Key: " + name);
        }

        // Loop through values only
        for (int value : marks.values()) {
            System.out.println("Value: " + value);
        }

        // forEach with lambda
        marks.forEach((k, v) -> System.out.println(k + " = " + v));

        // Update a value based on the old one
        marks.merge("Sara", 5, Integer::sum);   // Sara: 92 + 5 = 97

        // Counting word frequency (classic use case)
        String[] words = {"java", "is", "fun", "java", "is", "great", "java"};
        HashMap<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        System.out.println(freq);   // {java=3, is=2, fun=1, great=1} (order may vary)

        // Clear all entries
        marks.clear();
        System.out.println("Empty? " + marks.isEmpty());
    }
}
