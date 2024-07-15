package practice;

import java.util.Arrays;

// Anagrams are 2 strings of same length and made of the same letters eg - ARMY and MARY
public class AnagramStrings {

    public static void main(String[] args) {
    String str1 = "ARM";
    String str2 = "MARY";

    AnagramStrings as = new AnagramStrings();
    boolean result = as.isAnagram(str1,str2);
    if(result)
    {
        System.out.println("YES, THEY ARE ANAGRAMS");
    }
    else
    {
        System.out.println("NOT ANAGRAMS");
    }
    }
    
    boolean isAnagram(String s,String t)
    {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
        if(Arrays.equals(arr1,arr2))
        {
            return true;
        }
        else
        return false;
    }
    
}
