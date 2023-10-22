import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class password
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Double[] rec = new Double[n];
        for (int i = 0; i < n; ++i)
        {
            sc.next();
            rec[i] = sc.nextDouble();
        }

        Arrays.sort(rec, Comparator.reverseOrder());

        double res = 0.0;
        for (int i = 0; i < n; ++i)
        {
            res += rec[i] * (i + 1);
        }
        
        System.out.println(res);

        sc.close();
    }
}
