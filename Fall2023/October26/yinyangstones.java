import java.util.Scanner;

public class yinyangstones
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        
        int white = 0;
        int black = 0;

        for (int i = 0; i < s.length(); ++i)
        {
            if (s.charAt(i) == 'W')
            {
                ++white;
            }
            else
            {
                ++black;
            }
        }
        
        System.out.println(white == black ? "1" : "0");

        sc.close();
    }
}
