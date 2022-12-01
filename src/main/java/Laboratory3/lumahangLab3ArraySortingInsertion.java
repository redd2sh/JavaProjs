package Laboratory3;
public class lumahangLab3ArraySortingInsertion {
    public static void main(String[] args) {
        Sorting sort=new Sorting();
        
        int [] array = {3,5,7,8,4,2,1,9,6};
        sort.insertionSort(array);
        
        for(int i = 0; i<array.length; ++i){
            System.out.print(array[i] + " ");
        }
    }   
}

 class Sorting
 {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]){
                array[j+1] = array[j];
                j--;
            }
            // At this point we've exited, so j is either -1
            // ot it's at the first element where current >= a[j]
            array[j+1] = current;
        }
     }
 }