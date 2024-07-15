package practice;

public class fibonacci 
{

int input ;

public int fibo(int input)
{   
    if(input <=1)
    {
        return input;
    }
    else
    {
        return fibo(input - 1) + fibo(input - 2);
    }
}

    public static void main(String[]args)
    {
        fibonacci f = new fibonacci();
        int ans = f.fibo(7);
        System.out.println(ans);
    }
}