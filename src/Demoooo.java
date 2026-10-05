import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;
public class Demoooo
{
    public static void main(String[] args)
    {
        //Map<String, Integer> students = new HashMap<>();
        Map<String, Integer> week = new HashMap<>();

        week.put("Monday", 1);
        week.put("Tuesday", 2);
        week.put("Wednesday", 3);
        week.put("Thursday", 4);
        week.put("Friday", 5);
        week.put("Saturday", 6);
        week.put("Sunday", 7);

        System.out.println(week.keySet());

        for(String key : week.keySet())
        {
            System.out.println(key + ": " + week.get(key));
        }

    }
}
