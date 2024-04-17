import java.util.Scanner;
public class absurdistan2 {
    public static double connect (double n, int c, int k, double[][] answers)
    {
        if (c >= n || c + k > n) return 1;
        if (answers[c][k] >= 0) return answers[c][k];

        double result;
        if (k == 0)
        {
            result = (n-c)/(n-1) * connect (n, c+1, 0, answers) + (c-1)/(n-1) * connect (n, c, 1, answers);
        }
        else
        {
            result = c/(n-1) * connect (n, c+k, 1, answers) + (n-c-k)/(n-1) * connect (n, c, k+1, answers);
        }
        answers[c][k] = result;
        return result;
    }

    public static double connected (int n)
    {
        double[][] answers = new double[n][n];
        for (int r = 0; r < n; r++)
        {
            for (int c = 0; c < n; c++)
            {
                answers[r][c] = -1;
            }
        }
        return connect (n, 2, 0, answers);
    }

    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        double result = connected (n);
        System.out.printf ("%.12f\n", result);
        console.close();
    }
}