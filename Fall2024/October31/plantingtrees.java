import java.util.Arrays;
import java.util.Scanner;

public class plantingtrees
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int count = console.nextInt();

        int[] days = new int[count];
        for (int i = 0; i < count; i++)
        {
            // Negate days to sort in non-increasing order
            days[i] = -console.nextInt();
        }

        Arrays.sort(days);

        int result = 0;
        for (int today = 1; today <= count; today++)
        {
            // Number of days to grow + date of today + 1 day to plant
            result = Math.max(result, -days[today - 1] + today + 1);
        }

        System.out.println(result);
    }
}
