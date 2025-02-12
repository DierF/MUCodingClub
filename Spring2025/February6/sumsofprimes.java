import java.util.Scanner;

public class sumsofprimes
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        // sieve[i] is false if i is a prime number
        boolean[] sieve = new boolean[n];
        for (int i = 2; i * i < n; i++)
        {
            if (!sieve[i])
            {
                // i is a prime number
                for (int j = i * i; j < n; j += i)
                {
                    // cross out all multiples of i
                    sieve[j] = true;
                }
            }
        }
        
        long result = 0;
        for (int i = 2; i < n; i++)
        {
            if (!sieve[i])
            {
                result += i;
            }
        }

        System.out.println(result);
    }
}
