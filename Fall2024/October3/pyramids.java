import java.util.Scanner;

public class pyramids
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // the number of blocks remain
        int block = sc.nextInt();

        // the maximum height that can be built
        int height = 0;

        // the side length of the next level
        int side = 1;

        // while there are enough blocks for the next level
        while (block >= side * side)
        {
            block -= side * side;
            height++;
            side += 2;
        }

        System.out.println(height);
    }
}
