import java.util.Scanner;

public class dicecup
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // # of occurrence of each sum
        int[] count = new int[n + m + 1];
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= m; j++)
            {
                count[i + j]++;
            }
        }

        // maximum # of occurrence of all possible sum
        int maximum_count = 0;
        for (int sum = 1; sum <= n + m; sum++)
        {
            if (count[sum] > maximum_count)
            {
                maximum_count = count[sum];
            }
        }

        for (int sum = 1; sum <= n + m; sum++)
        {
            if (count[sum] == maximum_count)
            {
                System.out.println(sum);
            }
        }
    }
}
