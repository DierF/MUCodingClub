import java.util.Scanner;

public class permutationdescent
{
    public static void main(String[] args)
    {
        int[][] dp = new int[101][100];
        dp[1][0] = 1;
        for (int i = 2; i <= 100; ++i)
        {
            dp[i][0] = 1;
            dp[i][i - 1] = 1;
            for (int j = 1; j <= i - 2; ++j)
            {
                dp[i][j] = dp[i - 1][j - 1] * (1 + i - 2 - j + 1) + dp[i - 1][j] * (1 + j);
                dp[i][j] %= 1001113;
            }
        }

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int t_case = 1; t_case <= t; ++t_case)
        {
            sc.nextInt();
            int k = sc.nextInt();
            int v = sc.nextInt();
            System.out.println(t_case + " " + dp[k][v]);
        }

        sc.close();
    }
}