import java.util.Scanner;

public class jobexpenses
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int res = 0;
        for (int i = 0; i < n; ++i)
        {
            int num = sc.nextInt();
            if (num < 0)
            {
                res -= num;
            }
        }
        System.out.println(res);

        sc.close();
    }
}