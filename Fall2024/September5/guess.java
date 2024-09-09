import java.util.Scanner;

public class guess
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int lower_bound = 1;
        int upper_bound = 1000;

        while (lower_bound <= upper_bound)
        {
            int mid = (lower_bound + upper_bound) / 2;
            System.out.println(mid);

            String answer = sc.next();
            if (answer.equals("correct"))
            {
                // your guess is correct
                break;
            }
            if (answer.equals("lower"))
            {
                // the number I am thinking of is lower than your guess
                upper_bound = mid - 1;
            }
            else
            {
                // the number I am thinking of is higher than your guess
                lower_bound = mid + 1;
            }
        }

        sc.close();
    }
}
