import java.util.Scanner;

public class headguard
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine())
        {
            String s = sc.nextLine();

            String res = "";

            int i = 0;
            while (i < s.length())
            {
                int j = i + 1;
                while (j < s.length() && s.charAt(j) == s.charAt(i))
                {
                    ++j;
                }
                res += (j - i) + "" + s.charAt(i);
                i = j;
            }
            System.out.println(res);
        }

        sc.close();
    }
}