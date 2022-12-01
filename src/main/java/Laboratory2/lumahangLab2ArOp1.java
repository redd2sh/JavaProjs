package Laboratory2;
public class lumahangLab2ArOp1 {
    public static void main (String []args){
        int fnum=10, snum=5, total=0;

        // THIS IS AN ADDITION OPERATOR
        total=fnum + snum;
        System.out.println("ADDITION :" + total);
        // System.out.println("Addition of numbers" + (fnum + snum));

        // THIS IS A SUBTRACTION OPERATOR
        total=fnum - snum;
        System.out.println("SUBTRACTION: " + total);

        // THIS IS A MULTIPLICATION OPERATOR
        total=fnum * snum;
        System.out.println("MULTIPLICATION: " + total);

        // THIS IS AN EXAMPLE OF DIVISION OPERATOR
        total=fnum / snum;
        System.out.println("DIVISION: " + total);
        
        // THIS IS AN INCREMENT VALUE
        // fnum++; //
        fnum=fnum + 1;
        System.out.println("INCREMENT " + fnum);
        
        // THIS IS DECREMENT
        fnum--;
        System.out.println("DECREMENT " + fnum); 
    }
}