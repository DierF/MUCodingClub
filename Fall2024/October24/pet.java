import java.util.Scanner;

public class pet
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int person = 0;
        int maximum = 0;
        for (int i = 1; i <= 5; i++)
        {
            int sum = 0;
            for (int j = 0; j < 4; j++)
            {
                sum += console.nextInt();
            }

            // Found new maximum
            if (sum > maximum)
            {
                maximum = sum;
                person = i;
            }
        }

        System.out.println(person + " " + maximum);
    }
}