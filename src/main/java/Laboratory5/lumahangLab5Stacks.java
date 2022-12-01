package Laboratory5;
import java.util.Stack;
public class lumahangLab5Stacks {
    public static void main(String[] args) {
        
        Stack<Integer> S = new Stack<>(); // contents: ()
        S.push(5); // contents: (5)
        S.push(3); // contents: (5, 3)
        System.out.println("Size of stack is " + S.size()); // contents: (5, 3) outputs 2
        System.out.println("Remove value is " + S.pop()); // contents: (5) outputs 3
        System.out.println("Is the value empty? " + S.isEmpty()); // contents: (5) outputs false
        System.out.println(S.pop()); // contents: () outputs 5
        System.out.println("Value of stack " + S); // contents: () outputs true
        System.out.println(S.isEmpty()); // contents: () outputs true
        S.push(7); // contents: (7)
        S.push(9); // contents: (7, 9)
        S.push(4); // contents: (7, 9, 4)
        System.out.println(S.size()); // contents: (7, 9, 4) outputs 3
        System.out.println(S.pop()); // contents: (7, 9, 4) outputs 4
        S.push(6); // contents: (7, 9, 6)
        S.push(8); // contents: (7, 9, 6, 8)
        System.out.println(S.pop()); // contents: (7, 9, 6) outputs 8
        System.out.println(S); // display the value of stacks
        System.out.println(S.peek()); // contents: (7, 9, 6) outputs 6
    } 
}
