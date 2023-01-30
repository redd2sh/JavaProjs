package Laboratory12;
import java.util.*;
public class lumahangLab12SortedMap 
{
    // Main Method
    
    public static void main (String [] args)
    {
        SortedMap<Integer, String> sm = new TreeMap<>();

        sm.put(new Integer(2), "To");
        sm.put(new Integer(3), "Java");
        sm.put(new Integer(5), "Programming");
        sm.put(new Integer(4), "Data Structure");
        sm.put(new Integer(1), "Welcome");
        Set s = sm.entrySet();

        // Using iterator in SortedMap
        Iterator i = s.iterator();

        // Traversing map. Note that the traversal
        // produced serted (by keys) output .
        while(i.hasNext())
        {
            Map.Entry m = (Map.Entry)i.next();

            int key = (Integer)m.getKey();
            String value = (String)m.getValue();

            System.out.println("Key : " + key
                                + " value : " + value);
        }
    }
}
