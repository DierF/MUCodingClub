import java.util.Scanner;

public class deathknight
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int ans = 0;
        for (int i = 0; i < n; ++i)
        {
            String s = sc.nextLine();
            if (s.indexOf("CD") == -1)
            {
                ++ans;
            }
        }
        System.out.println(ans);

        sc.close();
    }
}