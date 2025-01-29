import java.util.Scanner;

public class generalizedfizzbuzz
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int a = console.nextInt();
        int b = console.nextInt();

        int fizzbuzz = 0;
        int fizz = 0;
        int buzz = 0;

        for (int i = 1; i <= n; i++)
        {
            if (i % a == 0 && i % b == 0)
            {
                fizzbuzz++;
            }
            else if (i % a == 0)
            {
                fizz++;
            }
            else if (i % b == 0)
            {
                buzz++;
            }
        }

        System.out.println(fizz + " " + buzz + " " + fizzbuzz);
    }
}
