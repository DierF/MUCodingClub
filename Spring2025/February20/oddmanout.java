import java.util.Scanner;

public class oddmanout
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        for (int i = 1; i <= n; i++)
        {
            int g = console.nextInt();
            int result = 0;
            for (int j = 0; j < g; j++)
            {
                result ^= console.nextInt();
            }
            System.out.println("Case #" + i + ": " + result);
        }
    }
}
