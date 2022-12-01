package Laboratory2;
import java.util.Scanner;
public class lumahangLab2ComOp {
    public static void main(String[] args) {
        Scanner reader =new Scanner (System.in);
        
        int a=0;
        // THIS IS AN EXAMPLE OF EQUAL COMPARISON
        System.out.print("Example of Equal Value :");
        a=reader.nextInt();
        
        if (a==5)
        {
            System.out.println("The number is 5");
        }
        
        // THIS IS AN EXAMPLE OF NOT EQUAL COMPARISON
        int b=0;
        
        System.out.print("Example of Not Equal Value :");
        b=reader.nextInt();
        
        if (b!=5)
        {
            System.out.println("The number is not a 5");
        }
        
        // THIS IS AN EXAMPLE OF GREATER THAN COMPARISON
        int c=0;
        
        System.out.print("Example of Greater than Value :");
        c=reader.nextInt();
        
        if (c > 5)
        {
            System.out.println("The number is greater than 5 ");
        }
        
        // THIS IS AN EXAMPLE OF GREATER THAN OR EQUAL TO COMPARISON
        int d=0;
        
        System.out.print("Example of Greater than or equal to Value :");
        d=reader.nextInt();
        
        if (d >= 5)
        {
            System.out.println("The number is greater than or equal to 5 ");
        }
        
        // THIS IS AN EXAMPLE OF LESS THAN COMPARISON
        int e=0;
        
        System.out.print("Example of Less Than Value :");
        e=reader.nextInt();
        
        if (e <= 5)
        {
            System.out.println("The number is less than to 5 ");
        }
    }
}
