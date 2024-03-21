import java.util.Scanner;

public class pie
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int cases = 0; cases < t; ++cases)
        {
            int n = scanner.nextInt();
            int f = scanner.nextInt() + 1;
            
            double[] volume = new double[n];
            for (int i = 0; i < n; ++i)
            {
                int radius = scanner.nextInt();
                volume[i] = Math.PI * radius * radius;
            }

            double l = 0;
            double r = 4 * 100_000_000;

            while (r - l > 0.001)
            {
                double mid = l + (r - l) / 2.0;

                int cnt = 0;
                for (var v : volume)
                {
                    cnt += (int)(v / mid);
                }

                if (cnt < f)
                {
                    r = mid;
                }
                else
                {
                    l = mid;
                }
            }

            System.out.println(l);
        }

        scanner.close();
    }
}