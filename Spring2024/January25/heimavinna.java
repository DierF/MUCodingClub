import java.util.Scanner;

public class heimavinna
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(";");

        int ans = 0;
        for (String num : s)
        {
            if (num.indexOf("-") == -1)
            {
                ++ans;
            }
            else
            {
                String[] temp = num.split("-");
                int a = Integer.parseInt(temp[0]);
                int b = Integer.parseInt(temp[1]);
                ans += b - a + 1;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
