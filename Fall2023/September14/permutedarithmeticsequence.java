import java.util.Arrays;
import java.util.Scanner;;

public class permutedarithmeticsequence
{
    public static boolean check(int[] data)
    {
        int gap = data[1] - data[0];
        for (int i = 1; i < data.length; ++i)
        {
            if (data[i] - data[i - 1] != gap)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int _t = 0; _t < t; ++_t)
        {
            int m = sc.nextInt();

            int[] data = new int[m];
            for (int i = 0; i < m; ++i)
            {
                data[i] = sc.nextInt();
            }

            if (check(data))
            {
                System.out.println("arithmetic");
                continue;
            }
            
            Arrays.sort(data);
            if (check(data))
            {
                System.out.println("permuted arithmetic");
            }
            else
            {
                System.out.println("non-arithmetic");
            }
        }

        sc.close();
    }
}
