import java.util.Scanner;

public class goatrope
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x  = sc.nextInt();
        int y  = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int minX = Math.min(Math.abs(x - x1), Math.abs(x - x2));
        int minY = Math.min(Math.abs(y - y1), Math.abs(y - y2));

        if (x >= x1 && x <= x2)
        {
            System.out.println((double)minY);
        }
        else if (y >= y1 && y <= y2)
        {
            System.out.println((double)minX);
        }
        else
        {
            System.out.println(Math.sqrt(minX * minX + minY * minY));
        }

        sc.close();
    }    
}
