import java.util.Scanner;

public class pizza2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(100.0 * (r - c) * (r - c) / (r * r));

        sc.close();
    }
}
