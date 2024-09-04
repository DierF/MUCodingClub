import java.util.Scanner;

public class eyeofsauron
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        // the index of "(", which is also the number of "|" before the "("
        int left = s.indexOf("(");
        int right = s.length() - left - 2;

        if (left == right)
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
