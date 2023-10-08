import java.util.Scanner;

public class fiftyshades
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i < n; ++i)
        {
            String s = sc.next().toLowerCase();

            if (s.contains("pink") || s.contains("rose"))
            {
                ++cnt;
            }
        }
        
        if (cnt == 0)
        {
            System.out.println("I must watch Star Wars with my daughter");
        }
        else
        {
            System.out.println(cnt);
        }

        sc.close();
    }
}
