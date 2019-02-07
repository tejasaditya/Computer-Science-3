public class Merge_Sort
{
    public static void main(String[] args)
    {
        int[] array = {9,8,7,6,5,4,3,2,1};
        System.out.println("Original Array");
        for(int i = 0;i<array.length;i++)
        {
            System.out.print(array[i]);
            System.out.print(" ");
        }

        System.out.println("");
        System.out.println("Sorted Array");
        mergeSort(array,array.length);
        for (int i = 0;i<array.length;i++)
        {
            System.out.print(array[i]);
            System.out.print(" ");
        }

    }
    static void merge(int[] arr, int[] leftArray, int[] rightArray, int indexOne, int indexTwo) {
        int i = 0, j = 0, k = 0;
        while (i < indexOne && j < indexTwo)
        {
            if (leftArray[i] <= rightArray[j])
            {
                arr[k++] = leftArray[i++];
            }
            else
                {
                arr[k++] = rightArray[j++];
            }
        }
        while (i < indexOne)
        {
            arr[k++] = leftArray[i++];
        }
        while (j < indexTwo)
        {
            arr[k++] = rightArray[j++];
        }
    }
   static void mergeSort(int[] arr, int n) {
        if (n < 2) {
            return;
        }
        int midIndex = n / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[n - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = arr[i];
        }
        for (int i = midIndex; i < n; i++) {
            rightArray[i - midIndex] = arr[i];
        }
        mergeSort(leftArray, midIndex);
        mergeSort(rightArray, n - midIndex);

        merge(arr, leftArray, rightArray, midIndex, n - midIndex);
    }
}
