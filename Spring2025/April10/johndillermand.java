import java.util.Scanner;

public class johndillermand
{

    public static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int height = console.nextInt();
        int width = console.nextInt();

        char[][] grid = new char[height][width];
        for (int i = 0; i < height; i++)
        {
            String line = console.next();
            for (int j = 0; j < width; j++)
            {
                grid[i][j] = line.charAt(j);
            }
        }

        char start = grid[0][0];
        grid[0][0] = '.';
        dfs(grid, 0, 0, start == '#' ? 'O' : '#');

        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public static void dfs(char[][] grid, int row, int col, char c)
    {
        int height = grid.length;
        int width = grid.length;
        for (int[] direction : directions)
        {
            int x = row + direction[0];
            int y = col + direction[1];
            if (x < 0 || x >= height || y < 0 || y >= width)
            {
                // Out of bounds
                continue;
            }
            if (grid[x][y] != c)
            {
                // Not right character
                continue;
            }
            grid[x][y] = '.';
            dfs(grid, x, y, c == '#' ? 'O' : '#');
        }
    }
}
