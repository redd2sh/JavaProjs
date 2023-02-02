package redd2shprojs;
import java.util.*;

public class piDecimals {
     public static void main(String[] args) {
     Scanner scan  = new Scanner (System.in);
    
    double pi = Math.PI;
    System.out.print("Enter the number of pi decimal places (1 to 15): ");
    
    double places = scan.nextDouble();
    
    double roundoff = 10.0d;
    if (places <= 1 || places <= 15)
    {
        
        for (int x = 1; x < places; x++)
        {
            roundoff *= 10.0;
        }
        
        double piRoundOff = (Math.round(pi*roundoff)/roundoff);
        System.out.println("PI : " + piRoundOff);
     
    }
     }
}
