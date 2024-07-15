package practice;

public class CountCharacterOccurence {
    public static void main(String[] args) {
        String str = "MannM is trying to switch his job";
        int c = str.length();
        System.out.println(c);

        char[] arr = str.toCharArray();
        int i = arr.length;
        System.out.println(i);
            String string = String.valueOf("M");
            //System.out.println(str.length());
            //System.out.println(str.replaceAll(string,"").length());
            int count = str.length()-str.replaceAll(string,"").length();
            System.out.println("The count for M is "+count);
            
            }
            

            
        
        
    }

