package practice;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "THIS IS A PROGRAM";
        Map<Character,Integer> m = new LinkedHashMap<Character, Integer>();
        int count = 1;



        for (int i =0; i<input.length();i++)
        {
            if(!m.containsKey(input.charAt(i)))
            {
                m.put(input.charAt(i), count);
            }
            else
            {
                m.put(input.charAt(i),m.get(input.charAt(i))+1);
            }
        }
        for(Entry<Character,Integer> entry:m.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey());
                break;
            }
        }

    }

}
