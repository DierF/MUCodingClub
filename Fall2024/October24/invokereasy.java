import java.util.Scanner;

public class invokereasy
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double a = console.nextInt();
        double b = console.nextInt();
        double c = console.nextInt();
        double d = console.nextInt();

        double denum = c * c + d * d;
        System.out.println((a * c + b * d) / denum + " " + (b * c - a * d) / denum);
    }
}
