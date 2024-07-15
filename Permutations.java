package practice;

import java.util.*;

public class Permutations {
    
    public static void main(String[] args) {
        String str = "pal";
        List<String> permutations = generatePermutations(str);
        
        System.out.println("Permutations of " + str + " are:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
    
    // Function to generate all permutations of a string
    public static List<String> generatePermutations(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return result;
        }
        permute(str.toCharArray(), 0, result);
        return result;
    }
    
    // Recursive function to generate permutations
    private static void permute(char[] chars, int index, List<String> result) {
        if (index == chars.length - 1) {
            result.add(new String(chars));
        } else {
            for (int i = index; i < chars.length; i++) {
                swap(chars, index, i);  // Swap current index with i
                permute(chars, index + 1, result);  // Recur for next index
                swap(chars, index, i);  // Backtrack: restore the array
            }
        }
    }
    
    // Utility function to swap two characters in a character array
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
