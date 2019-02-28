import java.util.ArrayList;
import java.util.List;

public class StringMatch
{
    List<String> rearrange(String str)
    {

        List<String> stringarr = new ArrayList<String>();
        List<String> remainingstr = new ArrayList<String>();
        if (stringarr.size() == 0) {
            System.out.println("if condition");
            stringarr.add("" + str.charAt(0));
        }
        System.out.println(str.charAt(0));
        System.out.println(stringarr);
        for (int i=1; i<str.length(); i++)
        {
            if (!Character.toString(str.charAt(i)).equals(stringarr.get(stringarr.size()-1))){
                stringarr.add(""+str.charAt(i));
            }
            else
            {
                remainingstr.add(""+str.charAt(i));
            }
        }
        while(remainingstr.toString() != str)
        {
            rearrange(remainingstr.toString());
        }
        return stringarr;
    }

    public static void main(String args[])
    {
        System.out.println(new StringMatch().rearrange("aabb"));
    }
}
