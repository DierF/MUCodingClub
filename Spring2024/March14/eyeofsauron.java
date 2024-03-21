import java.util.Scanner;

public class eyeofsauron
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int idx = s.indexOf("()");
        if (s.substring(0, idx).equals(s.substring(idx + 2)))
        {
            System.out.println("correct");
        }
        else
        {
            System.out.println("fix");
        }

        sc.close();
    }
}