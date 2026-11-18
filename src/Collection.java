import java.util.*;

public class Collection
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("Sourabh");
        names.add("Anikaaa");
        names.add("Nishaaa");
        names.add("Ushaaa");
        names.add("Sourabh");

        System.out.println("1) List   : " + names);
        System.out.println("Index 1  : " + names.get(1));
        System.out.println(" Size   : " + names.size());
        names.remove("Ushaaa");
        System.out.println("Remove ke baad: " + names);

        System.out.println("---------------------------");


        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);

        System.out.println("2) Set   : " + numbers);
        System.out.println("Contains 20: " + numbers.contains(20));

        System.out.println("-----------------------------");


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sourabh");
        map.put(2, "Anikaaa");
        map.put(3, "Nishaaa");
        map.put(4, "Ushaaa");
        map.put(5, "Sourabh");

        System.out.println("3) Map : " + map);
        System.out.println("Key 2 : " + map.get(2));
        System.out.println("Key 999 : " + map.getOrDefault(999, "Not Found"));

        for(Map.Entry<Integer, String> entry : map.entrySet())
        {
            System.out.println(" " + entry.getKey() + " -> " +  entry.getValue());
        }

        System.out.println("-----------------------------");


        String sentence = "java is fun and java is powerful";
        Map<String, Integer> count = new HashMap<>();

        for (String word : sentence.split(" "))
        {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        System.out.println("4) Word count  : " + count);
    }
}