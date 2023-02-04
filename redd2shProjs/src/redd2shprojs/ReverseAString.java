package redd2shprojs;
import java.util.*;

public class ReverseAString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt to get string
        System.out.print("Enter your string: ");
        String strng = scan.nextLine();
        int strlen = strng.length();
        
        // Reverse a string
        System.out.print("Reversed string: ");
        
        // iterate from the end of string going to the start
        for(int x = strlen -1; x>=0; x--)
        {
            System.out.print(strng.charAt(x));
        }
        // only for new line
        System.out.println();
    }
    
}
