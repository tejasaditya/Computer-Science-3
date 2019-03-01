import java.util.*;

public class FrequencyStringMatch {
    // creates a frequency table of characters in the string, the characters are the key and have an integer value of count
    public Map<Character, Integer> createDictionary(String str) {
        Map<Character, Integer> charfreq = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (charfreq.containsKey(str.charAt(i))) {
                charfreq.put(str.charAt(i), charfreq.get(str.charAt(i)) + 1); // if character key already exists, increase the associated value by one
            } else {
                charfreq.put(str.charAt(i), 1); // else make a new key with associated value one
            }
        }
        return charfreq;
    }
    // returns character with the highest frequency from the frequency table excluding the passed in character
    // then reduces the count of the most frequent character by one
    public Character highFreqChar(Map<Character, Integer> charfreq, Character excludeChar){
        Character mostfrequent = null; // the character
        Integer highestfrequency = 0; //frequency of character
        Iterator it = charfreq.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if (charfreq.get(pair.getKey()) > highestfrequency && (Character)pair.getKey() != excludeChar)
            {
                highestfrequency = charfreq.get(pair.getKey());
                mostfrequent = (Character)pair.getKey();
            }
        }
        charfreq.put(mostfrequent,highestfrequency - 1);
        //mostfrequent = charfreq.Collections.max(charfreq.values()); // an alternate method of getting the max value but requires Two-way map implementation

        return mostfrequent;
    }
    // creates a string in order of frequency conditioning that no character repeats right after itself
    public String noMatchString(String str)
    {
        Map<Character, Integer> charfreq = createDictionary(str); // create frequency table
        char mostfrequent = highFreqChar(charfreq,null); //get the first character with highest frequency
        StringBuilder newstr = new StringBuilder(""+mostfrequent); // create a new string with the character
        try {
            for (int i = 1; i < str.length(); i++) {
                mostfrequent = highFreqChar(charfreq, mostfrequent); // get the most frequent character and then pass it as the excluded character next time
                newstr.append(mostfrequent); // append the string with character returned from highFreqChar function
            }
        }
        catch (NullPointerException e) // occurs when it is not possible for the highFreqChar function to return a character other than the excluded character
        {
            System.out.println("The program cannot run on this string");
            return null;
        }
        return newstr.toString();
    }

    public static void main (String args[]){
        String str = "aabbcccccccdd";
        System.out.println(new FrequencyStringMatch().noMatchString(str));

    }
}