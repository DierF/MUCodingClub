import java.util.Scanner;

public class tornbygge
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] width = new int[n];
        for (int i = 0; i < n; ++i)
        {
            width[i] = scanner.nextInt();
        }

        int count = 1;
        for (int i = 1; i < n; ++i)
        {
            if (width[i] > width[i - 1])
            {
                ++count;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}