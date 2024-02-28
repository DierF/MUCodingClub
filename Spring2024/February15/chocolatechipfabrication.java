import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class chocolatechipfabrication
{
    public static class Pair
    {
        public int x;
        public int y;
        public int d;

        public Pair(int a, int b, int v)
        {
            x = a;
            y = b;
            d = v;
        }
    }

    public static int[][] d = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] graph = new char[n][m];
        for (int i = 0; i < n; ++i)
        {
            String s = sc.next();
            for (int j = 0; j < m; ++j)
            {
                graph[i][j] = s.charAt(j);
            }
        }

        boolean[][] visited = new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < m; ++j)
            {
                if (graph[i][j] == '-')
                {
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = true;
                }
            }
        }
        for (int i = 0; i < n; ++i)
        {
            if (!visited[i][0])
            {
                q.add(new Pair(i, 0, 1));
                visited[i][0] = true;
            }
            if (!visited[i][m - 1])
            {
                q.add(new Pair(i, m - 1, 1));
                visited[i][m - 1] = true;
            }
        }
        for (int j = 1; j < m - 1; ++j)
        {
            if (!visited[0][j])
            {
                q.add(new Pair(0, j, 1));
                visited[0][j] = true;
            }
            if (!visited[n - 1][j])
            {
                q.add(new Pair(n - 1, j, 1));
                visited[n - 1][j] = true;
            }
        }
        int ans = 0;
        while (!q.isEmpty())
        {
            Pair curr = q.remove();
            ans = Math.max(ans, curr.d);
            for (int i = 0; i < 4; ++i)
            {
                int x = curr.x + d[i][0];
                int y = curr.y + d[i][1];
                if (x < 0 || x >= n || y < 0 || y >= m)
                {
                    continue;
                }
                if (visited[x][y])
                {
                    continue;
                }
                q.add(new Pair(x, y, curr.d + 1));
                visited[x][y] = true;
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
