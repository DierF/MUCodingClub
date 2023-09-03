import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class synchronizinglists
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        while (n != 0)
        {
            int[] a1 = new int[n];
            int[] a2 = new int[n];

            for (int i = 0; i < n; ++i)
            {
                a1[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; ++i)
            {
                a2[i] = scanner.nextInt();
            }

            HashMap<Integer, Integer> m = new HashMap<>();
            for (int i = 0; i < n; ++i)
            {
                m.put(a1[i], i);
            }

            Arrays.sort(a1);
            Arrays.sort(a2);

            int[] res = new int[n];

            for (int i = 0; i < n; ++i)
            {
                res[m.get(a1[i])] = a2[i];
            }

            for (int x : res)
            {
                System.out.println(x);
            }

            System.out.println();
            
            n = scanner.nextInt();
        }

        scanner.close();
    }
}
