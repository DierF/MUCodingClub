import java.util.Scanner;
import java.math.BigInteger;

public class runningsteps
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int p = console.nextInt();
        for (int i = 0; i < p; i++)
        {
            int k = console.nextInt();
            int s = console.nextInt();

            System.out.println(k + " " + solve(s / 2));
        }
    }

    public static long solve(int per_leg)
    {
        // Assume the number of one step strides is x.
        // Then the number of two step strides is at least x.
        // So the minimum number of total distance per_leg is x + 2x = 3x.
        // Therefore the upper bound of x is 3x <= per_leg, thus x <= per_leg / 3.
        long result = 0;
        for (int x = 0; x <= per_leg / 3; x++)
        {
            if ((per_leg - x) % 2 != 0)
            {
                // This case of x number of one step strides is invalid.
                // Because total distance of two step strides is not even.
                continue;
            }
            int two_step = (per_leg - x) / 2;
            long possibility_per_leg = combination(x + two_step, x);
            result += possibility_per_leg * possibility_per_leg;
        }
        return result;
    }

    public static long combination(int n, int r)
    {
        // Combination nCr = n! / (r! * (n - r)!) = n! / r! / (n - r)!
        BigInteger result = BigInteger.ONE;
        // Calculate n! / r!
        for (long i = r + 1; i <= n; i++)
        {
            result = result.multiply(BigInteger.valueOf(i));
        }
        // Divide (n - r)!
        for (long i = 2; i <= n - r; i++)
        {
            result = result.divide(BigInteger.valueOf(i));
        }
        return result.longValue();
    }
}
