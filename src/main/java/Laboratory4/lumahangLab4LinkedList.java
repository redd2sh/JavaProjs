package Laboratory4;
import java.util.LinkedList;
public class lumahangLab4LinkedList {
    public static void main(String[] args) {
        
        LinkedList<Integer> number=new LinkedList<>();
        
        // Adding element
        number.add(5);
        number.add(10);
        number.add(15);
        number.add(16);
        // Adds a new element to the front of the list
        number.addFirst(1);
        
        // Removes and returns the first element of the list
        number.removeFirst();
        
        // Print the length of linkedlist element
        System.out.println(number.size());
        
        // Display the length of the given element
        System.out.println(number.indexOf(10));
        
        // Printing all the element
        System.out.println(number);
        
        // Display the index of the given element
        System.out.println(number.indexOf(5));  
    }
}
