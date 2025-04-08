import java.util.ArrayList;
import java.util.Scanner;

public class consecutiveprimesums
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();

        // true for not prime, false for prime
        boolean[] sieve = new boolean[n];
        for (int i = 2; i < n; i++)
        {
            if (!sieve[i])
            {
                // use long to prevent overflow
                for (long j = (long)i * i; j < n; j += i)
                {
                    sieve[(int)j] = true;
                }

                primes.add(i);
            }
        }

        int count = 0; // total number of consecutive primes
        int result = 0; // total sum
        for (int i = 0; i < primes.size(); i++)
        {
            int counter = 0; // current number of consecutive primes
            int accumulator = 0; // current sum
            for (int j = i; j < primes.size(); j++)
            {
                counter++;
                accumulator += primes.get(j);
                if (accumulator >= n)
                {
                    break;
                }

                if (!sieve[accumulator] && counter > count)
                {
                    count = counter;
                    result = accumulator;
                }
            }
        }

        System.out.println(result);
    }
}
