import java.util.Scanner;

public class vauvau
{

    public static String check(int a, int b, int c, int d, int t)
    {
        boolean first  = t % (a + b) > 0 && t % (a + b) <= a;
        boolean second = t % (c + d) > 0 && t % (c + d) <= c;
        
        if (first && second)
        {
            return "both";
        }
        else if (first || second)
        {
            return "one";
        }
        else
        {
            return "none";
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int m = sc.nextInt();
        int g = sc.nextInt();

        System.out.println(check(a, b, c, d, p));
        System.out.println(check(a, b, c, d, m));
        System.out.println(check(a, b, c, d, g));

        sc.close();
    }
}