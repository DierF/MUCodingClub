import java.util.Scanner;

public class lastfactorialdigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // read # of test cases
        int test_case = sc.nextInt();

        // iterate through each test case
        for (int i = 0; i < test_case; i++)
        {
            // read n
            // n <= 10
            int n = sc.nextInt();

            int factorial = factorial(n);

            // print the last digit
            System.out.println(factorial % 10);
        }
    }

    /**
     * Returns n!, assuming n! will not cause int overflow
     * 
     * @param n
     * @return factorial of n
     */
    public static int factorial(int n)
    {
        int result = 1;
        for (int i = 2; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }
}
