import java.util.*;

public class FrequencyStringMatch {
    public Map<Character, Integer> createDictionary(String str) {
        Map<Character, Integer> charfreq = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (charfreq.containsKey(str.charAt(i))) {
                charfreq.put(str.charAt(i), charfreq.get(str.charAt(i)) + 1);
            } else {
                charfreq.put(str.charAt(i), 1);
            }
        }
        return charfreq;
    }
    public Character highFreqChar(Map<Character, Integer> charfreq, Character excludeChar){
        Character mostfrequent = null;
        Integer highestfrequency = 0;
        Iterator it = charfreq.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if (charfreq.get(pair.getKey()) > highestfrequency && (Character)pair.getKey() != excludeChar)
            {
                highestfrequency = charfreq.get(pair.getKey());
                mostfrequent = (Character)pair.getKey();
                charfreq.put((Character)pair.getKey(),charfreq.get(pair.getKey()) - 1);
            }
        }
        //mostfrequent = charfreq.Collections.max(charfreq.values());
        return mostfrequent;
    }

    public String noMatchString(String str)
    {
        Map<Character, Integer> charfreq = createDictionary(str);
        char mostfrequent = highFreqChar(charfreq,null);
        StringBuilder newstr = new StringBuilder(""+mostfrequent);
        try {
            for (int i = 1; i < str.length(); i++) {
                mostfrequent = highFreqChar(charfreq, mostfrequent);
                newstr.append(mostfrequent);
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("The program cannot run on this string");
            return null;
        }
        return newstr.toString();
    }

    public static void main (String args[]){
            String str = "aabccccfddhhhebbbb";
            System.out.println(new FrequencyStringMatch().noMatchString(str));
    }
}