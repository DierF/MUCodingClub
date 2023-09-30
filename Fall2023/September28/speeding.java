import java.util.Scanner;

public class speeding
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int t1 = sc.nextInt();
        int d1 = sc.nextInt();

        int speed = 0;

        for (int i = 1; i < n; ++i)
        {
            int t2 = sc.nextInt();
            int d2 = sc.nextInt();

            speed = Math.max(speed, (d2 - d1) / (t2 - t1));

            t1 = t2;
            d1 = d2;
        }

        System.out.println(speed);

        sc.close();
    }
}