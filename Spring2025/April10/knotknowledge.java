import java.util.Scanner;

public class knotknowledge
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        int result = 0;
        for (int i = 0; i < 2 * n - 1; i++)
        {
            result ^= console.nextInt();
        }

        System.out.println(result);
    }    
}
