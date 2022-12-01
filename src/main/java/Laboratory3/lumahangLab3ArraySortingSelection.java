package Laboratory3;
public class lumahangLab3ArraySortingSelection {
    public static void main(String[] args) {
        Sorting sort=new Sorting();
        
        int [] array = {3,5,7,8,4,2,1,9,6};
        sort.selectionSort(array);
        
        for(int i = 0; i<array.length; ++i){
            System.out.print(array[i] + " ");
        }
    }   
}
class Sorting
{
    public static void selectionSort(int[]array) {
        for (int i = 0; i < array.length; i++) 
        {
            int min = array[i];
            int minId = i;
            
            for (int j = i+1; j < array.length; j++) 
            {
                if (array[j] < min) 
                {
                    min = array[j];
                    minId = j;
                }
            }
            // Swapping
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
}