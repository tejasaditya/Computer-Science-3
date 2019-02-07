public class Insertion_Sort
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
        array_sort(array);
        for (int i = 0;i<array.length;i++)
        {
                System.out.print(array[i]);
                System.out.print(" ");
        }

    }
    public static void array_sort(int[] array)
    {
        int length = array.length;
        int i, current, compare_id;
        for (i = 1; i<length;i++)
        {
            current = array[i];
            compare_id = i-1;

            while(compare_id>=0 && array[compare_id]>current)
            {
                int temp = array[compare_id+1];
                array[compare_id+1] = array[compare_id];
                array[compare_id] = temp;
                compare_id --;
            }
        }
    }
}
