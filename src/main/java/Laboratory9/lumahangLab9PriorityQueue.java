package Laboratory9;
import java.util.PriorityQueue;

public class lumahangLab9PriorityQueue {

    public static void main (String [] args )
    {
        PriorityQueue<Integer>  testIntegerPQ  = new PriorityQueue<>();
        testIntegerPQ.add(5);
        testIntegerPQ.add(2);
        testIntegerPQ.add(0);
        testIntegerPQ.add(10);
        testIntegerPQ.add(1);
        testIntegerPQ.add(8);

        System.out.println("Head Queue: " + testIntegerPQ.peek());
        System.out.println("Size of the Queue: " + testIntegerPQ.size());

        System.out.println("\nInteger Stored in Natural Ordering in a Priority Queue\n");
        while(!testIntegerPQ.isEmpty())
        {
            System.out.print(testIntegerPQ.poll() + " ");
        }

        System.out.println("\n\nQueue Empty: " + testIntegerPQ.isEmpty());
    }
}


