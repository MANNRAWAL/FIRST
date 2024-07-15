package practice;

import java.util.HashSet;
import java.util.Set;

public class isoGram
{   

    static boolean isIsoGram(String s)
    {
        boolean isIsoGram = true;
        char[] ch = s.toCharArray();
        Set<Character> chSet = new HashSet<Character>();

        for (Character c : ch)
            {
                if(chSet.contains(c))
                {
                    isIsoGram= false;
                }
                else
                {
                    chSet.add(c);
                }

            }
        return isIsoGram;
    }


    public static void main(String[]args)
    {
        System.out.println(isIsoGram("Xenodrome"));
    }
}