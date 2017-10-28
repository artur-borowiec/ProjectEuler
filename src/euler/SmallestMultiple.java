package euler;

public class SmallestMultiple
{
    static int smallestMultiple (int n)
    {
        int x = 1;
        while (!divisible(x, n))
        {
            x++;
        }
        return x;
    }

    static boolean divisible(int x, int n)
    {
        for (int i=1; i<=n; i++)
        {
            if (x%i!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(smallestMultiple(20));
    }
}
