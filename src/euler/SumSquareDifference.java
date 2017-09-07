package euler;

public class SumSquareDifference {

    public static long sum (int x)
    {
        if (x == 1)
            return 1;
        else
            return x + sum(x-1);
    }
    
    public static long squaressum (int x)
    {
        if (x == 1)
        {
            return 1;
        }
        else
        {
            return (x*x + squaressum(x-1));
        }
    }
    
    public static void main(String[] args) 
    {
        System.out.println((sum(100)*sum(100)) - squaressum(100));
    } 
}
