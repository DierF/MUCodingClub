import java.util.Scanner;

public class andvag
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int m = console.nextInt();
        int q = console.nextInt();

        // union-find
        int[] parent = new int[n];
        for (int i = 0; i < n; i++)
        {
            parent[i] = i;
        }

        int[] filter = new int[n];

        for (int i = 0; i < m; i++)
        {
            int a = console.nextInt() - 1;
            int b = console.nextInt() - 1;
            int f = console.nextInt();

            join(parent, a, b);
            
            filter[a] |= f;
            filter[b] |= f;
        }

        for (int i = 0; i < n; i++)
        {
            // update filter for the ancestor of each group
            filter[find(parent, i)] |= filter[i];
        }

        for (int i = 0; i < q; i++)
        {
            int a = console.nextInt() - 1;
            int b = console.nextInt() - 1;
            a = find(parent, a);
            b = find(parent, b);

            if (a != b)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(Integer.bitCount(filter[find(parent, a)]));
            }
        }
    }

    public static int find(int[] parent, int n)
    {
        // find the ancestor if the group
        while (parent[n] != n)
        {
            n = parent[n];
        }
        return n;
    }

    public static void join(int[] parent, int a, int b)
    {
        // join the group of a and the group of b
        a = find(parent, a);
        b = find(parent, b);
        
        if (a == b)
        {
            // already the same group
            return;
        }

        parent[a] = b;
    }
}