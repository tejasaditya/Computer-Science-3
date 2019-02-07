public class QuickSort
{
    void sort(int arr[], int start, int end)
    {
        if (start < end)
        {
            int midNum = partition(arr, start, end);

            sort(arr, start, midNum-1);
            sort(arr, midNum+1, end);
        }
    }
    int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = (start - 1); // index of smaller element
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

        public static void main(String args[])
        {
            int arr[] = {2,5,6,7,3,4};
            int n = arr.length;
            QuickSort ob = new QuickSort();
            ob.sort(arr, 0, n-1);
        }
}
