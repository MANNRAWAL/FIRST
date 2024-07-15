package practice;
import java.util.HashMap;
import java.util.Map;
public class countWords {
    public static void main(String[]args)
    {
        String str = "Please subscribe to the youtube channel Xplor youtube   youtube to the limit";
        Map<String,Integer> map= new HashMap<String,Integer>();
        Integer count = 1; 
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i], count);
            }
            else
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        for(String x : map.keySet())
        {
            System.out.println("The count of the word "+x+" is "+ map.get(x));
        }
    }

}
