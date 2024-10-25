import java.util.Scanner;

public class sumkindofproblem
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int test_case = console.nextInt();

        for (int t = 0; t < test_case; t++)
        {
            int case_num = console.nextInt();

            int n = console.nextInt();

            int positive = n * (n + 1) / 2;
            int odd = n * n;
            int even = n * (n + 1);
            
            System.out.println(case_num + " " + positive + " " + odd + " " + even);
        }
    }
}
