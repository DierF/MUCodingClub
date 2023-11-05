import java.util.Scanner;

public class espressobucks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] graph = new char[n][m];
        for (int i = 0; i < n; ++i)
        {
            String line = sc.next();
            for (int j = 0; j < m; ++j)
            {
                graph[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < m; ++j)
            {
                if (graph[i][j] == '#')
                {
                    continue;
                }
                if (i - 1 >= 0 && graph[i - 1][j] == 'E')
                {
                    continue;
                }
                if (i + 1 < n && graph[i + 1][j] == 'E')
                {
                    continue;
                }
                if (j - 1 >= 0 && graph[i][j - 1] == 'E')
                {
                    continue;
                }
                if (j + 1 < m && graph[i][j + 1] == 'E')
                {
                    continue;
                }
                graph[i][j] = 'E';
            }
        }

        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < m; ++j)
            {
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}