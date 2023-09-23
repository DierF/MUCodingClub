import java.util.Scanner;

public class nodup
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");

        for (int i = 0; i < s.length; ++i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (s[j].equals(s[i]))
                {
                    System.out.println("no");

                    sc.close();
                    return;
                }
            }
        }
        System.out.println("yes");

        sc.close();
    }
}