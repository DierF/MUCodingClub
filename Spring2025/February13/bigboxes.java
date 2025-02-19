import java.util.Scanner;

public class bigboxes
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int k = console.nextInt();

        int[] items = new int[n];
        for (int i = 0; i < n; i++)
        {
            items[i] = console.nextInt();
        }

        int low = 0, high = Integer.MAX_VALUE;
        while (low < high)
        {
            int guess = low + (high - low) / 2;
            if (check(k, items, guess))
            {
                // this guess is possible
                high = guess;
            }
            else
            {
                // guess is too low
                low = guess + 1;
            }
        }

        System.out.println(low);
    }

    public static boolean check(int k, int[] items, int limit)
    {
        // Check if it is possible to group them into k groups
        // while making the maximum weight does not exceed limit
        // Use greedy approach to put as many items as possible in each group
        int current = 0;
        while (current < items.length)
        {
            if (k == 0)
            {
                return false;
            }
            
            int accumulator = 0;
            while (current < items.length && accumulator + items[current] <= limit)
            {
                accumulator += items[current];
                current++;
            }
            --k;
        }
        return true;
    }
}
