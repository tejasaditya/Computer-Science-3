import java.util.Stack;
import java.util.Vector;

public class StackDriver
{
    Stack<Integer> st = new Stack<Integer>();
    void stackPush(Stack<Integer> stack, int item)
    {
        st.push(item);
    }

    void stackPop(Stack<Integer> stack)
    {
        System.out.println("Items :");

        for(int i = 0; i < st.size(); i++)
        {
            System.out.println((Integer) st.pop());
        }
    }

   void stackFirst(Stack<Integer> stack)
    {
        System.out.println("Top ELement : " +(Integer) stack.peek());
    }

   void stackSearch(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position " + pos);
    }
}
