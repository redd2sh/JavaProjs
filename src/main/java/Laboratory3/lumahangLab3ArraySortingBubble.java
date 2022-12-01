package Laboratory3;
public class lumahangLab3ArraySortingBubble {
    public static void main(String[] args) {
        Sorting sort=new Sorting();
        
        int [] array = {4,2,1,5,3};
        sort.bubbleSort(array);
        
        for(int i = 0; i<array.length; ++i){
            System.out.print(array[i] + " ");
        }
    }   
}
class Sorting
{
    public static void bubbleSort(int[] a)
    {
        boolean sorted = false;
        int temp;
        while(!sorted)
        {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++)
            {
                if (a[i] > a[i+1])
                {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}