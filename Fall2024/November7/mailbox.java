import java.util.Scanner;

public class mailbox
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int n = console.nextInt();
        for (int i = 0; i < n; i++)
        {
            int k = console.nextInt();
            int m = console.nextInt();
            
            System.out.println(recurse(0, m, k));
        }
    }

    // 0 for not computed, otherwise already computed
    public static int[][][] memoization = new int[101][101][11];

    /**
        Maximum number of fire fire-crackers needed when:
        1. The range of possible maximum fire-crackers is in [a, b]
        2. The number of mailbox left is k
    } */
    public static int recurse(int a, int b, int k)
    {
        if (a == b)
        {
            // Only 1 possible value
            return 0;
        }

        if (k == 1)
        {
            // Only 1 mailbox left
            if (a != 0)
            {
                // The 
                // Sum of: a + 1, a + 2, ... , b - 1, b
                return (a + 1 + b) * (b - a) / 2;
            }
            else
            {
                // Sum of: a, a + 1, ... , b - 1, b
                return (a + b) * (b - a + 1) / 2;
            }
        }

        if (memoization[a][b][k] != 0)
        {
            // Already computed
            return memoization[a][b][k];
        }

        // The minimum number of fire-crackers needed in the worst case
        int best = Integer.MAX_VALUE;
        for (int guess = a + 1; guess <= b; guess++)
        {
            // Iterate through each case. (Guess each number in the range)

            // explode
            int exploded = guess + recurse(a, guess - 1, k - 1);

            // not explode
            int not_exploded = guess + recurse(guess, b, k);

            best = Math.min(best, Math.max(exploded, not_exploded));
        }

        // Update memoization table
        memoization[a][b][k] = best;

        return best;
    }
}