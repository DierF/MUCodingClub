import java.util.Scanner;

public class shatteredcake
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int w = console.nextInt();
        int n = console.nextInt();

        int area = 0;
        for (int i = 0; i < n; ++i)
        {
            int a = console.nextInt();
            int b = console.nextInt();

            area += a * b;
        }

        // Area = Width * Height
        System.out.println(area / w);
    }
}
