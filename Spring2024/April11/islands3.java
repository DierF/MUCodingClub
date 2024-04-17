import java.util.Scanner;
public class islands3 {
    public static void expand(int[][] regions, int r, int c, int id)
    {
        if (r < 0 || r >= regions.length || c < 0 || c >= regions[r].length || regions[r][c] < -1 || regions[r][c] > 0) return;
        regions[r][c] = id;
        expand(regions, r-1, c, id);
        expand(regions, r+1, c, id);
        expand(regions, r, c-1, id);
        expand(regions, r, c+1, id);
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int rows = console.nextInt();
        int columns = console.nextInt();
        console.nextLine();
        char[][] map = new char[rows][columns];
        int[][] regions = new int[rows][columns];
        for (int r = 0; r < map.length; ++r)
        {
            String line = console.nextLine();
            for (int c = 0; c < map[r].length; ++c)
            {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'W')
                    regions[r][c] = -2;
                else if (map[r][c] == 'C')
                    regions[r][c] = -1;
            }
        }
        int count = 0;
        for (int r = 0; r < regions.length; ++r)
        {
            for (int c = 0; c < regions[r].length; ++c)
            {
                if (regions[r][c] == 0)
                {
                    expand (regions, r, c, ++count);
                }
            }
        }
        System.out.println(count);
        console.close();
    }
}