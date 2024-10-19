import java.util.Scanner;

public class zamka
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int l = console.nextInt();
        int d = console.nextInt();
        int x = console.nextInt();

        int first = 0;
        boolean foundFirst = false;
        int second = 0;
        for (int num = l; num <= d; num++)
        {
            if (!foundFirst && sumOfDigits(num) == x)
            {
                first = num;
                foundFirst = true;
            }

            if (sumOfDigits(num) == x)
            {
                second = num;
            }
        }

        System.out.println(first);
        System.out.println(second);
    }

    public static int sumOfDigits(int num)
    {
        int sum = 0;
        while (num > 0)
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
