import java.util.Scanner;

public class sorttwonumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.min(a, b) + " " + Math.max(a, b));

        sc.close();
    }
}
