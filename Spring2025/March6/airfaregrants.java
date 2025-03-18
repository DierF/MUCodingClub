import java.util.Scanner;

public class airfaregrants
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
        {
            int price = console.nextInt();
            maximum = Math.max(maximum, price);
            minimum = Math.min(minimum, price);
        }

        // Report the most expensive trip to maximize reimbursement limit.
        int reimbursement = maximum / 2;

        // Buy the cheapest ticket to minimize payment.
        int actual = minimum;

        // Reimburse as much as possible.
        System.out.println(Math.max(0, actual - reimbursement));
    }
}