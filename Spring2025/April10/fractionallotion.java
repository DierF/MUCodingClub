import java.util.Scanner;

public class fractionallotion
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        while (console.hasNext())
        {
            int n = Integer.parseInt(console.next().substring(2));

            // 1/x + 1/y = 1/n
            // => y = (nx)/(x - n), n < x <= 2n
            int count = 0;
            for (int x = n + 1; x <= 2 * n; x++)
            {
                if (n * x % (x - n) == 0)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
