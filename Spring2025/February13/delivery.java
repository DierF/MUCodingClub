import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class delivery
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int k = console.nextInt();

        TreeMap<Integer, Integer> negative = new TreeMap<>();
        TreeMap<Integer, Integer> positive = new TreeMap<>();

        for (int i = 0; i < n; i++)
        {
            int location = console.nextInt();
            int amount = console.nextInt();
            if (location < 0)
            {
                // Negate negative locations so that
                //   they can be processed the same way as positive locations.
                negative.put(-location, amount);
            }
            else
            {
                positive.put(location, amount);
            }
        }

        System.out.println(deliver(k, positive) + deliver(k, negative));
    }

    public static int deliver(int k, TreeMap<Integer, Integer> targets)
    {
        /*
         * Use greedy approach to deliver mails from farthest to nearest.
         */
        int result = 0;
        // The amount of available space left to carry letter
        int capacity = 0;
        for (Map.Entry<Integer, Integer> entry : targets.descendingMap().entrySet())
        {
            int location = entry.getKey();
            int amount = entry.getValue();
            while (amount > 0)
            {
                // Still need to delivery mails to this location
                if (capacity == 0)
                {
                    // All space used up, need to reload
                    capacity = k;
                    // Distance to travel to reload
                    result += 2 * location;
                }
                // The amount can carry this turn
                int can = Math.min(amount, capacity);
                // Carry this turn
                amount -= can;
                // Update available space left
                capacity -= can;
            }
        }
        return result;
    }
}
