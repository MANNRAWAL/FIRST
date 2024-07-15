package practice;

public class PalindromeRecursion {
    public static void main(String[] args) {
        String str = "nitins";
        boolean res = isPalindrome(str);
        System.out.println(res);
    }
public static boolean isPalindrome(String input)
{
    String first = input.substring(0,1);
    String last = input.substring(input.length()-1, input.length());

    if(input==null)
    {
        return false;
    }
    if(input.length()<=1)
    {
        return true;
    }

    if(!first.equals(last))
    {
        return false;
    }
    else
    {
        return isPalindrome(input.substring(1, input.length()-1));
    }

}
}