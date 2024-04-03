import java.util.Scanner;
import java.util.ArrayList;

public class divisors
{
    public static int[] primes =
    {
        2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,
        113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,
        239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,
        373,379,383,389,397,401,409,419,421,431
    };

    public static class PrimeFactorization 
    {
        public static final int FACTORSIZE = primes.length;
        public int[] factors;

        public PrimeFactorization()
        {
            factors = new int[FACTORSIZE];
        }

        public PrimeFactorization(PrimeFactorization other)// Unused but logical that it might exist.
        {
            factors = other.factors.clone();
        }

        public PrimeFactorization(PrimeFactorization other, int indexToIncrement)
        {
            factors = other.factors.clone();
            factors[indexToIncrement]++;
        }

        public void product(PrimeFactorization other)
        {
            for (int factorIndex = 0; factorIndex < FACTORSIZE; factorIndex++)
            {
                factors[factorIndex] += other.factors[factorIndex];
            }
        }

        public void quotient(PrimeFactorization other)
        {
            for (int factorIndex = 0; factorIndex < FACTORSIZE; factorIndex++)
            {
                factors[factorIndex] -= other.factors[factorIndex];
            }
        }

        public long factorCount()
        {
            long count = 1;
            for (int factorIndex = 0; factorIndex < FACTORSIZE; factorIndex++)
            {
                count *= factors[factorIndex] + 1;
            }
            return count;
        }
    }

    public static void main(String[] args)
    {
        ArrayList<PrimeFactorization> factorizations = new ArrayList<PrimeFactorization>(432);
        factorizations.add(new PrimeFactorization());
        factorizations.add(new PrimeFactorization());
        for (int i = 2; i < 432; i++)
        {
            int primeIdx = 0;
            for (; i % primes[primeIdx] != 0; ++primeIdx);// Proceed to divisor
            factorizations.add(new PrimeFactorization(factorizations.get(i/primes[primeIdx]), primeIdx));
        }
        int n, k;
        Scanner console = new Scanner(System.in);
        while (console.hasNext())
        {
            n = console.nextInt();
            k = console.nextInt();
            int low = Math.min(k, n - k);
            int high = Math.max(k, n - k);
            PrimeFactorization current = new PrimeFactorization();
            for (int i = high + 1; i <= n; i++)
            {
                current.product(factorizations.get(i));
            }
            for (int i = 1; i <= low; i++)
            {
                current.quotient(factorizations.get(i));
            }
            System.out.println(current.factorCount());
        }
        console.close();
    }

}
