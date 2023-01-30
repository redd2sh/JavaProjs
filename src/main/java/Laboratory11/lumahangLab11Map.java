package Laboratory11;
import java.util.*;

public class lumahangLab11Map {

    public static void main (String [] args )
    {
        // Creating a new object for the Hashmap
        Map<Integer, String> hashmap = new HashMap<>();

        // using put() method to insert key and value
        hashmap.put(1, new String("File 1"));
        hashmap.put(2, new String("File 2"));
        hashmap.put(3, new String("File 3"));
        hashmap.put(4, new String("File 4"));

        // passover the value using for each loop
        for (Map.Entry<Integer, String> each : hashmap.entrySet()) 
        {
            // Printing keys and values
            System.out.print(each.getKey() + ":");
            System.out.println(each.getValue());
        }
    }
}
