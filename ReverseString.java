package practice;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hel lo";
        // using string buffer
        //StringBuffer s = new StringBuffer(input);
        //StringBuffer result = s.reverse();
        //System.out.println(result);


        //without using string buffer
        String result = "";
        for(int i = input.length()-1;i>=0;i--)
        {
            result = result + input.charAt(i);
        }
        System.out.println(result);

    }
}
