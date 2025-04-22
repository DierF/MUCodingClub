import java.util.Scanner;
import java.util.TreeSet;

public class industrialspy
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int c = console.nextInt();
        for (int t = 0; t < c; t++)
        {
            String digits = console.next();

            TreeSet<Integer> result = new TreeSet<>();
            boolean[] used = new boolean[digits.length()];
            find(digits, result, used, 0);

            int answer = 0;
            for (Integer num : result)
            {
                if (isPrime(num))
                {
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }

    public static void find(String digits, TreeSet<Integer> result, boolean[] used, int accumulator)
    {
        result.add(accumulator);

        for (int i = 0; i < digits.length(); i++)
        {
            if (used[i])
            {
                // this digit is already used
                continue;
            }

            used[i] = true;
            find(digits, result, used, accumulator * 10 + (digits.charAt(i) - '0'));
            used[i] = false;
        }
    }

    public static boolean isPrime(int n)
    {
        if (n < 2)
        {
            return false;
        }

        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
