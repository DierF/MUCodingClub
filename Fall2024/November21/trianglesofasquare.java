import java.util.Scanner;

public class trianglesofasquare
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int x1 = console.nextInt();
        int y1 = console.nextInt();
        int x2 = console.nextInt();
        int y2 = console.nextInt();

        if (isCorner(x1, y1) && isCorner(x2, y2))
        {
            // Both points are at corners of the square.
            // Already have two triangles
            System.out.println(0);
        }
        else if (isCorner(x1, y1) || isCorner(x2, y2))
        {
            // Only one of the two points is at a corner of the square.
            // One side is a triangle and the other side need one more line.
            System.out.println(1);
        }
        else
        {
            // Both points are at sides of the square.
            // Both sides need one more line.
            System.out.println(2);
        }
    }

    public static boolean isCorner(int x, int y)
    {
        return (x == 0 || x == 2024) && (y == 0 || y == 2024);
    }
}
