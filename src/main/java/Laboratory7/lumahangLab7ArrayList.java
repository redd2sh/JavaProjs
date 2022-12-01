package Laboratory7;
import java.util.ArrayList;
public class lumahangLab7ArrayList {
    public static void main(String[] args) {
        
        // Declaring the ArrayList with initial size of 5
        ArrayList<Integer> arrlist= new ArrayList<>(5);
        
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            arrlist.add(i);
        
        // Printing elements
        System.out.println(arrlist);
        
        // Remove element at index 3
        arrlist.remove(3);
        
        // Displaying the ArrayList
        // after deletion
        System.out.println(arrlist);
        
        // Printing elements one by one
        for (int i = 0; i < arrlist.size(); i++)
            System.out.print(arrlist.get(i) + " ");
    }
}
