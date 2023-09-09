import java.util.Scanner;

public class quickbrownfox
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int _n = 0; _n < n; ++_n)
        {
            boolean[] has = new boolean[26];

            String s = scanner.nextLine().toLowerCase();
            for (int i = 0; i < s.length(); ++i)
            {
                if (Character.isLowerCase(s.charAt(i)))
                {
                    has[s.charAt(i) - 'a'] = true;
                }
            }

            String res = "";
            boolean miss = false;
            for (int i = 0; i < 26; ++i)
            {
                if (!has[i])
                {
                    res += (char)(i + 'a');
                    miss = true;
                }
            }

            if (miss)
            {
                System.out.println("missing " + res);
            }
            else
            {
                System.out.println("pangram");
            }
        }

        scanner.close();
    }
}