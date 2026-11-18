// File: CollectionsDemo.java

import java.util.*;

/*
 * COLLECTIONS = data ko store/manage karne ke ready-made containers.
 *
 *   List  -> order maintain, duplicates allowed   (ArrayList)
 *   Set   -> duplicates NAHI allowed              (HashSet)
 *   Map   -> key-value pairs, key unique          (HashMap)
 */
public class Collection
{
    public static void main(String[] args)
    {

        // ===== 1. ArrayList (List) =====
        List<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Amit");
        names.add("Sneha");
        names.add("Amit");               // duplicate allowed

        System.out.println("1) List        : " + names);
        System.out.println("   Index 1     : " + names.get(1));   // Amit
        System.out.println("   Size        : " + names.size());   // 4
        names.remove("Rahul");
        System.out.println("   Remove ke baad: " + names);

        System.out.println("-----------------------------");

        // ===== 2. HashSet (Set) =====
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);                 // duplicate, ignore ho jayega
        numbers.add(30);

        System.out.println("2) Set         : " + numbers);        // 10 sirf ek baar
        System.out.println("   Contains 20 : " + numbers.contains(20));

        System.out.println("-----------------------------");

        // ===== 3. HashMap (Map) =====
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Sneha");
        students.put(102, "Vikas");      // same key -> value replace ho jayegi

        System.out.println("3) Map         : " + students);
        System.out.println("   Key 102     : " + students.get(102));          // Vikas
        System.out.println("   Key 999     : " + students.getOrDefault(999, "Not Found"));

        // Map ko loop karna
        for (Map.Entry<Integer, String> e : students.entrySet())
        {
            System.out.println("   " + e.getKey() + " -> " + e.getValue());
        }

        System.out.println("-----------------------------");

        // ===== 4. Word count (real use-case) =====
        String sentence = "java is fun and java is powerful";
        Map<String, Integer> count = new HashMap<>();

        for (String word : sentence.split(" "))
        {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        System.out.println("4) Word count  : " + count);
    }
}