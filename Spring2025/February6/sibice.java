import java.util.Scanner;

public class sibice
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int w = console.nextInt();
        int h = console.nextInt();

        // The maximum acceptable length of any match
        int maximum = (int)Math.sqrt(w * w + h * h);

        for (int i = 0; i < n; i++)
        {
            int length = console.nextInt();
            if (length <= maximum)
            {
                System.out.println("DA");
            }
            else
            {
                System.out.println("NE");
            }
        }
    }
}
