import java.util.Scanner;

public class barcelona
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int k = console.nextInt();

        for (int i = 1; i <= n; i++)
        {
            int num = console.nextInt();
            if (num == k)
            {
                if (i == 1)
                {
                    System.out.println("fyrst");
                }
                else if (i == 2)
                {
                    System.out.println("naestfyrst");
                }
                else
                {
                    System.out.println(i + " fyrst");
                }
                break;
            }
        }
    }
}
