import java.util.Scanner;

public class patuljci
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int[] numbers = new int[9];
        int total = 0; // Sum of all numbers
        for (int i = 0; i < 9; i++)
        {
            numbers[i] = console.nextInt();
            total += numbers[i];
        }

        int first = -1; // The index of the first number to exclude
        int second = -1; // The index of the second number to exclude
        for (int i = 0; i < 9; i++)
        {
            for (int j = i + 1; j < 9; j++)
            {
                if (total - numbers[i] - numbers[j] == 100)
                {
                    first = i;
                    second = j;
                }
            }
        }

        for (int i = 0; i < 9; i++)
        {
            if (i != first && i != second)
            {
                System.out.println(numbers[i]);
            }
        }
    }
}
