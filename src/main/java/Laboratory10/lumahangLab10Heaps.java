package Laboratory10;

public class lumahangLab10Heaps {
    public static void main (String [] args )
    {

        int [] arr = {6, 4, 5, 3, 2, 0, 1};

        Heapify hs = new Heapify();

        hs.sort(arr);

        // print array

        for (int a = 0; a < arr.length; a++)
        {
        System.out.print(arr[a] + " ");
        }
    }
}

class Heapify
{
    public void heapify (int array[], int size, int i)
    {
        // Find the largest among root , left and right child

        int largest = i;
        int leftchild=(2*i) + 1;
        int rightchild = (2*i)+ 2;

        if (leftchild < size && array[leftchild] > array[largest])
        {
            largest = leftchild;
        }

        if (rightchild < size && array[rightchild] > array[largest])
        {
            largest = rightchild;
        }

        //  Swap and continue heapifying if root is not largest

        if (largest!=i)
        {
            int swap  = array[i];
            array[i] = array[largest];
            array[largest]= swap;

            heapify(array, size, largest);
        }
    }
    
    public void sort (int arr[])
    {
        int n = arr.length;

        // Build max heapify

        for (int i = n /2 - 1; i>= 0; i--)
        {
            heapify(arr, n, i);
        }

        // Heap sort
        for (int i = n - 1; i >=0; i--)
        {
            int temp = arr[0];
            arr[0] =arr[i];
            arr[i] = temp;

            // Heapify root StackTraceElement
            heapify(arr, i , 0);
        }
    }
}


