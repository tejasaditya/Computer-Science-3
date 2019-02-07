public class HeapDriver
{
    public static void main(String[] args)
    {
        int[] test = {1,8,4,7,6,9};
        HeapDS heap = new HeapDS(test);
        for( int i = 0; i<test.length;i++)
        {
            System.out.print(","+test[i]);
        }
        System.out.println("");
        heap.insert(12);
        for( int i = 0; i<test.length;i++)
        {
            System.out.print(","+test[i]);
        }
        System.out.println("");
        heap.makeHeap(test);
        for (int i = 0; i < test.length / 2; i++) {
            System.out.print("Parent:" + test[i]);
            if ((2*i)+1 < test.length)
            {
                System.out.print(" ChildOne:" + test[2 * i+1]);
            }
            if ((2*i)+2 < test.length)
            {
                System.out.print(" ChildTwo:" + test[2 * i+2]);
            }
            System.out.println();
        }
    }
}

class HeapDS
{
    private int[] arr;

    HeapDS(int[] arr) {
        this.arr = arr;
    }
    void makeHeap(int[] arr)
    {
        int len = arr.length;
        for (int pos = (len / 2); pos >= 1; pos--)
        {
          if ((2*pos)+1 < arr.length)
          {
              if (arr[pos] > arr[(2*pos)+1])
              {
                  int tmp;
                  tmp = arr[pos];
                  arr[pos] = arr[(2*pos)+1];
                  arr[(2*pos)+1] = tmp;
                  makeHeap(arr);
              }
          }
            if ((2*pos)+2 < arr.length)
            {
                if (arr[pos] > arr[(2*pos)+2])
                {
                    int tmp;
                    tmp = arr[pos];
                    arr[pos] = arr[(2*pos)+2];
                    arr[(2*pos)+2] = tmp;
                    makeHeap(arr);
                }
            }
            /*  if ((2*pos)+1 < arr.length || ((2*pos)+2 < arr.length))
            {
                /if (arr[pos] > arr[(2*pos)+1] || arr[pos] > arr[(2*pos)+2])
                {

                    if (arr[(2*pos)+1] < arr[(2*pos)+2])
                    {
                        int tmp;
                        tmp = arr[pos];
                        arr[pos] = arr[(2*pos)+1];
                        arr[(2*pos)+1] = tmp;
                        makeHeap(arr);
                    }

                    // Swap with the right child and makeHeap
                    // the right child
                    else {
                        int tmp;
                        tmp = arr[pos];
                        arr[pos] = arr[(2*pos)+2];
                        arr[(2*pos)+2] = tmp;
                        makeHeap(arr);
                    }
                }
            }*/
        }
    }
    void insert(int num)
    {
        int i;
        int[] arrTemp = new int[arr.length + 1];
        for (i = 0; i<arr.length;i++)
        {
            arrTemp[i] = arr[i];
        }
        arrTemp[i] = num;
        this.arr = arrTemp;
        makeHeap(this.arr);
    }
    void deleteMin()
    {
       // int temp = arr[0];
        int[] arrTemp = new int[arr.length - 1];
        for (int i = 0; i<arr.length - 1;i++)
        {
            arrTemp[i] = arr[i+1];
        }
        this.arr = arrTemp;
        makeHeap(this.arr);
    }
    int getMin()
    {
        return arr[0];
    }
}