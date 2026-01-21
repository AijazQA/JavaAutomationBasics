public class QuickSort{
    public static void main(String[] args)
    {
        int arr[]={15,9,7,13,12,16,4,18,11};
        int leng=arr.length;

        QuickSort qs=new QuickSort();
        //call of recursive function through main class object qs
        qs.quickSortRecursion(arr, 0, leng-1);
        //call of print method of sorted array
        qs.printArray(arr);
    }

    //partioning the array into two left side lower than pivot and right side higher than pivot
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[low];
        while (low<=high)
        {
            while(arr[low]<pivot)
            {
                low++;
            }
            while(arr[high]>pivot)
            {
                high--;
            }
//after partioning swapping the numbers where low and high meets condition
            if(low<=high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;

                low++;
                high--;
            }
        }
        return low;
    }
//Repeating the partioning to rest of the sub array that we found dusring first partioning
    void quickSortRecursion(int arr[], int low, int high)
    {
        int pointer=partition(arr, low, high);

        if(low<pointer-1)
        {
            quickSortRecursion(arr, low, pointer-1);
        }

        if(pointer<high)
        {
            quickSortRecursion(arr, pointer, high);
        }
    }
//print the sorted array
    void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


