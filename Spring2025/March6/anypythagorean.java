import java.util.Scanner;

public class anypythagorean
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        for (int a = 1; a <= n / 2; a++)
        {
            for (int b = 1; b < n / 2; b++)
            {
                int c = n - a - b;
                if (a * a + b * b == c * c)
                {
                    System.out.println(a + " " + b + " " + c);
                    
                    return;
                }
            }
        }

        System.out.println("0 0 0");
    }
}
