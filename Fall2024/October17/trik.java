import java.util.Scanner;

public class trik
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        // Whether not or there exists a ball in A/B/C
        boolean A = true; // ball orginally at A
        boolean B = false;
        boolean C = false;

        String input = console.next();

        for (int index = 0; index < input.length(); index++)
        {
            char letter = input.charAt(index);

            if (letter == 'A')
            {
                // Swap A and B
                boolean temp = A;
                A = B;
                B = temp;
            }
            else if (letter == 'B')
            {
                // Swap B and C
                boolean temp = B;
                B = C;
                C = temp;
            }
            else
            {
                // Swap A and C
                boolean temp = A;
                A = C;
                C = temp;
            }
        }

        if (A)
        {
            System.out.println(1);
        }
        else if (B)
        {
            System.out.println(2);
        }
        else
        {
            System.out.println(3);
        }
    }
}
