import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveRepeatedCharacters
{
    // creates a frequency table of characters in the string, the characters are the key and have an integer value of count
    public Map<Character, Integer> createDictionary(String str) {
        Map<Character, Integer> frequencyTable = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (frequencyTable.containsKey(str.charAt(i))) {
                frequencyTable.put(str.charAt(i), frequencyTable.get(str.charAt(i)) + 1); // if character key already exists, increase the associated value by one
                }
            else {
                frequencyTable.put(str.charAt(i), 1); // else make a new key with associated value one
                 }
        }
        return frequencyTable;
    }

    // build a string with only the character keys, hence no repetition of characters
    public String deleteRepeatedCharacters(String str)
    {
        Map<Character, Integer> frequencyTable = createDictionary(str); // create frequency map of characters in string
        StringBuilder finalString = new StringBuilder();
        Iterator it = frequencyTable.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            finalString.append((Character)pair.getKey()); // add the each character key to the string
        }
        return finalString.toString();
    }

    public static void main (String args[])
    {
        String str = "aabbccdd";
        System.out.println(new RemoveRepeatedCharacters().deleteRepeatedCharacters(str));
    }
}
