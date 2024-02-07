import java.util.Scanner;

public class kcuddlanod
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.println(parse(a) >= parse(b) ? 1 : 2);

        sc.close();
    }

    public static int parse(String s)
    {
        char[] reversed = new char[s.length()];
        for (int i = 0; i < s.length(); ++i)
        {
            char temp = s.charAt(s.length() - 1 - i);
            if (temp == '2')
            {
                temp = '5';
            }
            else if (temp == '5')
            {
                temp = '2';
            }
            reversed[i] = temp;
        }
        return Integer.parseInt(String.valueOf(reversed));
    }
}
