public class QuickSort{
    public static void main(String[] args)
    {
        int arr[]={15,9,7,13,12,16,4,18,11};
        int leng=arr.length;

        QuickSort qs=new QuickSort();
        qs.quickSortRecursion(arr, 0, leng-1);
        qs.printArray(arr);
    }

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

    void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
