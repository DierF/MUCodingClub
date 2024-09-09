import java.util.Scanner;

public class echoechoecho
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(s + " " + s + " " + s);

        sc.close();
    }
}
