import java.util.Scanner;

public class vote
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        for (int _t = 0; _t < t; ++_t)
        {
            int n = sc.nextInt();

            int     total = 0;
            int     maxi  = 0;
            int     idx   = -1;
            boolean only  = true;

            for (int i = 0; i < n; ++i)
            {
                int val = sc.nextInt();

                total += val;
                if (val > maxi)
                {
                    maxi = val;
                    idx  = i;
                    only = true;
                }
                else if (val == maxi)
                {
                    only = false;
                }
            }

            if (!only)
            {
                System.out.println("no winner");
            }
            else if (maxi > total / 2)
            {
                System.out.println("majority winner " + (idx + 1));
            }
            else
            {
                System.out.println("minority winner " + (idx + 1));
            }
        }

        sc.close();
    }    
}
